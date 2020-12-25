package com.codido.hodor.core.common.util;

import com.google.gson.Gson;
import com.qiniu.common.QiniuException;
import com.qiniu.common.Zone;
import com.qiniu.http.Response;
import com.qiniu.storage.Configuration;
import com.qiniu.storage.UploadManager;
import com.qiniu.storage.model.DefaultPutRet;
import com.qiniu.util.Auth;
import lombok.extern.slf4j.Slf4j;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Date;

/**
 * @Author: BigStrong
 * @Date: 2019/6/13 下午9:41
 * 生成图片工具类
 */
@Slf4j
public class JBPictureUtil {

    /**
     * 生成图片方法
     *
     * @param str
     * @param outFile
     * @return
     * @throws Exception
     */
    public static byte[] createImage(String str, File outFile) throws Exception {
        //创造一个文字
        Font font = new Font("PingFangSC-Thin", Font.BOLD, 128);
        //获取font的样式应用在str上的整个矩形
        //Rectangle2D r = font.getStringBounds(str, new FontRenderContext(AffineTransform.getScaleInstance(1, 1), false, false));
        //获取单个字符的高度
        //int unitHeight = (int) Math.floor(r.getHeight());
        //获取整个str用了font样式的宽度这里用四舍五入后+1保证宽度绝对能容纳这个字符串作为图片的宽度
        //int width=(int)Math.round(r.getWidth())+1;
        int width = 128;
        //把单个字符的高度+3保证高度绝对能容纳字符串作为图片的高度
        //int height=unitHeight+3;
        int height = 128;
        //创建图片
        BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_BGR);
        Graphics2D graphics2D = image.createGraphics();

        // 增加下面代码使得背景透明
        image = graphics2D.getDeviceConfiguration().createCompatibleImage(width, height, Transparency.TRANSLUCENT);
        graphics2D.dispose();
        graphics2D = image.createGraphics();
        // 背景透明代码结束

        //下面写字
        //颜色设置为白色
        graphics2D.setColor(Color.white);
        //设置画笔字体
        graphics2D.setFont(font);
        //开启文字抗锯齿
        graphics2D.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
        //在图片中间画文字
        if(str.getBytes().length==str.length()){
            //半角
            graphics2D.drawString(str, 32, 112);
        }else{
            //全角
            graphics2D.drawString(str, 0, 112);
        }

        graphics2D.dispose();

        if (outFile != null) {
            //输出png图片到指定目录
            ImageIO.write(image, "png", outFile);
        }
        //返回数据流
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        boolean flag = ImageIO.write(image, "png", out);
        byte[] b = out.toByteArray();
        return b;
    }


    /**
     * 图片上传到七牛到方法
     */
    public static String picUploadQiNiu(File picFile,String accessKey,String secretKey,String bucket,String urlDomainContext,String fileName) throws QiniuException, FileNotFoundException {
        String retImgUrl = null;
        log.info("图片传到七牛开始");
        String imgUrl = null;//返回的url
        //String suffix = picFile.getName().substring(picFile.getName().lastIndexOf(".") + 1);

        //文件输入流
        FileInputStream fileInputStream = new FileInputStream(picFile);
        //构造一个带指定Zone对象的配置类
        Configuration cfg = new Configuration(Zone.zone2());//华南二区
        //...其他参数参考类注释
        UploadManager uploadManager = new UploadManager(cfg);
        //默认不指定key的情况下，以文件内容的hash值作为文件名
        String key = JBDateUtil.convertDateToString(new Date(), JBDateUtil.dateFormat_yyyy_MM_dd) + "/" +fileName;
        Auth auth = Auth.create(accessKey, secretKey);
        String upToken = auth.uploadToken(bucket);
        try {
            Response response = uploadManager.put(fileInputStream, key, upToken, null, null);
            //解析上传成功的结果
            DefaultPutRet putRet = new Gson().fromJson(response.bodyString(), DefaultPutRet.class);
            //log.info("七牛传图返回对象:" + putRet.toString());
            imgUrl = urlDomainContext + putRet.key + "?imageslim";
            log.info("图片传到七牛完成，文件路径是:" + imgUrl);
            retImgUrl = imgUrl;
        } catch (QiniuException ex) {
            Response r = ex.response;
            log.info("七牛传图异常:" + r.toString() + ",错误内容:" + r.bodyString());
        }
        return retImgUrl;
    }


    public static void main(String[] arg) {
//        GraphicsEnvironment eq=GraphicsEnvironment.getLocalGraphicsEnvironment();
//        Font[] list=eq.getAllFonts();
//        for (int i=0;i<list.length;i++){
//            System.out.println(list[i].getName());
//        }
        String fileName = OrderNoGeneratorUtil.generatorOrderNo(OrderNoGeneratorUtil.PICNAME_PRE_FLAG) + ".png";
        File file = new File("/Users/bpascal/Desktop/"+fileName);
        try {
            //生成图片
            JBPictureUtil.createImage("赖", file);
            //上传到七牛
            //String imgUrl = JBPictureUtil.picUploadQiNiu(file,"yAC2iK-zdCfoo-4RttvC9rmKi98TwVXtfvu6EQHl","f0JjZtkq77zoxXaneP2E7xcKPLKWNKALnlaUHFj5","caishiduo","http://images.rivendell.top/",fileName);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

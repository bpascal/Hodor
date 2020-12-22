package com.codido.hodor.core.util;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;

public class PictureUtil {

    public static void main(String[] args) {
        int imageWidth = 1920;//图片的宽度
        int imageHeight = 1080;//图片的高度
        BufferedImage image = new BufferedImage(imageWidth, imageHeight, BufferedImage.TYPE_INT_RGB);
        Graphics graphics = image.getGraphics();
        try
        {
            Font font=new Font("新宋体",Font.PLAIN,32);
            graphics.setFont(font);
            //graphics.drawImage();
            graphics.fillRect(0, 0, imageWidth, imageHeight);
            graphics.setColor(new Color(0,0,0));
            graphics.drawString("天天骑牛", 10, 100);
            graphics.drawString("www.caishiduo.com", 10, 136);
            ImageIO.write(image, "PNG", new File("/Users/bpascal/Desktop/abc.png"));//生成图片方法一
            //ImageIO,可以生成不同格式的图片，比如JPG,PNG,GIF.....
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
        graphics.dispose();//释放资源
    }
}

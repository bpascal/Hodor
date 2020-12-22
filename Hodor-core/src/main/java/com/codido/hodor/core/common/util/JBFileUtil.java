package com.codido.hodor.core.common.util;

import java.io.*;

/**
 * 文件处理工具
 * Created by bpascal on 2017/6/14.
 */
public class JBFileUtil {

    /**
     * 创建文件
     *
     * @param fileName
     * @return
     */
    public static boolean createFile(File fileName) throws Exception {
        boolean flag = false;
        try {
            if (!fileName.exists()) {
                fileName.createNewFile();
                flag = true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return flag;
    }

    /**
     * 读TXT文件内容
     *
     * @param filePath
     * @return
     */
    public static String readTxtFile(String filePath) throws Exception {
        String result = null;
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        try {
            File f = new File(filePath);
            fileReader = new FileReader(f);
            bufferedReader = new BufferedReader(fileReader);
            try {
                String read = null;
                while ((read = bufferedReader.readLine()) != null) {
                    result = result + read + "\r\n";
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (bufferedReader != null) {
                bufferedReader.close();
            }
            if (fileReader != null) {
                fileReader.close();
            }
        }
        System.out.println("读取出来的文件内容是：" + "\r\n" + result);
        return result;
    }

    /**
     * 写入文件
     *
     * @param content
     * @param filePath
     * @return
     * @throws Exception
     */
    public static boolean writeTxtFile(String content, String filePath) throws Exception {
        RandomAccessFile mm = null;
        boolean flag = false;
        FileOutputStream o = null;
        try {
            File file = new File(filePath);
            if (!file.exists()) {
                file.createNewFile();
            }
            o = new FileOutputStream(file);
            o.write(content.getBytes("UTF-8"));
            o.close();
            flag = true;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (mm != null) {
                mm.close();
            }
        }
        return flag;
    }


    /**
     * 追加文件内容
     *
     * @param filePath
     * @param content
     */
    public static void contentAddToTxt(String filePath, String content) {
        String str = new String(); //原有txt内容
        String s1 = new String();//内容更新
        try {
            File f = new File(filePath);
            if (!f.exists()) {
                // 不存在则创建
                f.createNewFile();
            }
            BufferedReader input = new BufferedReader(new FileReader(f));

            while ((str = input.readLine()) != null) {
                s1 += str + "\n";
            }
            input.close();
            s1 += content;

            BufferedWriter output = new BufferedWriter(new FileWriter(f));
            output.write(s1);
            output.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 保存文件到本地路径
     * @param file
     * @param filePath
     */
    public static String saveFileToDisk(File file,String filePath){
        String retUrl;
        String path = "/data/www/resources/images/";
        // String oldFileName = file.getFileName();
        // String extension =
        // oldFileName.substring(oldFileName.lastIndexOf("."));
        //String extension = file.getSuffix();
        //String fileName = String.valueOf(System.currentTimeMillis()) + "." + extension;
        try {
            BufferedInputStream fis = null;//file.getFileStream();
            File targetDir = new File(path);
            if (!targetDir.exists()) {
                targetDir.mkdirs();
            }
            //File target = new File(targetDir, fileName);
            File target = new File(targetDir, "");
            if (!target.exists()) {
                target.createNewFile();
                target.setExecutable(true, false);
                target.setReadable(true, false);
            }
            FileOutputStream fos = new FileOutputStream(target);
            byte[] bts = new byte[300];
            while (fis.read(bts, 0, 300) != -1) {
                fos.write(bts, 0, 300);
            }
            fos.close();
            fis.close();
            String fileRenderContextPath = "http://www.xiangzhixiangyu.com/resources/images/";
            //retUrl = fileRenderContextPath + fileName;
            retUrl = fileRenderContextPath + "";
            System.out.println("保存成功，文件路径为:" + retUrl);
        } catch (FileNotFoundException e) {
            System.out.println("FileNotFoundException:" + e.getLocalizedMessage());
            e.printStackTrace();
            retUrl = null;
        } catch (IOException e) {
            System.out.println("IOException:" + e.getLocalizedMessage());
            e.printStackTrace();
            retUrl = null;
        }
        return retUrl;
    }
}

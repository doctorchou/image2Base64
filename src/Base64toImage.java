import sun.misc.BASE64Decoder;


import java.io.*;
import java.util.Arrays;
import java.util.Base64;
import java.util.UUID;

/**
 对字节数组字符串进行Base64解码并生成图片
 */
public class Base64toImage {
    public static boolean base64toImage(File base64str, String savepath) throws FileNotFoundException {

        if (base64str == null) //判断图像数据为空
            return false;
        System.out.println("开始解码");
        BASE64Decoder decoder = new BASE64Decoder();
        InputStream inputStream=new FileInputStream(base64str);
        try {
            //Base64解码
            byte[] base64code = decoder.decodeBuffer(inputStream);
            System.out.println("解码完成");
            for (int i = 0; i < base64code.length; ++i) {
                if (base64code[i] < 0) {//调整异常数据
                    base64code[i] += 256;
                }
            }
            System.out.println("开始生成图片");
            //生成jpeg图片
            OutputStream out = new FileOutputStream(savepath);
            out.write(base64code);
            out.flush();
            out.close();
            System.out.println("图片转换完成");
            System.out.println("图片位置:"+savepath);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
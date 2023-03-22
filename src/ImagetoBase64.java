import sun.misc.BASE64Encoder;

import java.io.*;

/**
 *将图片文件转化为字节数组字符串，并对其进行Base64编码处理
 */
public class ImagetoBase64 {

        public static void imagetoBase64(File imgFile) throws IOException {
            InputStream in=new FileInputStream(imgFile);
            byte[] data=new byte[in.available()] ;
            System.out.println("读取图片文件");
            in.read(data);
            in.close();
            System.out.println("创建输出文件txt");
            File out=new File("E:\\Code\\JAVAintellij\\Base64Image\\src\\base64img.txt");
            FileOutputStream fout=new FileOutputStream(out);
            OutputStreamWriter dout=new OutputStreamWriter(fout);
            System.out.println("开始解码");
            BASE64Encoder encoder = new BASE64Encoder();
            System.out.println("解码完成写入文件");
            System.out.println("图片位置:"+out);
            dout.write(encoder.encode(data));
            dout.close();


    }
}

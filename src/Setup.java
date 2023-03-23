import java.io.*;

public class Setup {
    public static void main(String[] args) throws IOException {
        // 图片转base64

        String imgpath="E:\\Code\\JAVAintellij\\Base64Image\\src\\resourses\\image.jpg";
        File file=new File(imgpath);
        ImagetoBase64.imagetoBase64(file);



        // base64.txt转图片

        String base64code="E:\\Code\\JAVAintellij\\Base64Image\\src\\resourses\\base64img.txt";
        File file1=new File(base64code);
        boolean finish=Base64toImage.base64toImage(file1,"E:\\Code\\JAVAintellij\\Base64Image\\src\\codetoimg.jpg");


    }
}

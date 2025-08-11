import java.io.*;

public class ImageByteArray {
    public static void main(String[] args) {
        String src = "image.jpg", dest = "copy.jpg";
        try (FileInputStream fis = new FileInputStream(src);
             ByteArrayOutputStream baos = new ByteArrayOutputStream()) {
            byte[] buffer = new byte[1024]; int len;
            while ((len = fis.read(buffer)) != -1) baos.write(buffer, 0, len);
            byte[] imgBytes = baos.toByteArray();
            try (ByteArrayInputStream bais = new ByteArrayInputStream(imgBytes);
                 FileOutputStream fos = new FileOutputStream(dest)) {
                while ((len = bais.read(buffer)) != -1) fos.write(buffer, 0, len);
            }
            System.out.println("Image copied as byte array.");
        } catch (IOException e) { e.printStackTrace(); }
    }
}

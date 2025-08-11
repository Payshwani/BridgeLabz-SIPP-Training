import java.io.*;

public class BufferedFileCopy {
    public static void main(String[] args) throws IOException {
        String src = "largefile.dat", dest = "copy.dat";
        long start = System.nanoTime();
        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream(src));
             BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(dest))) {
            byte[] buffer = new byte[4096]; int len;
            while ((len = bis.read(buffer)) != -1) bos.write(buffer, 0, len);
        }
        long end = System.nanoTime();
        System.out.println("Buffered copy time: " + (end - start) / 1e6 + " ms");

        start = System.nanoTime();
        try (FileInputStream fis = new FileInputStream(src); FileOutputStream fos = new FileOutputStream("copy_unbuffered.dat")) {
            byte[] buffer = new byte[4096]; int len;
            while ((len = fis.read(buffer)) != -1) fos.write(buffer, 0, len);
        }
        end = System.nanoTime();
        System.out.println("Unbuffered copy time: " + (end - start) / 1e6 + " ms");
    }
}

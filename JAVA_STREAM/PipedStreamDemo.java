import java.io.*;

public class PipedStreamDemo {
    public static void main(String[] args) throws IOException {
        final PipedOutputStream pos = new PipedOutputStream();
        final PipedInputStream pis = new PipedInputStream(pos);
        Thread writer = new Thread(() -> {
            try {
                for (int i = 1; i <= 5; i++) {
                    pos.write(("Data" + i + "\n").getBytes());
                    Thread.sleep(100);
                }
                pos.close();
            } catch (Exception e) { e.printStackTrace(); }
        });
        Thread reader = new Thread(() -> {
            try {
                int b;
                while ((b = pis.read()) != -1) System.out.print((char)b);
                pis.close();
            } catch (IOException e) { e.printStackTrace(); }
        });
        writer.start(); reader.start();
        try { writer.join(); reader.join(); } catch (InterruptedException e) { e.printStackTrace(); }
    }
}

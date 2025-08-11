import java.io.*;

public class UpperToLowerFile {
    public static void main(String[] args) {
        String src = "input.txt", dest = "output.txt";
        try (BufferedReader br = new BufferedReader(new FileReader(src));
             BufferedWriter bw = new BufferedWriter(new FileWriter(dest))) {
            String line;
            while ((line = br.readLine()) != null) {
                bw.write(line.toLowerCase());
                bw.newLine();
            }
            System.out.println("File converted to lowercase.");
        } catch (IOException e) { e.printStackTrace(); }
    }
}

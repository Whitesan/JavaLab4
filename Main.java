import java.util.Random;
import static java.nio.file.StandardOpenOption.*;
import java.nio.file.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvxyz";
        Random rand = new Random();
        char ar[] = new char[1000];
        for (char c : ar) {
            c = chars.charAt(rand.nextInt(chars.length()));
            //System.out.println(c);
        }
        writeio(String.valueOf(ar));
        readio();

    }

    private static void writeUsingFileWriter(String data) {
        File file = new File("FileWriter.txt");
        FileWriter fr = null;
        try {
            fr = new FileWriter(file);
            fr.write(data);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // close resources
            try {
                fr.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    private static void writeio(String data) {

        Path path = Paths.get("./filename.txt");
        byte d[] = data.getBytes();

        try (OutputStream out = new BufferedOutputStream(Files.newOutputStream(path, CREATE, APPEND))) {
            out.write(d, 0, d.length);
        } catch (IOException x) {
            System.err.println(x);
        }
        
        // byte[] bytes = Files.readAllBytes(path);
        // System.out.println(new String(bytes));
    }

    private static void readio() {
        try( FileReader fr = 
      new FileReader("C:\\Users\\pankaj\\Desktop\\test.txt"))
      {
         int i; 
        while ((i=fr.read()) != -1) 
      System.out.print((char) i); 
        }  
      catch(Exception e)
      {

      }
    }
        
  
    
        
    
}
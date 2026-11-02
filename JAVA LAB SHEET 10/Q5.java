import java.io.*;

public class Q5 {
    public static void main(String[] args) {
        File src = new File("source.txt");
        try {
            if (!src.exists())                          // create sample source file if missing
                try (FileWriter fw = new FileWriter(src)) { fw.write("Line one\nLine two\nLine three\n"); }
            try (FileReader fr = new FileReader("source.txt");
                 FileWriter fw = new FileWriter("backup.txt")) {
                int ch;
                while ((ch = fr.read()) != -1)          // read one character at a time
                    fw.write(ch);                       // write it to the backup file
            }
            System.out.println("File copied: source.txt -> backup.txt");
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

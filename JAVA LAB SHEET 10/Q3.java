import java.io.*;

public class Q3 {
    public static void main(String[] args) {
        File f = new File("data.txt");
        try {
            if (!f.exists())                            // create sample file if it is missing
                try (FileWriter fw = new FileWriter(f)) {
                    fw.write("Java is a popular language.\nIt is object oriented.\nFile handling is easy.\n");
                }
            int lines = 0, words = 0, chars = 0;
            try (BufferedReader br = new BufferedReader(new FileReader(f))) {
                String line;
                while ((line = br.readLine()) != null) {
                    lines++;                                            // one more line
                    chars += line.length();                             // characters in the line
                    if (!line.trim().isEmpty())
                        words += line.trim().split("\\s+").length;      // split on spaces
                }
            }
            System.out.println("Lines     : " + lines);
            System.out.println("Words     : " + words);
            System.out.println("Characters: " + chars);
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

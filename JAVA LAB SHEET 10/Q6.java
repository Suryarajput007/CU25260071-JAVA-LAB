import java.io.*;
import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        File f = new File("notes.txt");
        try {
            if (!f.exists())                            // create sample notes file if missing
                try (FileWriter fw = new FileWriter(f)) {
                    fw.write("Java is fun.\nI love Java and Java loves me.\nPython is also nice.\n");
                }
            System.out.print("Enter word to search: ");
            String word = new Scanner(System.in).nextLine().trim().toLowerCase();
            int count = 0;
            if (!word.isEmpty())
                try (BufferedReader br = new BufferedReader(new FileReader(f))) {
                    String line;
                    while ((line = br.readLine()) != null) {
                        line = line.toLowerCase();
                        if (line.contains(word))                        // quick check on the line
                            for (String w : line.split("\\W+"))         // count exact word matches
                                if (w.equals(word)) count++;
                    }
                }
            System.out.println(count > 0 ? "Word found. Occurrences: " + count : "Word not found.");
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

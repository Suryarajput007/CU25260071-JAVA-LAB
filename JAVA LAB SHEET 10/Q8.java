import java.io.*;

public class Q8 {
    public static void main(String[] args) {
        File f = new File("input.txt");
        try {
            if (!f.exists())                            // create sample file if missing
                try (FileWriter fw = new FileWriter(f)) { fw.write("Hello World 2024\nJava is Fun 101\n"); }
            int vowels = 0, consonants = 0, digits = 0, spaces = 0;
            try (BufferedReader br = new BufferedReader(new FileReader(f))) {
                int ch;
                while ((ch = br.read()) != -1) {        // analyse every character
                    char c = Character.toLowerCase((char) ch);
                    if ("aeiou".indexOf(c) >= 0) vowels++;
                    else if (Character.isLetter(c)) consonants++;
                    else if (Character.isDigit(c)) digits++;
                    else if (c == ' ') spaces++;
                }
            }
            System.out.println("Vowels    : " + vowels);
            System.out.println("Consonants: " + consonants);
            System.out.println("Digits    : " + digits);
            System.out.println("Spaces    : " + spaces);
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

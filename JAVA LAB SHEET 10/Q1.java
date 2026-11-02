import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Q1 {
    public static void main(String[] args) {
        File f = new File("student.txt");               // file object (created on disk when written)
        try (FileWriter fw = new FileWriter(f)) {       // try-with-resources closes the file automatically
            fw.write("Student Name: Amit Sharma\n");
            fw.write("Roll Number : 101\n");
            fw.write("Course      : BCA\n");
            fw.write("Semester    : 2\n");
            System.out.println("File created and data written: " + f.getAbsolutePath());
        } catch (IOException e) {
            System.out.println("Error writing file: " + e.getMessage());
        }
    }
}

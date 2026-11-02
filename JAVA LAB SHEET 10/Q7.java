import java.io.File;
import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        System.out.print("Enter file name: ");
        File f = new File(new Scanner(System.in).nextLine().trim());
        System.out.println("Exists       : " + f.exists());
        if (!f.exists()) return;                        // nothing more to show
        System.out.println("File name    : " + f.getName());
        System.out.println("Absolute path: " + f.getAbsolutePath());
        System.out.println("File size    : " + f.length() + " bytes");
        System.out.println("Is file      : " + f.isFile());
        System.out.println("Is directory : " + f.isDirectory());
        System.out.println("Readable     : " + f.canRead());
        System.out.println("Writable     : " + f.canWrite());
    }
}

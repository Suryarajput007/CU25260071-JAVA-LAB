import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class Q12 {
    public static void main(String[] args) {
        ArrayList<String> patients = new ArrayList<>(Arrays.asList("Ravi", "Sita", "Mohan"));
        HashSet<String> ids = new HashSet<>(Arrays.asList("P101", "P102", "P103"));
        patients.add("Anita");                          // add
        ids.add("P104");
        ids.add("P102");                                // duplicate ID is ignored
        patients.remove("Sita");                        // remove
        ids.remove("P101");
        System.out.println("Search Mohan : " + patients.contains("Mohan"));   // search
        System.out.println("Search P101  : " + ids.contains("P101"));
        System.out.println("Patients: " + patients);    // display
        System.out.println("IDs     : " + ids);
    }
}

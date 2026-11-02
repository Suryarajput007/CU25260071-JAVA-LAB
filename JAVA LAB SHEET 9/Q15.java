import java.util.ArrayList;
import java.util.HashSet;
import java.util.ListIterator;
import java.util.Scanner;
import java.util.TreeSet;

public class Q15 {
    static class Student {
        int id; String name;
        Student(int id, String name) { this.id = id; this.name = name; }
        public String toString() { return id + " - " + name; }
    }

    static ArrayList<Student> list = new ArrayList<>();      // records in insertion order
    static HashSet<Integer> ids = new HashSet<>();           // unique IDs, no order
    static TreeSet<Integer> sortedIds = new TreeSet<>();     // unique IDs, sorted

    static int readInt(Scanner sc, String msg) {
        System.out.print(msg);
        try { return Integer.parseInt(sc.nextLine().trim()); }
        catch (NumberFormatException e) { System.out.println("Invalid number."); return -1; }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("\n1.Add 2.Remove 3.Search 4.Display 5.Count 6.Iterate 7.List/Set/SortedSet 0.Exit");
            if (!sc.hasNextLine()) break;
            String ch = sc.nextLine().trim();
            if (ch.equals("0")) { System.out.println("Bye!"); break; }
            switch (ch) {
                case "1" -> {
                    int id = readInt(sc, "ID: ");
                    if (id < 0) break;
                    System.out.print("Name: ");
                    String name = sc.nextLine().trim();
                    if (!ids.add(id)) System.out.println("ID already exists - not added.");   // add() false = duplicate
                    else { list.add(new Student(id, name)); sortedIds.add(id); System.out.println("Added."); }
                }
                case "2" -> {
                    int id = readInt(sc, "ID to remove: ");
                    if (ids.remove(id)) { list.removeIf(s -> s.id == id); sortedIds.remove(id); System.out.println("Removed."); }
                    else System.out.println("ID not found.");
                }
                case "3" -> {
                    int id = readInt(sc, "ID to search: ");
                    if (!ids.contains(id)) System.out.println("Not found.");
                    else for (Student s : list) if (s.id == id) System.out.println("Found: " + s);
                }
                case "4" -> { if (list.isEmpty()) System.out.println("No records."); for (Student s : list) System.out.println(s); }
                case "5" -> System.out.println("Total students: " + list.size());
                case "6" -> {
                    ListIterator<Student> it = list.listIterator();
                    System.out.println("Forward:");
                    while (it.hasNext()) System.out.println("  " + it.next());
                    System.out.println("Backward:");
                    while (it.hasPrevious()) System.out.println("  " + it.previous());
                }
                case "7" -> {
                    System.out.println("List (insertion order, duplicates allowed): " + list);
                    System.out.println("HashSet (unique, no order)               : " + ids);
                    System.out.println("TreeSet/SortedSet (unique, sorted)       : " + sortedIds);
                }
                default -> System.out.println("Invalid choice.");
            }
        }
    }
}

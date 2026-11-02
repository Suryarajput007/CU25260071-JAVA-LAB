public class Q3 {
    public static void main(String[] args) {
        String[] values = {"123", "12ab"};              // one valid and one invalid number
        for (String s : values) {
            try {
                int n = Integer.parseInt(s);            // converts String to int
                System.out.println(s + " -> " + n);
            } catch (NumberFormatException e) {         // string is not a valid integer
                System.out.println(s + " -> not a valid integer");
            }
        }
    }
}

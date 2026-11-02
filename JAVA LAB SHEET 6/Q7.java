public class Q7 {
    // 'throws' declares that this method may pass an Exception to its caller
    static void checkAge(int age) throws Exception {
        if (age < 18) throw new Exception("Age " + age + " is below 18 - not eligible");
        System.out.println("Age " + age + " - eligible");
    }

    public static void main(String[] args) {
        int[] ages = {25, 15};                          // one valid and one invalid age
        for (int a : ages) {
            try {
                checkAge(a);
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }
}

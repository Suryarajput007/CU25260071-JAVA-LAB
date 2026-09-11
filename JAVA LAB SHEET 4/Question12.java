class StudentMarks {
    int marks1;
    int marks2;
    int marks3;

    static String universityName = "COER University";

    StudentMarks(int marks1, int marks2, int marks3) {
        this.marks1 = marks1;
        this.marks2 = marks2;
        this.marks3 = marks3;
    }

    void displayAverage() {
        int total = marks1 + marks2 + marks3;
        double average = total / 3.0;

        System.out.println("University: " + universityName);
        System.out.println("Average Marks: " + average);
    }

    public static void main(String[] args) {
        StudentMarks s = new StudentMarks(80, 75, 90);

        s.displayAverage();
    }
}
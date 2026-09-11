class StudentGrade {
    String name;
    int marks;

    static int passingMarks = 40;

    StudentGrade(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    void displayGrade() {
        int studentMarks = marks;
        char grade;

        if (studentMarks >= 90)
            grade = 'A';
        else if (studentMarks >= 75)
            grade = 'B';
        else if (studentMarks >= 60)
            grade = 'C';
        else if (studentMarks >= passingMarks)
            grade = 'D';
        else
            grade = 'F';

        System.out.println("Name: " + name);
        System.out.println("Marks: " + studentMarks);
        System.out.println("Grade: " + grade);
    }

    public static void main(String[] args) {
        StudentGrade s = new StudentGrade("Aman", 82);

        s.displayGrade();
    }
}
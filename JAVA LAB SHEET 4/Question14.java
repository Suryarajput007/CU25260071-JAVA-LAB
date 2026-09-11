class Person {
    String name;
    int age;

    static String country = "India";

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void checkVotingEligibility() {
        int personAge = age;
        boolean eligible = personAge >= 18;

        System.out.println("Name: " + name);
        System.out.println("Country: " + country);

        if (eligible)
            System.out.println("Eligible for voting.");
        else
            System.out.println("Not eligible for voting.");
    }

    public static void main(String[] args) {
        Person p = new Person("Rahul", 20);

        p.checkVotingEligibility();
    }
}
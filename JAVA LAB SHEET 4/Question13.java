class Temperature {
    double celsius;

    static String scale = "Celsius";

    Temperature(double celsius) {
        this.celsius = celsius;
    }

    void convert() {
        double fahrenheit = (celsius * 9 / 5) + 32;
        double kelvin = celsius + 273.15;

        System.out.println("Temperature in " + scale + ": " + celsius);
        System.out.println("Fahrenheit: " + fahrenheit);
        System.out.println("Kelvin: " + kelvin);
    }

    public static void main(String[] args) {
        Temperature t = new Temperature(25);

        t.convert();
    }
}
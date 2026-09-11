class ElectricBill {
    int units;

    static double fixedCharge = 100;

    ElectricBill(int units) {
        this.units = units;
    }

    void calculateBill() {
        int usedUnits = units;
        double energyCharge;

        if (usedUnits <= 100) {
            energyCharge = usedUnits * 5;
        } else if (usedUnits <= 200) {
            energyCharge = 100 * 5 + (usedUnits - 100) * 7;
        } else {
            energyCharge = 100 * 5 + 100 * 7
                    + (usedUnits - 200) * 10;
        }

        double totalBill = fixedCharge + energyCharge;

        System.out.println("Units: " + usedUnits);
        System.out.println("Fixed Charge: " + fixedCharge);
        System.out.println("Total Bill: " + totalBill);
    }

    public static void main(String[] args) {
        ElectricBill e = new ElectricBill(250);

        e.calculateBill();
    }
}
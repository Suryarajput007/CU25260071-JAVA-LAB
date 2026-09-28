// Question 17: Printer + Scanner → MultiFunctionMachine
package question17;

interface Printer { void print(); }
interface Scanner { void scan(); }

class MultiFunctionMachine implements Printer, Scanner {
    private String machineName;
    private int machineId;

    public MultiFunctionMachine(String machineName, int machineId) {
        this.machineName = machineName;
        this.machineId = machineId;
    }
    public String getMachineName() { return machineName; }
    public void setMachineName(String machineName) { this.machineName = machineName; }
    public int getMachineId() { return machineId; }
    public void setMachineId(int machineId) { this.machineId = machineId; }

    @Override public void print() { System.out.println(machineName + ": printing document..."); }
    @Override public void scan()  { System.out.println(machineName + ": scanning document..."); }
}

public class Question17 {
    public static void main(String[] args) {
        MultiFunctionMachine m = new MultiFunctionMachine("HP LaserJet", 7001);
        System.out.println("Machine: " + m.getMachineName() + " | ID: " + m.getMachineId());
        m.print();
        m.scan();
        m.setMachineName("Canon Pixma");   // encapsulated update via setter
        System.out.println("Renamed to: " + m.getMachineName());
    }
}

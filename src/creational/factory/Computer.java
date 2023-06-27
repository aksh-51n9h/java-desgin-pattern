package creational.factory;

public abstract class Computer {
    private final String ram;
    private final String cpu;
    private final String hdd;

    public Computer(String ram, String cpu, String hdd) {
        this.ram = ram;
        this.cpu = cpu;
        this.hdd = hdd;
    }

    @Override
    public String toString() {
        return String.format("RAM: %s | HDD: %s | CPU: %s", ram, hdd, cpu);
    }
}

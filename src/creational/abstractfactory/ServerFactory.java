package creational.abstractfactory;

import creational.factory.Computer;
import creational.factory.Laptop;

public class ServerFactory implements ComputerAbstractFactory{
    private final String ram;
    private final String cpu;
    private final String hdd;

    public ServerFactory(String ram, String cpu, String hdd) {
        this.ram = ram;
        this.cpu = cpu;
        this.hdd = hdd;
    }

    @Override
    public Computer creatComputer() {
        return new Laptop(this.ram , this.cpu, this.hdd);
    }
}

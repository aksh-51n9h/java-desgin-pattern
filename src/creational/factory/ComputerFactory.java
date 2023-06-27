package creational.factory;

public class ComputerFactory {
    public static Computer getComputer(ComputerType type, String ram , String cpu, String hdd){
        if(type == ComputerType.SERVER) return new Server(ram, cpu, hdd);
        if(type == ComputerType.LAPTOP) return new Laptop(ram, cpu, hdd);

        return null;
    }
}

package creational.factory;

public class TestFactory {
    public static void main(String[] args) {
        System.out.println("FACTORY DESIGN PATTERN TEST CLASS");

        var laptop = ComputerFactory.getComputer(ComputerType.LAPTOP, "16GB", "Intel i5 12th Gen", "1TB SSD");
        var server = ComputerFactory.getComputer(ComputerType.SERVER, "32GB", "Intel Xenon 12th Gen", "10TB SSD");

        System.out.println("Laptop => " + laptop);
        System.out.println("Server => " + server);
    }
}

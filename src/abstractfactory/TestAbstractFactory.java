package abstractfactory;

public class TestAbstractFactory {
    public static void main(String[] args) {
        System.out.println("ABSTRACT FACTORY DESIGN PATTERN TEST CLASS");

        var laptopFactory = new LaptopFactory("16GB", "Intel i5 12th Gen", "1TB SSD");
        var serverFactory = new ServerFactory("32GB", "Intel Xenon 12th Gen", "10TB SSD");

        var laptop = ComputerFactory.getComputer(laptopFactory);
        var server = ComputerFactory.getComputer(serverFactory);

        System.out.println("Laptop => " + laptop);
        System.out.println("Server => " + server);
    }
}

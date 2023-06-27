package abstractfactory;

import factory.Computer;

public class ComputerFactory {
    public static Computer getComputer(ComputerAbstractFactory factory) {
        return factory.creatComputer();
    }
}

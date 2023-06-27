package creational.abstractfactory;

import creational.factory.Computer;

public class ComputerFactory {
    public static Computer getComputer(ComputerAbstractFactory factory) {
        return factory.creatComputer();
    }
}

package test.creational;

import test.creational.builder.Computer;
import test.creational.factory.CarFactory;
import test.creational.prototype.Employee;
import test.creational.singleton.SingletonDPEagerInitialization;
import test.creational.singleton.SingletonDPLazyInitialization;

public class MainCreationalDP {
    public static void main(String[] args) {
        //Singleton DP Eager Initialization
        SingletonDPEagerInitialization singletonDPEagerInitialization = SingletonDPEagerInitialization.getInstance();
        singletonDPEagerInitialization.display();

        //Singleton DP Lazy Initialization
        SingletonDPLazyInitialization singletonDPLazyInitialization = SingletonDPLazyInitialization.getInstance();
        singletonDPLazyInitialization.display();

        //Prototype
        Employee empSaurav = new Employee("Saurav", 38, "CSE");
        /// ///now prototype DP is used when object creation is heavy .
        Employee prototypeObject = (Employee) empSaurav.clone();
        prototypeObject.setName("Cloud");
        prototypeObject.setDept("TTS-Low Value Payment");
        /// / now printing the display object.
        prototypeObject.display(prototypeObject);

        //Builder
        Computer computer = new Computer.ComputerBuilder("AMD", "ZION", "Seagate").capacityHDD("1TB").capacityRAM("16GB").build();
        System.out.println(computer.toString());

        //FactoryDP
        CarFactory.createModal("maruti");
        CarFactory.createModal("thar");




    }
}

package test.creational.factory;

public class CarFactory {

    public static Car createModal(String carType) {
        return (Car) switch (carType) {
            case "tata"-> new Tata();
            case "maruti"-> new Maruti();
            case "mahindra"-> new Mahindara();
            default -> new IllegalArgumentException("No such car model exists");
        };
    }

}

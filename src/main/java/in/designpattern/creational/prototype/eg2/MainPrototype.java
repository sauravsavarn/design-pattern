package in.designpattern.creational.prototype.eg2;

public class MainPrototype {

    public static void main(String[] args) {
        Shoppe shoppe = new Shoppe("Reliance Smart", "Kharadi - pune", "12345");
        Mart mart = new Mart(shoppe);
        System.out.println("::::: displaying Mart Information ::::: ");
        System.out.println(mart.toString());


        Mart mart2 = (Mart) mart.clone();
        Shoppe shoppe2 = new Shoppe("Vijay Sales", "Patna", "54321");
        mart2.shoppe = shoppe2;
        System.out.println("::::: displaying Mart2 Information ::::: ");
        System.out.println(mart2.toString());
    }
}

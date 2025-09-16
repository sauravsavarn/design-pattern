package in.designpattern.creational.prototype.eg2;

public class Mart implements Cloneable{
    Shoppe shoppe;
    public Mart(Shoppe shoppe) {
        this.shoppe = shoppe;
    }

    @Override
    public String toString() {
        return "Mart{" +
                "shoppe--" + "Name : " + this.shoppe.name() + " - Location : " + this.shoppe.name() + " - Phone : " + this.shoppe.phone() +
                '}';
    }

    @Override
    public Object clone() {
        return new Mart(shoppe);
    }
 }

record Shoppe(String name, String location, String phone) {}
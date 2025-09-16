package in.designprinciple.SOLID.ocp.without;

public class Product {
    public String name;
    public Color color;
    public Size size;
    public double price;

    public Product(String name, Color color, Size size) {
        this.name = name;
        this.color = color;
        this.size = size;
    }

    public Product(String name, Color color, Size size, double price) {
        this.name = name;
        this.color = color;
        this.size = size;
        this.price = price;
    }

    @Override
    public String toString() {
        if (price == 0.0)
            return " [ Name : " + this.name + " - Color : " + this.color + " - Size : " + this.size + " ] ";
        else
            return " [ Name : " + this.name + " - Color : " + this.color + " - Size : " + this.size + " - Price : " + this.price + " ] ";
    }
}

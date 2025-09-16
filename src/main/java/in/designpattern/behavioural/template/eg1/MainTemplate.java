package in.designpattern.behavioural.template.eg1;

public class MainTemplate {
    public static void main(String[] args) {
        A3SizeRedColorPhamplet a3SizeRedColorPhamplet = new A3SizeRedColorPhamplet();
        a3SizeRedColorPhamplet.printPhamplate();

        A4SizePinkColorPhamplet a4SizePinkColorPhamplet = new A4SizePinkColorPhamplet();
        a4SizePinkColorPhamplet.printPhamplate();
    }
}

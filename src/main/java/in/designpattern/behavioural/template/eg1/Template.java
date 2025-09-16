package in.designpattern.behavioural.template.eg1;

public abstract class Template {
    public void printPhamplate() {
        String layout = setPhamplateLayout();
        String color = setPhamplateColor();

        //
        sendEventPhampletPrinted(layout, color);
    }

    public abstract String setPhamplateLayout();
    public abstract String setPhamplateColor();

    public void sendEventPhampletPrinted(String layout, String color) {
        System.out.println("Phamplate is printed with layout : " + layout + " & color : " + color);
    }
}

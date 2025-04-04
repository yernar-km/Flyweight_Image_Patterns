package task2_Flyweight_Pattern;

public class ConcreteMarkerStyle implements IMarkerStyle{
    private final String type;
    private final String color;
    private final String icon;

    public ConcreteMarkerStyle(String type, String color, String icon) {
        this.type = type;
        this.color = color;
        this.icon = icon;
    }
    @Override
    public void display(int x, int y) {
        System.out.println("Displaying " + type + " at " + x + " " + y + " with color " + color + " and icon " + icon);

    }
}

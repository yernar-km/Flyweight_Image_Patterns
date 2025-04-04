package task2_Flyweight_Pattern;

public class MapMarker {
    private final int x, y;
    private final IMarkerStyle style;

    public MapMarker(int x, int y, IMarkerStyle style) {
        this.x = x;
        this.y = y;
        this.style = style;
    }  public void display() {
        style.display(x, y);
    }
}

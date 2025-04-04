package task1_Proxy_Pattern;

import java.awt.*;

public class RealImage implements Iimage {
    private String filename;
    public RealImage(String filename) {
        this.filename = filename;
        loadHighResImage();
    } private void loadHighResImage() {
        System.out.println("Loading high resolution image " + filename);
    } public void display() {
        System.out.println("Displaying high-res image " + filename);
    }
}

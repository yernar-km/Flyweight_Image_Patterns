package task1_Proxy_Pattern;

import java.awt.*;

public class ProxyImage implements Iimage {
    private String filename;
    private RealImage realImage;

    public ProxyImage(String filename) {
        this.filename = filename;
        System.out.println("Displaying low-res " + filename);
    } public void display() {
        if (realImage == null) {
            realImage = new RealImage(filename);
        }
        realImage.display();
    }

}
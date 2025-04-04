package task1_Proxy_Pattern;

import java.awt.*;

public class ProtectionProxyImage implements Iimage {
    private String filename;
    private boolean isAgentLoggedIn;
    private ProxyImage proxyImage;

    public ProtectionProxyImage(String filename, boolean isAgentLoggedIn) {
        this.filename = filename;
        this.isAgentLoggedIn = isAgentLoggedIn;
            this.proxyImage = new ProxyImage(filename);
    } public void display() {
        proxyImage.display();
    } void uploadImage() {
        if (isAgentLoggedIn) {
            System.out.println("Uploading image " + filename);
        } else  {
            System.out.println("Unauthorized! Only agents can upload images");
        }

    }
}

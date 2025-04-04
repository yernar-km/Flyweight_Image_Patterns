package task1_Proxy_Pattern;

public class Main {
    public static void main(String[] args) {
        System.out.println("Using Virtual Proxy ");
        Iimage image1 = new ProxyImage("house1.jpg");
        image1.display();
        image1.display();

        System.out.println("Using Protection Proxy ");
        ProtectionProxyImage agentImage = new ProtectionProxyImage("house2.jpg", true);
        agentImage.uploadImage();
        agentImage.display();

        ProtectionProxyImage unauthorizedUserImage = new ProtectionProxyImage("house3.jpg", false);
        unauthorizedUserImage.uploadImage();
        unauthorizedUserImage.display();
    }
}

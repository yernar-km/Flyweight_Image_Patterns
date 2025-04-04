package task2_Flyweight_Pattern;

import java.util.*;
public class FlyweightDemo {
    public static void main(String[] args) {
        List<MapMarker> markers = new ArrayList<>();
        for (int i = 0; i < 111; i++)
            markers.add(new MapMarker(i, i, MarkerStyleFactory.getMarkerStyle("Hospital", "Red", "H")));

        for (int i = 0; i < 333; i++)
            markers.add(new MapMarker(i, i, MarkerStyleFactory.getMarkerStyle("Restaurant", "Blue", "R")));

        for (int i = 0; i < 666; i++)
            markers.add(new MapMarker(i, i, MarkerStyleFactory.getMarkerStyle("Gas Station", "Green", "G")));

        System.out.println("Total markers created: " + markers.size());
        System.out.println("Unique marker styles used: " + MarkerStyleFactory.getUniqueStylesCount());

        for (int i = 0; i < 10; i++)
            markers.get(i).display();
    }
}
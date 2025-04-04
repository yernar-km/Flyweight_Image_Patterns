package task2_Flyweight_Pattern;
import java.util.*;
public class MarkerStyleFactory {
    private static final Map<String, IMarkerStyle> styles = new HashMap<>();

    public static IMarkerStyle getMarkerStyle(String type, String color, String icon) {
        String key = type + "-" + color + "-" + icon;

        if (!styles.containsKey(key)) {
            IMarkerStyle newStyle = new ConcreteMarkerStyle(type, color, icon);
            styles.put(key, newStyle);
            System.out.println("Creating new style: " + key);
        }
        return styles.get(key);
    }

    public static int getUniqueStylesCount() {
        return styles.size();
    }
}


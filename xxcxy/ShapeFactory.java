package algorithm.lintcode.easy;

import java.util.HashMap;
import java.util.Map;

public class ShapeFactory {
    private static final String SQUARE = "Square";
    private static final String TRIANGLE = "Triangle";
    private static final String RECTANGLE = "Rectangle";
    private static final Map<String, Shape> ShapeStore = new HashMap<String, Shape>();

    static {
        ShapeStore.put(SQUARE, new Square());
        ShapeStore.put(TRIANGLE, new Triangle());
        ShapeStore.put(RECTANGLE, new Rectangle());
    }

    /**
     * @param shapeType a string
     * @return Get object of type Shape
     */
    public Shape getShape(String shapeType) {
        return ShapeStore.get(shapeType);
    }
}

interface Shape {
    void draw();
}

class Rectangle implements Shape {
    public void draw() {
        System.out.println(" ----");
        System.out.println("|    |");
        System.out.println(" ----");
    }
}

class Square implements Shape {
    public void draw() {
        System.out.println(" ----");
        System.out.println("|    |");
        System.out.println("|    |");
        System.out.println(" ----");
    }
}

class Triangle implements Shape {
    public void draw() {
        System.out.println("  /\\");
        System.out.println(" /  \\");
        System.out.println("/____\\");
    }
}

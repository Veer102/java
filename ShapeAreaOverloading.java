class Shape {
    // Overloaded method: Circle
    double area(double r) {
        return Math.PI * r * r;
    }

    // Overloaded method: Rectangle
    double area(double l, double b) {
        return l * b;
    }

    // Overloaded method: Square
    int area(int side) {
        return side * side;
    }
}

public class ShapeAreaOverloading {
    public static void main(String[] args) {
        Shape s = new Shape();
        System.out.println("Area of Circle (r=5.0)            : " + s.area(5.0));
        System.out.println("Area of Rectangle (l=4.0, b=6.0)  : " + s.area(4.0, 6.0));
        System.out.println("Area of Square (side=7)           : " + s.area(7));
    }
}

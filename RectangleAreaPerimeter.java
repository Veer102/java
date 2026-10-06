import java.util.Scanner;

class Rectangle {
    double length, width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    double area() {
        return length * width;
    }

    double perimeter() {
        return 2 * (length + width);
    }
}

public class RectangleAreaPerimeter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length and width of rectangle: ");
        double l = sc.nextDouble();
        double w = sc.nextDouble();

        Rectangle r = new Rectangle(l, w);
        System.out.println("Area      = " + r.area());
        System.out.println("Perimeter = " + r.perimeter());
    }
}

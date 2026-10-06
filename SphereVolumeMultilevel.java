import java.util.Scanner;

// Base class: accepts radius
class Radius {
    double r;

    void getRadius() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius of sphere: ");
        r = sc.nextDouble();
    }
}

// Level 1 Derived class: calculates circle area
class Circle extends Radius {
    double area() {
        return Math.PI * r * r;
    }
}

// Level 2 Derived class: calculates and displays sphere volume
class Sphere extends Circle {
    void volume() {
        System.out.println("Area of circle   = " + area());
        System.out.println("Volume of sphere = " + (4.0 / 3.0) * Math.PI * r * r * r);
    }
}

public class SphereVolumeMultilevel {
    public static void main(String[] args) {
        Sphere s = new Sphere();
        s.getRadius();
        s.volume();
    }
}

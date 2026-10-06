import java.util.Scanner;

// Custom Exception definition
class OddNumberException extends Exception {
    OddNumberException(String msg) {
        super(msg);
    }
}

public class EvenSquareCustomException {
    static int square(int n) throws OddNumberException {
        if (n % 2 != 0) {
            throw new OddNumberException("Input number must be an even number");
        }
        return n * n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an even number: ");
        int n = sc.nextInt();

        try {
            System.out.println("Square = " + square(n));
        } catch (OddNumberException e) {
            System.out.println("Custom Exception Caught: " + e.getMessage());
        }
    }
}

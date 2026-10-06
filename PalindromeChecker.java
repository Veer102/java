import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = sc.nextLine();

        // Using StringBuffer to reverse
        String rev = new StringBuffer(s).reverse().toString();

        System.out.println("Original String : " + s);
        System.out.println("Reversed String : " + rev);

        if (s.equalsIgnoreCase(rev)) {
            System.out.println("Result: \"" + s + "\" is a palindrome.");
        } else {
            System.out.println("Result: \"" + s + "\" is NOT a palindrome.");
        }
    }
}

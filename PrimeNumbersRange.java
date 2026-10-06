public class PrimeNumbersRange {
    public static void main(String[] args) {
        System.out.println("Prime numbers between 1 and 1000:");
        int count = 0;
        for (int n = 2; n <= 1000; n++) {
            boolean prime = true;
            for (int i = 2; i * i <= n; i++) {
                if (n % i == 0) {
                    prime = false;
                    break;
                }
            }
            if (prime) {
                System.out.print(n + " ");
                count++;
                if (count % 15 == 0) {
                    System.out.println();
                }
            }
        }
        System.out.println("\n\nTotal prime numbers: " + count);
    }
}

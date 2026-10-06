import java.util.Scanner;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class SimultaneousSquareThreading {
    public static void main(String[] args) throws InterruptedException {
        BlockingQueue<Integer> queue = new LinkedBlockingQueue<>();

        // Part 1: Thread to read a number
        Thread reader = new Thread(() -> {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter a number: ");
            queue.add(sc.nextInt());
        }, "ReaderThread");

        // Part 2: Thread to simultaneously calculate its square
        Thread calculator = new Thread(() -> {
            try {
                int n = queue.take(); // Waits for input to become available
                System.out.println("Square = " + (n * n));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }, "CalculatorThread");

        // Simultaneous execution to maximize CPU utilization
        reader.start();
        calculator.start();

        reader.join();
        calculator.join();
    }
}

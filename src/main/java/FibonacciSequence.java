import java.util.Scanner;

public class FibonacciSequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number you want to check: ");
        var n = sc.nextInt();

        int sum;
        int firstNumber = 0;
        int secondNumber = 1;

        if (n == 0 || n == 1) {
            System.out.println(n + " Fibonacci Sequence.");
        } else {
            boolean isFibonacciSequence = false;

            while (secondNumber <= n) {
                sum = firstNumber + secondNumber;
                firstNumber = secondNumber;
                secondNumber = sum;

                if (secondNumber == n) {
                    isFibonacciSequence = true;
                    break;
                }
            }
            if (isFibonacciSequence) {
                System.out.println(n + " Fibonacci Sequence.");
            } else {
                System.out.println(n + " Not Fibonacci Sequence.");
            }
        }
        sc.close();
    }
}

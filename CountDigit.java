import java.util.Scanner;

public class CountDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        long num = sc.nextLong();  // Use long here
        System.out.print("Enter digit to count: ");
        int digit = sc.nextInt();

        int count = 0;
        while (num != 0) {
            if (num % 10 == digit) {
                count++;
            }
            num /= 10;
        }

        System.out.println("Digit " + digit + " appears " + count + " times.");
    }
}

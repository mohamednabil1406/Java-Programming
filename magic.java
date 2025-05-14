public class magic {

    // Method to calculate the sum of the digits of a number
    public static int sumOfDigits(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10; 
            num /= 10;        // Remove the last digit
        }
        return sum;
    }

    // Method to calculate the digital root (magic number)
    public static int Root(int num) {
        while (num >= 10) {
            num = sumOfDigits(num);  // Keep reducing until single digit
        }
        return num;
    }

    public static void main(String[] args) {
        int num = 1234;
        int sum = sumOfDigits(num);      // First sum of digits (1 + 2 + 3 + 4 = 10)
        int magicNumber = Root(num);     // Then reduce to magic number (1 + 0 = 1)

        System.out.println("Sum of digits: " + sum);
        System.out.println("Magic number: " + magicNumber);
    }
}

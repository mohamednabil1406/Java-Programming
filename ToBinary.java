import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        int decimal = sc.nextInt();
        String binary = "";

        int num = decimal;
        if (num == 0) {
            binary = "0";
        } else {
            while (num > 0) {
                int rem = num % 2;
                binary = rem + binary;
                num = num / 2;
            }
        }

        System.out.println("Binary equivalent of " + decimal + " is: " + binary);
    }
}

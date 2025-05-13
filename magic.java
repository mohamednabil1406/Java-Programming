public class magic {

    public static int sumOfDigits(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10; 
            num /= 10;        
        }
        return sum;
    }

   
    public static int Root(int num) {
        while (num >= 10) {
            num = sumOfDigits(num);  
        }
        return num;
    }

    public static void main(String[] args) {
        int num = 1234;
        int sum = sumOfDigits(num);      
        int magicNumber = Root(num);     

        System.out.println("Sum of digits: " + sum);
        System.out.println("Magic number: " + magicNumber);
    }
}

public class perfectnumber {
    public static boolean isPerfect(int num) {
        if (num <= 1) return false;
        int sum = 0;
        // Find divisors of the number
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }
        return sum == num;
    }

    public static void main(String[] args) {
        int number = 28;
        if (isPerfect(number)) {
            System.out.println(number + " is a perfect number.");
        } else {
            System.out.println(number + " is not a perfect number.");
        }
    }
}

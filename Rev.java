import java.util.Scanner;

public class Rev {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter an integer: ");
        int n = sc.nextInt();
        
        int rev = 0;
        int original = n;

        while (n != 0) {
            int digit = n % 10;       // Get the last digit
            rev = rev * 10 + digit; // Push digits left and add new digit
            n /= 10;                 // Remove the last digit
        }

        System.out.println("Reversed number: " + rev);
    }
}
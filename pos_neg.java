import java.util.Scanner;

public class pos_neg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        double n= sc.nextDouble();

        if (n > 0) {
            System.out.println(n + " is a positive number.");
        } else if (n < 0) {
            System.out.println(n + " is a negative number.");
        } else {
            System.out.println("The number is zero.");
        }
    }
}
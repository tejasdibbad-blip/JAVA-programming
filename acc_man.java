import java.util.Scanner;
public class acc_man
{
    public static void main(String[]args)
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Account management system");
        System.out.println("1.Deposit Money");
        System.out.println("2.Withdraw money");
        System.out.println("3.Check Balance");
        System.out.println("4.Display Account Details");
        System.out.println("5.Calculate Interest");
        System.out.println("6.Exit");
        System.out.println("Enter the choice: ");
        int a=in.nextInt();
        int d=100000;
        if(a==1)
        {
            System.out.println("Deposit money");
            System.out.println("Enter the amount to be deposited: ");
            int b=in.nextInt();
            System.out.println("Amount deposited");
        }
        else if(a==2)
        {
            System.out.println("Withdraw money");
            System.out.println("Enter the money to be Withdraw: ");
            int c=in.nextInt();
            System.out.println("Amount Withdrawed");
        }
        else if(a==3)
        {
            System.out.println("Check balance");
            System.out.println("Enter the accouhnt number: ");
            int acc=in.nextInt();
            System.out.println("Balance: "+d);
        }
        else if(a==4)
        {
            System.out.println("Display Account Details");
            System.out.println("Enter the account number: ");
            int e=in.nextInt();
            System.out.println("Name is Ramesh\n Account balance: "+d);

        }
        else if(a==5)
        {
            System.out.println("Calculate Interest");
            double inte = d * 0.053;
            System.out.println("Interest is: "+inte);
        }
        else if(a==6)
        {
            System.out.println("Exit");
        }
        else
        {
            System.out.println("Invalid Input");
        }
    }
}
import java.util.Scanner;
public class name_age 
{
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter name:");
        String name=in.nextLine();
        System.out.println("Enter age:");
        int age=in.nextInt();
        System.out.println("Name:"+name);
        System.out.println("Age:"+age);

    }

}
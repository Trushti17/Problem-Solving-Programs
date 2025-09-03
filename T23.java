import java.util.Scanner;

public class T23 {
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        
        System.out.print("Enter the first number: ");
        double n1 = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double n2 = scanner.nextDouble();

        if(n1>n2)
        {
            System.out.println("The n1 is maximum.");

        }
        else
        {
           System.out.println("The  n2 is maximum.");
        }
        scanner.close();


    }
}

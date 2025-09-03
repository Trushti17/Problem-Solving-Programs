import java.util.Scanner;

public class T26 {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a year...");
        int year = scanner.nextInt();

        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
        {
            System.out.println("this is leap year.");
        }
        else
        {
            System.out.println("This is not leap year." );
        }

        scanner.close();

    }
    
}

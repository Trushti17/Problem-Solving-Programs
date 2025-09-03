
import java.util.Scanner;

public class T20 {
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter a days :");

        int totaldays=scanner.nextInt();
        
        int years = totaldays / 365;
        int remainingdays = totaldays % 365;
        int month = remainingdays / 30 ;
        int days = remainingdays % 30;

        System.out.println(totaldays + "days=" + years + "year(s)" + month + "month(s)" + days + "day(s)");
        
        scanner.close();

    }
    
}

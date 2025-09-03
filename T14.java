
import java.util.Scanner;

class T14{
    public static void main(String args[])
    {
        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter hourly pay rate:");
        double hourlyRate=scanner.nextDouble();

        System.out.println("Enter the number of hours worked:");
        double hoursWorked=scanner.nextDouble();

        double weeklyPay=hourlyRate*hoursWorked;

        System.out.println("The weekly pay is :$"+ weeklyPay);
    
        scanner.close();

    }
}
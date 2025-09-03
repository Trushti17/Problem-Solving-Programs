import java.util.Scanner;

public class T27 
{
    public static void main(String[] args)
    {
        Scanner Scanner = new Scanner(System.in);

        System.out.print("Enter a num1 values:");
        int num1 = Scanner.nextInt();
        
        System.out.print("Enter a num2 values:");
        int num2 = Scanner.nextInt();

        int add = num1 + num2;
        int sub = num1 - num2;
        int multi = num1 * num2;
        int div = num1 / num2 ;

        System.out.println("The Addition ans :" + add + "\n Subtraction ans:" + sub + "\n Multiple ans: " + multi + "\n Division :" + div);
        Scanner.close();
    }
    
}

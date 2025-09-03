import java.util.Scanner;

public class T24 {
    public static void main(String[] args)
    {
        Scanner Scanner=new Scanner(System.in);

       
        System.out.print("Enter first number..");
        int n1=Scanner.nextInt();

        System.out.print("Enter second number..");
        int n2=Scanner.nextInt();
    
    

        if(n1>n2)
        {
            System.out.println("The number is Positive." + n1);
        }
        else if (n1<n2)
        {
            System.out.println("The number is Negative." + n2);    
        }
        else
        {
            System.out.println("The is Zero.");

        }

        Scanner.close();
    }
}

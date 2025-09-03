import java.util.Scanner;

public class T25
 {
    public static void main(String[] args) 
    {Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number ");
        int a = scanner.nextInt();
        System.out.print("Enter first number ");
        int b = scanner.nextInt();
        System.out.print("Enter first number ");
        int c = scanner.nextInt();

        int temp;

        if( a>b )
        {
            temp = a;
            a = b;
            b= temp;
        }
        if(a>c)
        {
            temp = a;
            a= c;
            c= temp;
        }
        if (b>c)
        {
            temp = b;
            b = c;
            c = temp;
        }
     System.out.println("The ascending  number " + a +","  + b + ","+ c);
     scanner.close();
    }

}

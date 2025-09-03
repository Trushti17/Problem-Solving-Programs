import java.util.Scanner;

public class T29 
{
    public static void main(String[] args)
    {
        Scanner Scanner =new Scanner(System.in);

        System.out.print("Enter four digit number...");
        String num = Scanner.next();

        String str = String.valueOf(num);
        System.out.println(str); 

        

        Scanner.close();
    }    
}

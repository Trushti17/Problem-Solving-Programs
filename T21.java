import java.util.Scanner;

public class T21 {
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter float value:");

        float num=scanner.nextFloat();
        int a=(int)num;

        System.out.println("A integer values is :" + a);

        scanner.close();
    }


}
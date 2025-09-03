import java.util.Scanner;

public class T17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a floating number: ");

        float num = scanner.nextFloat();
        int a = (int) num;
        
        a = Math.abs(a);
        int b = a % 10;

        System.out.println("The rightmost digit of the integral part is: " + b);

        scanner.close();
    }
}

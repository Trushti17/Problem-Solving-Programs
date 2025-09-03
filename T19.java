import java.util.Scanner;

public class T19 {
    public static void main(String[] args){

        Scanner scanner=new Scanner(System.in);

        System.out.print("Enter degree:");

        double radius=scanner.nextDouble();
        double Degrees=(int)radius;

        radius = Degrees * (3.14 / 180);

        System.out.println("Redians:" + radius);

        scanner.close();



    }
}

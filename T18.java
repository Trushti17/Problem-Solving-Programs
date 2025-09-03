import java.util.Scanner;

public class T18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter  kilometers: ");
        double km = scanner.nextDouble();

        double meters = km * 1000;
        double feet = km * 3280.84;
        double centimeters = km * 100000;

        System.out.println("\nDistance Conversions:");
        System.out.println("Meters: " + meters);
        System.out.println("Feet: " + feet);
        System.out.println("Centimeters: " + centimeters);

        scanner.close();
    }
}


import java.util.Scanner;

public class T22 {
    public static void main()
    {
        Scanner  scanner=new Scanner(System.in);
        
        System.out.print("Enter number: ");

        int totalSeconds=scanner.nextInt();

        int hours = totalSeconds / 3600;
        int minutes = (totalSeconds % 3600) / 60;
        int seconds = totalSeconds % 60;

        System.out.println("The hour " + hours + ",minutes " + minutes + ",seconds " + seconds);

        scanner.close();
 
    }
    
}

import java.util.Scanner;

public class T29 
{
    public static void main(String[] args)
    {
        Scanner Scanner =new Scanner(System.in);

        System.out.print("Enter four digit number...");
        String num = Scanner.next();

        if (num.matches("\\d{4}"))
        {
            String[] digitWords = 
            {
                "Zero", "One", "Two", "Three", "Four",
                "Five", "Six", "Seven", "Eight", "Nine"
            };
            System.out.print("Output: ");
            for (int i = 0; i < num.length(); i++) 
            {
                char ch = num.charAt(i);
                int digit = Character.getNumericValue(ch);
                System.out.print(digitWords[digit] + " ");
            }
        }
         else
        {
            System.out.println("Invalid input. Please enter a 4-digit number.");
        }

        Scanner.close();
    }    
}

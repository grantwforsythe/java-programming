package part1;
import java.util.Scanner;

public class UserInput 
{
    
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Write a message: ");
        
        // read the string written by the user and assign it to a variable
        String message = scanner.nextLine();
        
        System.out.println("You wrote: " + message);
    }
}

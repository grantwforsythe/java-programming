package part3;

import java.util.Scanner;

public class DiscoveringErrors {

    public static void main(String[] args) {
        // notice an error occurs if the first value is 0 and the second value is any value less than 0
        // likewise, errors occur is the user enters very large values
        Scanner scanner = new Scanner(System.in);
        int values = 0;
        int sum = 0;
                
        while(true) {
            System.out.println("Provide a value, a negative value ends the program");
            int value = Integer.valueOf(scanner.nextLine());
            
            if(value < 0) {
                break;
            }
            
            values++;
            sum += values;
        }
        
        if(sum == 0) {
            System.out.println("The average of the values could not be calculated");
        } else {
            System.out.println("Average of values: " + (1.0 * sum / values));
        }
            
    }
    
    // the below two methods are self documenting as it makes use of good name convention
    
    public static void printValuesFromTenToOne() {
        int value = 10;
        while (value > 0) {
            System.out.println(value);
            value = value - 1;
        }
    }
    
    public static void printValuesFromLargestToSmallest(int start, int end) {
        while (start >= end) {
            System.out.println(start);
            start = start - 1;
        }
    }

}

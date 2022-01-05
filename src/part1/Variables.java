package part1;

public class Variables 
{
    
    public static void main(String[] args)
    {
        // you can use the var keyword to define a variable if the type is implied
        final var k = 345;
        
        System.out.println("k: " + k);
        
        String valueAsString = "42";
        int value = Integer.valueOf(valueAsString);
        
        System.out.println("value: " + value);
    }
}

package part3;

import java.util.ArrayList;

public class Lists {

    public static void main(String[] args) {
        // all of the values stored in a list MUST be the same type
        // there are two types of variables in Java: value types (primitive) and
        // reference types variables
        // value types (int, double, etc.) hold their actual value
        // reference type (ArrayList) contain a reference to the location that contains
        // that value

        // all variables stored in a list are assumed to be reference type
        // hence the capitalization of boolean below
        ArrayList<String> words = new ArrayList<>();
        words.add("The");
        words.add("cat");
        words.add("jumped");
        words.add("over");
        words.add("..");
        
        for(int i = words.size()-1; i >= 0; i--) {
            System.out.println(words.get(i));
        }
        
        try {
            System.out.println(words.get(10));
        } catch (IndexOutOfBoundsException eOB) {
            System.out.println("Trying to access a position in the list that doesn't exist.");
        }
        
    }

}

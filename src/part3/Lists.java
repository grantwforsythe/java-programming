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
        words.add("cat");
        
        // read the list using a while loop and making using of a try-catch
        System.out.println("Printing elements from the list in the order they were stored.");
        int idx = 0;
        while(true) {
            try {
                System.out.println(words.get(idx));
                idx++;
            } catch (IndexOutOfBoundsException eOB) {
                System.out.println("Trying to access a position in the list that doesn't exist.");
                break;
            }
        }
        
        // read the list backwards using a for loop
        System.out.println("Printing elements from the list backwards.");
        for(int i = words.size()-1; i >= 0; i--) {
            System.out.println(words.get(i));
        }
        
        // remove the first element from the list
        words.remove(0);
        // the element with the value cat
        // if there are multiple elements with the same values, it just removes the first instance of it
        words.remove("cat");
        
        // if you would like to remove an int value from the list, you have to use Integer.valueOf method
        
        System.out.println("Printing elements from the list after removing a few.");
        for(String word: words) {
            System.out.println(word);
        }
        
        // check if a value is in a list
        boolean found = words.contains("over");
        if(found) {
            System.out.println("The word is in the list.");
        } else {
            System.out.println("The word is not in the list.");
        }
        
        /**
         * When a list (or any reference-type variable) is copied for a method's use, 
         * the method receives the value of the list variable, i.e., a reference.
         * In such a case the method receives a reference to the real value of a reference-type variable, 
         * and the method is able to modify the value of the original reference type variable, such as a list.
         */
         
        
        
        
    }


}

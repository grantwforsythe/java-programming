package part3;

public class Arrays {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        // Arrays are like lists except there is a limited amount of elements in an array
        int[] numbers = {10, 11, 25};
        // When assigning a value to an array, you have to specify the index
        // numbers[0] = 10;
        // numbers[1] = 11;
        // numbers[2] = 25;
        
        System.out.println("The number of elements in the array is " + numbers.length);
        
        // notice that the values for the array are being updated even though it is in a different code block
        updateArray(numbers);
        
        for(int number: numbers) {
            System.out.println(number);
        }
        
        // you can index to a specific character into a string by calling the charAt method
        
    }
    
    /**
     * You can use arrays as a parameter of a method just like any other variable. 
     * As an array is a reference type, the value of the array is a reference to the information contained in the array. 
     * When you use array as a parameter of a method, the method receives a copy of the reference to the array.
     * Array is an object, so when you change the array inside the method, the changes persist after the execution of the method.
     */
    public static void updateArray(int[] integerArray) {
        System.out.println("Updating the values of the array...");
        
        int index = 0;
        while(index < integerArray.length) {
            integerArray[index]++;
            index++;
        }
        
        System.out.println("...elements updated.");
    }

}

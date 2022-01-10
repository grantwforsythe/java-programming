package part4;

public class Person {
    // the keyword private means that the variables are "hidden" in the object
    // this is refered to as encapsulation
    private String name;
    private int age;
    private int weight;
    private int height;

    // constructor which is always the same as the class name
    public Person(String name) {
        this.age = 0;
        this.weight = 0;
        this.height = 0;
        this.name = name;
    }

    // public indicates that this method is accesible to the outsite world
    // a static method indicates that the method doesn't belong to an object
    // toString is the naming convention for the method that returns
    // a string representation of the object
    public String toString() {
        return this.name + ", age " + this.age + "years, bmi " + bmi();
    }

    public void growOlder() {
        if (this.age < 30) {
            this.age++;
        }
    }

    /**
     * Getter methods are defined as methods that return an instance variable
     * The naming convention is get<Attribute>
     * The below two methods are examples of getter methods
     */
    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    // the below two methods are examples of setter methods which are used to update an attribute
    public void setHeight(int height) {
        this.height = height;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public double bmi() {
        double heightPerHundred = this.height / 100.0;
        return this.weight / (heightPerHundred * heightPerHundred);
    }

    public boolean isOfLegalAge() {
        if (this.age < 18) {
            return false;
        } else {
            return true;
        }
        /**
         * this method could have been written more succinctly
         * return this.age >= 18;
         */
    }
}
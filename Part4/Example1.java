package Part4;

public class Example1 {
 	int nonStaticVar = 10;

    static void staticMethod() {
         System.out.println(this.nonStaticVar); 
         // Error: Cannot use 'this' in a static context
    }

    public static void main(String[] args) {
        Example1.staticMethod();
        // The "this" keyword cannot be used in a static method because this refers to the current object instance, which does not exist in a static context.
    }
}
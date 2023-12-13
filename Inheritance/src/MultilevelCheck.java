public class MultilevelCheck {
    public static void main(String[] args) {
        Child c = new Child();
        //c.f1(); // parent Class function
        //c.f2(); // Child Class Function
        //c.hashCode(); // This function is accessible to the child class. And we might think that the child
                      // class is extended from Parent as well as Object and it becomes Multiple
                        // inheritance. BUT THIS IS NOT THE case here what is happening is that,
                      // the compiler will only inject Object class to parent only and not to child,
        //and child class is only inherited by Parent so inturn it gets all the properties of
        // Object class too, so this is how it created a multilevel Inheritance Structure.
        //
        //
        // IMPORTANT POINT
        //---------------
        // 1. Parent class object and child class object shares same memory location.
        // OUTPUT:
        // Parent class object (this.hashCode()) = 460141958
        //Child class object (this.hashCode()) = 460141958

        // 2. JVM instantiates the Parent class first and then the child classes.



    }
}

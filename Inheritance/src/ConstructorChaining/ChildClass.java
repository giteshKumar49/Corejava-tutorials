package ConstructorChaining;

public class ChildClass extends SuperClass{
    int x;

    public ChildClass() {
        this(10);  // This line will call parameter constructor of child class.
        System.out.println("No arg Child class constructor");
    }
    public ChildClass(int x) {
        super(x); // Her 10 value will be supplied to parent class and its object will get
        // that value
        System.out.println("One arg Child class constructor");
    }
}

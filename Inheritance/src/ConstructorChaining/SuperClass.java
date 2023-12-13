package ConstructorChaining;

public class SuperClass {
    int x;

    public SuperClass () {
        System.out.println("No arg Super class Constructor");
    }
    public SuperClass(int x) {
        this(); // calls no arg constructor
        this.x = x;
        System.out.println("One Arg Super class Constructor");
    }
}

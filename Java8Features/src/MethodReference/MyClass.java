package MethodReference;

public class MyClass{

    public static void main(String[] args) {
        // This is how we do normally
        MyInterface f = i -> System.out.println("i = " + (i+20));
        f.myMethod(30);

    }
}

package FunctionalInterface;

public class Test {
    public static void main(String[] args) {
//        A a = new C();
//        a.myMethod();

//        Lets do the above thing with Lambda exp

        A a = ()-> System.out.println("Inside Mymethod()"); // This line implements the myMethod
        a.myMethod();
    }
}

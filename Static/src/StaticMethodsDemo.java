public class StaticMethodsDemo {
    public static void main(String[] args) {
        System.out.println("InsideMain");
        StaticMethodsDemo.method1();
    }

    static void method1() {
        System.out.println("Inside Method 1");
    }
    {
        //This do not execute as we haven't created any object of this class
        System.out.println("Indie Non-static Block");
        StaticMethodsDemo.method1();
    }
    static {
        System.out.println("Inside static block");
        StaticMethodsDemo.method1();
    }
}

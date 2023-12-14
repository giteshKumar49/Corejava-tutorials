public class SingleInheritance {
    // Whenever we declare any class it is extended by Object class ie.
    // public class SingleInheritance extends java.lang.Object {}
    // declaring a class is similar to above line, and this is nothing but
    // Single inheritance in Action
    void m1() {
        System.out.println("inside m1");
    }

    public static void main(String[] args) {
        SingleInheritance s = new SingleInheritance();
        s.m1();

        // These hashcode and getclass functions are available as they are written in Object Class.
        // So Every Class in java extends Object class
        System.out.println("s.hashCode() = " + s.hashCode());
        System.out.println("s.getClass() = " + s.getClass());
    }
}

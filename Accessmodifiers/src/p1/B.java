package p1;

public class B {
    public static void main(String[] args) {
        A aobj = new A();
        //aobj.a; // as a is private i A then it cannot be accessed
        System.out.println("Default field in class A (aobj.b) = " + aobj.b);
        System.out.println("aobj.c = " + aobj.c);
        System.out.println("aobj.d = " + aobj.d);
    }
}

package p1;

public class A {
    private int a = 30;
    int b = 40;
    protected int c = 50;
    public int d = 60;

    public static void main(String[] args) {
        A obj = new A();
        System.out.println("obj.a = " + obj.a);
        System.out.println("obj.b = " + obj.b);
        System.out.println("obj.c = " + obj.c);
        System.out.println("obj.d = " + obj.d);
    }
}

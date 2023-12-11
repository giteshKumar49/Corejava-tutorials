package p2;
import p1.A;
public class C extends A{
    public static void main(String[] args) {
        A aobj = new A();
        System.out.println("aobj.d = " + aobj.d);
        
        C cobj = new C();
        System.out.println("cobj.c = " + cobj.c);
        System.out.println("cobj.d = " + cobj.d);
    }
}

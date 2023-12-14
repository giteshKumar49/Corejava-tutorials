package interfaces;

public class Honda implements car{
    // In INTERFACES
    //----------------
    /* 1.in interface all methods by default are public abstract whereas in abstract class
    it is not the case, we can use other modifiers as well.
    2. in interfaces variables are public, static, and final only and they must be initialized at
    the time of declaration, whereas in abstract classes variables can be of any type and can be
    initialized lter too.
    3. interfaces cannot define Blocks as well as Constructors but abstract class can define them.
    * */
    @Override
    public void go() {
        System.out.println("honda go");
    }

    @Override
    public void stop() {
        System.out.println("honda stop");
    }
}

package superKeyword;

public class Test {
    public static void main(String[] args) {
        Child c = new Child(10,20,30,40);
        System.out.println("c.toString() = " + c.toString());
        c.fun();
    }
}

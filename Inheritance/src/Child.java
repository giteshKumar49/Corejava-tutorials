public class Child extends Parent{
    Child() {
        System.out.println("Child class object (this.hashCode()) = " + this.hashCode());
    }
    void f2() {
        System.out.println("inside Child function f2");
    }
}

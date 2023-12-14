package RuntimeBinding.withoutInterface;

public class test {
    public static void main(String[] args) {

        /*
        * Here in Runtime binding or runtime polymorphism we can call child classes methods using
        * Parent class Object by OVERRIDING the methods in child classed.
        * And at runtime it will be decided which function will be called depending on the
        * child class object that you chose to assign to the parent class object.
        *
        * This Runtime binding or polymorphism is achieved thorough METHOD OVERRIDING.,
        * */

        Macbook m1 = new MacbookPro();
        m1.start();
        m1.shutdown();

        Macbook m2 = new MacbookAir();
        m2.start();
        m2.shutdown();
    }
}

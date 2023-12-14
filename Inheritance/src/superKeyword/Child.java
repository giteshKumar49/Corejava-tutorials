package superKeyword;

public class Child extends Parent{

    int c;
    int d;

    public Child(int a, int b, int c, int d) {
        super(a,b); // super method will be useful to instantiate parent class functions
        // And this must be first line in the constructor. is we move it below then there will be an error.
        this.c = c;
        this.d = d;
    }
    void fun() {
        super.fun(); // we can call parent's function in Child class even though it is
        // overrided.
        // And super keyword is not like this as we cannot print it like "this" as JVM do not
        //  create any instance of super like it create for this.
        System.out.println("Inside fun in Child Class");
    }

    @Override
    public String toString() {
        return "Child{" +
                "c=" + c +
                ", d=" + d +
                ", (Parent class)a=" + a +
                ", (Parent class)b=" + b +
                '}';
    }
}

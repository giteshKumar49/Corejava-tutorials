package ConstructorReference;

public class test {
    public static void main(String[] args) {
        MyInterface f1 = s -> new MyClass(s);
        f1.get("Using Lambdas");

        // Now let's see how we can do the same using constructor mapping
        MyInterface f2 = MyClass::new;
        f2.get("using Constructor mapping");

    }
}

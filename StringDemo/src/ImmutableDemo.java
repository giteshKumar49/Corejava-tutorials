public class ImmutableDemo {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "World";
        String s3 = "Hello";

        System.out.println("Before concat : \ns1 = "+s1+"\ns2 = " + s2);

        s1.concat(s2); // JVM will concatenate s1 and s2 ie. s1 + s2 = HelloWorld
                       // and make a new string the memory, but if we don't assign the reference
                        // to anything then after sometime it will be Garbage collected by the garbage collector..


        System.out.println("\nAfter concat : \ns1 = "+s1+"\ns2 = " + s2);

        // Check String POOL
        System.out.println(s1.hashCode());
        System.out.println(s3.hashCode());

    }
}

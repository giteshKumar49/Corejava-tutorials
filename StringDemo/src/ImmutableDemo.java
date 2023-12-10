public class ImmutableDemo {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "World";
        String s3 = "Hello";

        System.out.println("Before concat : \ns1 = "+s1+"\ns2 = " + s2);

        s1.concat(s2);

        System.out.println("\nAfter concat : \ns1 = "+s1+"\ns2 = " + s2);

        // Check String POOL
        System.out.println(s1.hashCode());
        System.out.println(s3.hashCode());

    }
}

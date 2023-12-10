public class DoubleEqualsAndEqualsDemo {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "World";
        String s3 = "Hello";
        String s4 = new String("Hello"); // No string pooling happens when use new Keyword
                                                // as JVM will allocate a new memory location to it.

        System.out.println(s1 == s3);
        System.out.println(s1.hashCode());
        System.out.println(s3.hashCode());
        System.out.println(s1.equals(s3));
        System.out.println(s1 == s4);
        System.out.println(s1.hashCode());
        System.out.println(s4.hashCode());
        System.out.println(s1.equals(s4));


    }
}

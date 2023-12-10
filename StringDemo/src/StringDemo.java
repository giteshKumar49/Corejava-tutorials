public class StringDemo {
    public static void main(String[] args) {
        // Multiple ways to make a string in JAVA
        // JVM treats strings and Wrapper types differently ie. instead
        // of printing the reference of the object it prints the value contained by them.
        String s1 = "hello";

        String s2 = new String("World");

        char c[] = {'a','e','i','o','u'};
        String s3 = new String(c);

        byte b[] = {65,66,67};
        String s4 = new String(b);

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);

    }
}

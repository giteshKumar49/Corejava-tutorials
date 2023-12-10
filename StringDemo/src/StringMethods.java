public class StringMethods {
    public static void main(String[] args) {
        String s = "Hello World";
        System.out.println(s.hashCode());
        System.out.println("length : " + s.length());
        System.out.println("index of: " + s.indexOf('o'));
        System.out.println("CharAt[i]: " + s.charAt(4)); // If we give out of bound index then it
                                                            // gives index out of bound Exception
        System.out.println("Substring with begin index : " + s.substring(2)); // llo
        System.out.println("Substring with begin and ending index = " + s.substring(0,4)); //Hell

        // MORE IMP methods on String
        String[] result = s.split(" ");
        for(String x: result) {
            System.out.println(x);
        }
        System.out.println(s.replace('l','k')); // replace all l with k in string
        System.out.println(s.toUpperCase());
        System.out.println(s.toLowerCase());
        System.out.println(s);


    }
}

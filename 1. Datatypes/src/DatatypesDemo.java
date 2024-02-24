public class DatatypesDemo {
    public static void main(String[] args) {
//        byte b = 89;
//        short s = 150;
//        int i = 10000;
//        long l = 1000000;
//        char c = 'A';
//        float f = 10.23f;
//        double d = 1234.5678;
//        byte h = 20;
//
//        //byte result = i + h; // it might happen that the result might go out of byte range so JVM will
//                             // Complain on this statement.
//        int result = i + h;  // this is CORRECT;

        // 1. byte
        // This is fine,compiler shows no errors as -50 is in range of byte
        byte a = -50;

        //byte b = -140; // Gives error as -140 is out of range for byte datatype (Gives error message
                       // that cannot convert from int to byte)
                        // (incompatible types: possible lossy conversion from int to byte)

        byte h = 20;

        // Gives compiler error as it may happen that on adding values in a and h the
        // result may exceed the byte range, so we need to declare result as int or some other larger data type
        // so that value is not lost

        // byte result = a + h; --> Error:- incompatible types: possible lossy conversion from int to byte

        // int result = a + h; --> CORRECT
        // long result = a + h; --> Correct
        // float result = a + h; --> Correct


        // 2. short
        short b = 150;


        // 3. int
        int c = 10000;

        // 4. long
        long d = 100000;

        // 5. char
        char e = 'A';

        // 6. float
        float f = 1.23f;

        // 7. double
        double g = 12345.6789;




    }
}

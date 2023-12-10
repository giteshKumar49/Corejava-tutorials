public class DatatypesDemo {
    public static void main(String[] args) {
        byte b = 89;
        short s = 150;
        int i = 10000;
        long l = 1000000;
        char c = 'A';
        float f = 10.23f;
        double d = 1234.5678;
        byte h = 20;

        //byte result = i + h; // it might happen that the result might go out of byte range so JVM will
                             // Complain on this statement.
        int result = i + h;  // this is CORRECT;
    }
}

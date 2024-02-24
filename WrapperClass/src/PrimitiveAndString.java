public class PrimitiveAndString {
    public static void main(String[] args) {
        byte x = 100;

        // 1. Convert Primitive to String
        String y = Byte.toString(x);  // Convert byte to string value

        // 2. Convert String to primitive
        byte z = Byte.parseByte(y);
        System.out.println("z = " + z);
    }
}

public class PrimitiveAndObject {
    public static void main(String[] args) {
        int x = 100;
        // 1. Integer
        // Converts Primitive to Wrapper type(object type) BOXING
        Integer y = Integer.valueOf(x);
        System.out.println("y = " + y);

        // Converts back to primitive from Wrapper type UNBOXING
        int z = y.intValue();

        //Similarly for others too
        // 2. Byte
        byte a = 120;
        Byte b = Byte.valueOf(a);

        byte c = b.byteValue();

        System.out.println("c = " + c);

        // 3. Float
        float q = 134.56f;
        Float w = Float.valueOf(q);

        float e = w.floatValue();
        System.out.println("e = " + e);



    }
}

public class ObjectAndString {
    public static void main(String[] args) {
        long x = 1000;

        // Convert this to object first using wrapper class
        Long y = Long.valueOf(x);

        // Convert this object to String
        String s = y.toString();

        // Convert this back to object (Can be done in two ways)
        // 1. First Way : using Long.parseLong(string) method
        Long z = Long.parseLong(s);

        // 2. Second way
        Long w = Long.valueOf(s);

        // Convert object back to primitive
        long e = z.longValue();

        System.out.println("e = " + e);

        System.out.println("args[0] = " + args[0]);
        System.out.println("args[1] = " + args[1]);
    }

}

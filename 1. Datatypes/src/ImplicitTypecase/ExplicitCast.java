package ImplicitTypecase;

public class ExplicitCast {
    public static void main(String[] args) {
        int i = 100;
        //byte b = i;  // This line give error as automatically lower DT is not
                    // assigned to higher DT.
        byte b = (byte)i;

        int x = 97;
        char ch = (char)x;
        System.out.println(ch);
    }
}

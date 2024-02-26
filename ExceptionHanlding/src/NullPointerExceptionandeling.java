public class NullPointerExceptionandeling {
    static ArrayIndexOutOfBoundExceptionHandelling a;

    public static void main(String[] args) {
        try{
            NullPointerExceptionandeling.a.method1();
//        }catch(Exception e) {
        }catch(NullPointerException e) {
            System.out.println("Method 1 cannot be accessed");
        }
    }
}

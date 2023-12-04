public class TestClass {
    public static void main(String[] args) {
        System.out.println("Hello this is my first java program 😊");
    }
    // Static blocks executes first always even before psvm
    static {
        System.out.println("Static Block 1");
    }
    static {
        System.out.println("Static Block 2");
    }
}

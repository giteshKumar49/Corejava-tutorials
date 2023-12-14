package compileTimebinding;

public class CompileTimeBinding {
    // Here this happens at Compile time, and depending on the type of parameter, and number
    // of parameters passed during function call.
    // This is also called Compile time polymorphism or Compiler time binding.
    // And this concept is called METHOD OVERLOADING.
    void add(int a, int b) {
        int result = a + b;
        System.out.println("result = " + result);
    }
    void add(float a, float b) {
        float result = a + b;
        System.out.println("result = " + result);
    }

    void add(int a, int b, int c) {
        int result = a + b + c;
        System.out.println("result = " + result);
    }
    public static void main(String[] args) {
        CompileTimeBinding obj = new CompileTimeBinding();
        obj.add(13,30);
        obj.add(10,20,40);
        obj.add(23.6f,45.9f);
    }
}

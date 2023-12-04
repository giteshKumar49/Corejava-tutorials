public class NonStaticMembersDemo2 {
    int num; //non static variable and each object of this class will have a seperate
    // value for this variable

    NonStaticMembersDemo2() {
        System.out.println("Inside The concstuctor");
    }
    NonStaticMembersDemo2(int num) {
        System.out.println("Inside parameterised concstuctor");
    }

    static {
        // Static block executes only whe the class is loaded.
        // unlike non-static blocks which executes just before constructor is called everytime
        // an object is created.
        System.out.println("inside static Block");
    }

    {
        // Non static block
        // non static block is called just before the constructor is called
        System.out.println("inside Non static block 1");
    }

    {
        // Non static block
        // non static block is called just before the constructor is called
        System.out.println("inside Non static block 2");
    }

    public static void main(String[] args) {
        System.out.println("inside Main method");
        NonStaticMembersDemo2 obj = new NonStaticMembersDemo2();
        obj.doSomthing();
    }

    void doSomthing() {
        System.out.println("indie Do somthing (A non static Method)");
    }
}

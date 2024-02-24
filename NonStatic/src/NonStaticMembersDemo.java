public class NonStaticMembersDemo {

    int num; //non static variable and each object of this class will have a seperate
            // value for this variable

    NonStaticMembersDemo() {
        System.out.println("Inside The constructor");
    }
    NonStaticMembersDemo(int num) {
        System.out.println("Inside parameterised constructor ");
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
        new NonStaticMembersDemo();
        new NonStaticMembersDemo(10);
    }
}

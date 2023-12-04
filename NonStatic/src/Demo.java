public class Demo {
    static Demo obj;

    static {
        // Upto here obj is containing null
        System.out.println(Demo.obj);

        //At this point obj is allocated some memory, so when it is called in main it do not print null,
        // and prints the address of the object
        Demo.obj = new Demo();
    }

    public static void main(String[] args) {
        System.out.println(Demo.obj);
    }

}

public class DemoStaticFunction {
    static DemoStaticFunction obj = new DemoStaticFunction();

    static {
        // Upto here obj is containing null
        System.out.println(DemoStaticFunction.obj);

        //At this point obj is allocated some memory, so when it is called in main it do not print null,
        // and prints the address of the object
        //Demo.obj = new Demo();
        DemoStaticFunction.obj = DemoStaticFunction.init();
    }

    public static void main(String[] args) {
        System.out.println(DemoStaticFunction.obj);
    }

//    static void init() {
//        DemoStaticFunction.obj = new DemoStaticFunction();
//    }

    static DemoStaticFunction init() {
        return new DemoStaticFunction();
    }
}

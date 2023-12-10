public class DemoStaticFunction {
    static DemoStaticFunction obj = new DemoStaticFunction();

    static {
        System.out.println(DemoStaticFunction.obj);
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

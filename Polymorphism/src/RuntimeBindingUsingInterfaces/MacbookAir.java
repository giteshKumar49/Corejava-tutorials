package RuntimeBindingUsingInterfaces;

public class MacbookAir implements AppleLaptop{
    @Override
    public void start() {
        System.out.println("inside MacbookAir start");
    }

    @Override
    public void shutdown() {
        System.out.println("inside MacbookAir shutdown");
    }
}

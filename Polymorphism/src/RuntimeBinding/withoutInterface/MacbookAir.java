package RuntimeBinding.withoutInterface;

public class MacbookAir extends Macbook{
    @Override
    void start() {
        System.out.println("inside MacbookAir start");
    }
    @Override
    void shutdown() {
        System.out.println("Inside macbookAir shutdown");
    }
}

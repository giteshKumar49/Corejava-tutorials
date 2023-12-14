package RuntimeBinding.withoutInterface;

public class MacbookPro extends Macbook{
    @Override
    void start() {
        System.out.println("inside MacbookPro start");
    }
    @Override
    void shutdown() {
        System.out.println("Inside macbookPro shutdown");
    }
}

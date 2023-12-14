package RuntimeBindingUsingInterfaces;

import com.sun.javaws.IconUtil;

public class MacbookPro implements AppleLaptop{
    @Override
    public void start() {
        System.out.println("inside MacbookPro start");
    }

    @Override
    public void shutdown() {
        System.out.println("inside MacbookPro shutdown");
    }
}

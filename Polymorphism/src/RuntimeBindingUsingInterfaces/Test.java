package RuntimeBindingUsingInterfaces;

public class Test {
    public static void main(String[] args) {
        // Similar to abstract classes and also similar to earlier discussion
        /*
        *
        * Overriding concept do not apply to variables as type of variables ie. the value
        * they hold is decided by compiler at compile time and not at runtime.
        * */
        AppleLaptop air = new MacbookAir();
        air.start();
        air.shutdown();

        AppleLaptop pro = new MacbookPro();
        pro.start();
        pro.shutdown();


        MacbookPro m3 = (MacbookPro) pro;  // This is how we do a down cast
        // if we do only MacbookPro m3 =  pro; then there will be ERROR!!!!! saying
        // type mismatch cannot convert Applelaptop to MacbookPro....
        m3.start();
    }
}

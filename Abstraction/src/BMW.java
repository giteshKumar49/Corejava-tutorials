public abstract class BMW {
    void commonFunctionality () {
        System.out.println("Inside common func");
    }

    abstract void accelerate(); // this method will be left to be implemented by the
    abstract void brake();
    // classes that inherits this class.....

    // we can define and run main methode inside abstract class too.
    public static void main(String[] args) {
        System.out.println("Inside the main method in abstract Class");
    }
}

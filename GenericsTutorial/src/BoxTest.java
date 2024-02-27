public class BoxTest {
    public static void main(String[] args) {
        Box<String> boxString = new Box<>("Gitesh");
        Box<Integer> boxInteger = new Box<>(123);
        Box<Double> boxDouble = new Box<>(123.456);

        System.out.println("boxString.getContainer() = " + boxString.getContainer());
        System.out.println("boxInteger.getContainer() = " + boxInteger.getContainer());
        System.out.println("boxDouble.getContainer() = " + boxDouble.getContainer());
    }
}

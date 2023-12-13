package HierarchicalInheritance;

public class OverridingTest {
    public static void main(String[] args) {
        Car car = new Car();
        Bus bus = new Bus();

        System.out.println("bus.fuel() = " + bus.fuel());
        System.out.println("car.fuel() = " + car.fuel());
    }


}

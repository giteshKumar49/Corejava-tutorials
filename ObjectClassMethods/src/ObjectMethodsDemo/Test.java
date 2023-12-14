package ObjectMethodsDemo;

public class Test {
    public static void main(String[] args) {
        Passenger passenger1 = new Passenger();
        passenger1.setFirstName("Gitesh");
        passenger1.setLastname("Kumar");
        System.out.println("passenger1 = " + passenger1);
        // Before overriding toString() method output is:
        // passenger = ToStringMethod.Passenger@1b6d3586

        Passenger passenger2 = new Passenger();
        passenger2.setFirstName("Gitesh");
        passenger2.setLastname("Kumarr");

        System.out.println(passenger1.equals(passenger2));



    }
}

public class StaticVariables {

    static int num;
    static String name;

    static double salary;

    public static void main(String[] args) {
        // Best practice to use class name when trying to access Static variables
        System.out.println("num = " + StaticVariables.num);
        System.out.println("name = " + StaticVariables.name);
        System.out.println("salary = " + StaticVariables.salary);
    }
}

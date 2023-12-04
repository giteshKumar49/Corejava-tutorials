public class StaticVariables {

    static int num;

    public static void main(String[] args) {
        // Best practice to use class name when trying to access Static variables
        System.out.println(StaticVariables.num);
    }
}

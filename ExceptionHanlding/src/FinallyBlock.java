import java.util.Scanner;

public class FinallyBlock {
    public static void main(String[] args) {

        try {
            int a, b, c;
            System.out.println("Enter values of a, b : ");
            Scanner sc = new Scanner(System.in);
            a = sc.nextInt();
            b = sc.nextInt();
            c = a/b;
            System.out.println("c = " + c);
        }catch (ArithmeticException e) {
            System.out.println("Please don't enter b as 0.");
        }finally {
            System.out.println("I will execute no matter what..");
        }

        System.out.println("More code will go here");
    }
}

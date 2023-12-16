package sumLambda;

public class Test {
    public static void main(String[] args) {
        Sum s = (x,y)-> System.out.println(" SUM = " + (x+y));
        s.add(2,6);
    }
}

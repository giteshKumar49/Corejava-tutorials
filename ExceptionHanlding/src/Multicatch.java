public class Multicatch {
    public static void main(String[] args) {

        try{
            String cmdlineArgs = args[0];
            System.out.println("cmdlineArgs = " + cmdlineArgs);
            int output = Integer.parseInt(cmdlineArgs);
            System.out.println("output = " + output);
        }catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("Input is required");
        }catch(NumberFormatException e) {
            System.out.println("Input was not valid");
        }


        System.out.println("more code can go here");
    }
}

package customException;

public class Test {
    public static void main(String[] args) throws CheckedCustomeException {
        //throw new UncheckedCustomExceptions("Our own custom exception message");
        throw new CheckedCustomeException("Our own custom Checked Exception");
    }
}

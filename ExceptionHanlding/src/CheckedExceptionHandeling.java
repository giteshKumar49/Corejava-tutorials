import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class CheckedExceptionHandeling {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream(
                    "F:\\Java-tutorial\\SequenceToFollow.txt");
        }catch (FileNotFoundException e) {
            System.out.println("File not found exception...");
        }

        System.out.println("More code after try catch");
    }
}

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class throwsKeywordDemostration {


    void readFile() throws FileNotFoundException{

            FileInputStream fis = new FileInputStream(
                    "F:\\Java-tutorial\\SequenceToFol0low.txt");
    }


    // This Approach will handle the exception and will give a user friendly message
//    public static void main(String[] args) {
//
//        throwsKeywordDemostration t = new throwsKeywordDemostration();
//        try {
//            t.readFile();
//        } catch (FileNotFoundException e) {
//            System.out.println("File not found");
//        }
//        System.out.println("More code after try catch");
//    }


    // Another approach will be to add a throws in the main method itself but here
    // the problem is that the user will get a non user friendly method....


    // Like: Exception in thread "main" java.io.FileNotFoundException: F:\Java-tutorial\SequenceToFol0low.txt (The system cannot find the file specified)
    //	at java.io.FileInputStream.open0(Native Method)
    //	at java.io.FileInputStream.open(FileInputStream.java:195)
    //	at java.io.FileInputStream.<init>(FileInputStream.java:138)
    //	at java.io.FileInputStream.<init>(FileInputStream.java:93)
    //	at throwsKeywordDemostration.readFile(throwsKeywordDemostration.java:9)
    //	at throwsKeywordDemostration.main(throwsKeywordDemostration.java:32)

    public static void main(String[] args) throws FileNotFoundException {

        throwsKeywordDemostration t = new throwsKeywordDemostration();
        t.readFile();
        System.out.println("More code after try catch");
    }
}

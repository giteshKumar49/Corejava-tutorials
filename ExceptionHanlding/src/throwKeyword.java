public class throwKeyword {
    public static void main(String[] args) {
        try {
            throw new Exception("Funds not availabile");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}

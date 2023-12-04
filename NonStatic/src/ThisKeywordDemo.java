public class ThisKeywordDemo {
    int x;
    ThisKeywordDemo() {
        // this can only be used in a non-static context
        System.out.println(this);
        System.out.println(this.x);
    }

    public static void main(String[] args) {
        new ThisKeywordDemo();
        new ThisKeywordDemo();
    }
}

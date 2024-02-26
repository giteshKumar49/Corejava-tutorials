public class ArrayIndexOutOfBoundExceptionHandelling {
    public static void main(String[] args) {
        int i = 0;
        try{
            int [] arr = {10,20,30,40};
            for (i = 0 ; i <= 4 ;i++) {
                System.out.println("arr[i] = " + arr[i]);
            }
        }catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("Array can be printed upto index 3 ie. 0, 1, 2, 3 but not for index " + i);
        }

    }

    void method1() {
        System.out.println("inside method 1");
    }
}

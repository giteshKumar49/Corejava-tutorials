public class ArraysDemo {
    public static void main(String[] args) {
        //int arr[5]; // Not a valid Syntax
        int arr[] = {10,20,30,40,50};
        int arr1[] = new int[5];
        arr1[0] = 10;
        arr1[1] = new Integer(30); // Autoboxing : Wrapper types are automatically converted into
                                         // primitive type.
        //arr1[2] = 30.78f; // error

        for(int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        // For each loop
        for (Integer x:
             arr) {
            System.out.println(x);
        }

        float[] arr2 = new float[4];
        for (float f:
             arr2) {
            System.out.println(f);
        }
    }
}

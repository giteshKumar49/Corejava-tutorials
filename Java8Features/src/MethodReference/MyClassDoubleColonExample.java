package MethodReference;

public class MyClassDoubleColonExample {
    // Here we will see how to map an instance method of a class to a functional interface method
    // using :: operator
    public void myMethod123(int i){
        System.out.println("opr :: example \n------------------");
        System.out.println("(i+40) = " + (i+40));
    }
    public static void main(String[] args) {
        MyClassDoubleColonExample obj = new MyClassDoubleColonExample();
        MyInterface f = obj::myMethod123;
        f.myMethod(50);
    }
}

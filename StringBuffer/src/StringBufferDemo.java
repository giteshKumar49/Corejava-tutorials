public class StringBufferDemo {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        System.out.println("Initial capacity : " + sb.capacity()); // bydefault it is 16

        //In stringBuffer we do not need to reassign to it like in String,
        // Append will do the reassigning work for us automatically.
        sb.append("All the power is within you.");
        sb.append("You can do anything and everything.");
        System.out.println(sb);

        System.out.println("Current Capacity = " + sb.capacity()); // 70

        System.out.println(sb.charAt(10));

        StringBuffer sb1 = new StringBuffer("ABCDE");
        System.out.println(sb1.reverse()); //EDCBA
        System.out.println(sb1);

        System.out.println(sb1.insert(3,"xyz")); // EDCxyzBA

        System.out.println(sb1.delete(3,6));
    }
}

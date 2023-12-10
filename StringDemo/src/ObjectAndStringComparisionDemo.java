public class ObjectAndStringComparisionDemo {
    public static void main(String[] args) {
        User user1 = new User(1,"Gitesh");
        User user2 = new User(1,"Gitesh");

        System.out.println(user1);
        System.out.println(user2);

        System.out.println(user1 == user2);
        // By default .equals() method wil work same as == only for normal classes,
        // it is programmers job to override the .equals() method when using it in
        // their class. But fopr string .equals() method is already overwritten to check the content.
        // This is the reason why the below statement will return false even if the contents of both
        // user objects is same.
         System.out.println(user1.equals(user2));
    }
}

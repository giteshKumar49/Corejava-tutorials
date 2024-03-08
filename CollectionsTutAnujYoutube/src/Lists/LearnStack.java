package Lists;

import java.util.Stack;

public class LearnStack {
    public static void main(String[] args) {
        Stack<String> animals = new Stack<>();

        animals.push("lion");
        animals.push("Dog");
        animals.push("Horse");
        animals.push("Cat");

        System.out.println("animals = " + animals); //animals = [lion, Dog, Horse, Cat]

        System.out.println("animals.peek() = " + animals.peek()); // similar to top

        animals.pop();// remove topmost element from Stack

        System.out.println("animals after pop = " + animals);

        System.out.println("animals.peek() = " + animals.peek());
    }
}

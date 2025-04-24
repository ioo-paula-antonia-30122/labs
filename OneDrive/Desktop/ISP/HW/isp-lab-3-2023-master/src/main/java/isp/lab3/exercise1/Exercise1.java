package isp.lab3.exercise1;

public class Exercise1 {
    public static void main(String[] args) {
        Tree tree1 = new Tree();

        System.out.println("New height after 15 meters growing: " + tree1.grow(15));

        tree1.grow(10);
        System.out.println("Testing toString() after appealing tree1.grow for another 10: " + tree1.toString());

    }
}

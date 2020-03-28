package problem2.main;

import problem1.mybst.MyBinarySearchTree;

// executable class
// use problem1.mybst.MyBinarySearchTree class for creating binary tree
public class MyMain {
    public static void main(String[] args) {
        MyBinarySearchTree obj = new MyBinarySearchTree();
        obj.insert(6);
        obj.insert(1);
        obj.insert(8);
        obj.insert(7);
        obj.insert(5);
        obj.insert(10);
        obj.insert(13);
        obj.insert(36);
        obj.preOrder(obj.root);
        System.out.println();
        obj.postOrder(obj.root);
        System.out.println("\nFirst statement is true");
        System.out.println("Second statement is false as we didn't get the middle point same.");
    }
}

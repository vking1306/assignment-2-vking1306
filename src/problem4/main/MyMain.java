package problem4.main;

import problem1.mybst.MyBinarySearchTree;
import problem4.myqueue.MyQueue;

// executable class
// use problem1.mybst.MyBinarySearchTree class for creating binary tree
public class MyMain {
    public static void main(String[] args) {
        MyBinarySearchTree obj= new MyBinarySearchTree();
        obj.insert(110);
        obj.insert(120);
        obj.insert(84);
        obj.insert(96);
        obj.insert(177);
        obj.insert(72);
        obj.insert(563);
        MyQueue obj1 = new MyQueue();
        obj1.preOrderSucc(obj.root);
        System.out.print("Pre-Order Successor of all the nodes are: ");
        obj1.dispPreOrderSucc();
    }

}
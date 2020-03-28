 package problem1.main;
// executable class

import problem1.mybst.MyBinarySearchTree;

    public class MyMain {
        public static void main(String[] args) {
            MyBinarySearchTree obj = new MyBinarySearchTree();
            obj.insert(2000);
            obj.insert(72);
            obj.insert(46);
            obj.insert(89);
            obj.insert(742);
            obj.insert(2);
            obj.insert(25);
            obj.insert(46);
            System.out.print("Left Child nodes are: ");
            obj.printLeftNode(obj.root);
            System.out.println();
            System.out.println("No of nodes that dosn't have a left child node are: " + obj.getCount());
        }
    }
package problem1.mybst;

import problem1.node.TreeNode;

// to implement BinarySearchTree
public class MyBinarySearchTree {
    public TreeNode root;
    int count;

    //creation of tree structure
    public MyBinarySearchTree() {
        root = null;
    }

    public void insert(int val) {
        TreeNode newnode = new TreeNode();
        newnode.setData(val);
        if (root == null) {
            root = newnode;
        } else {
            TreeNode current = root;
            TreeNode parent;
            while (true) {
                parent = current;
                if (val < current.getData()) {
                    current = current.getLeft();
                    if (current == null) {
                        parent.setLeft(newnode);
                        return;
                    }
                } else {
                    current = current.getRight();
                    if (current == null) {
                        parent.setRight(newnode);
                        return;
                    }
                }
            }
        }
    }

    public void printLeftNode(TreeNode root) {
        if (root == null) {
            return;
        } else {
            if (root.getLeft() != null) System.out.print(root.getLeft().getData() + " ");
            else {
                count++;
            }
            printLeftNode(root.getLeft());
            printLeftNode(root.getRight());
        }
    }

    public int getCount() {
        return count;
    }

    public void preOrder(TreeNode root) {
        if (root == null) {
            return;
        } else {
            System.out.print(root.getData() + " ");
            preOrder(root.getLeft());
            preOrder(root.getRight());
        }
    }

    public void postOrder(TreeNode root) {
        if (root == null) {
            return;
        } else {
            postOrder(root.getLeft());
            postOrder(root.getRight());
            System.out.print(root.getData() + " ");
        }
    }
}
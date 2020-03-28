package problem4.myqueue;
// to create queue to store pre - order successor

import problem1.node.TreeNode;
import problem4.node.Node;

public class MyQueue {
    Node front;
    Node rear;

    public MyQueue() {
        this.front = null;
        this.rear = null;
    }

    public void enqueue(int data){
        Node newNode= new Node();
        newNode.setData(data);
        if(front==null){
            front=newNode;
            rear=newNode;
        }
        else{
            rear.setNext(newNode);
            rear=newNode;
        }
    }
    public void preOrderSucc(TreeNode root){
        if(root!=null){
            enqueue(root.getData());
            preOrderSucc(root.getLeft());
            preOrderSucc(root.getRight());
        }
    }
    public void dispPreOrderSucc(){
        Node temp= front.getNext();
        while(temp!=null){
            System.out.print(temp.getData()+" ");
            temp=temp.getNext() ;
        }
    }
}
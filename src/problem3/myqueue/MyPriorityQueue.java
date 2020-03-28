package problem3.myqueue;

import problem3.node.Node;
import problem5.student.Student;

public class MyPriorityQueue {
    Node head;
    public MyPriorityQueue(){head= null;}

    public void insert(String name,int roll){
        Node newNode=new Node();
        Student obj = new Student();
        obj.setName(name);
        obj.setRoll(roll);
        newNode.setObj(obj);
        Node temp = head;
        if(head == null){
            head= newNode;
        }
        else {
            if(head.getObj().getRoll()>roll){
                newNode.setNext(head);
                head=newNode;
            }
            else {
                while(temp.getNext()!=null && temp.getNext().getObj().getRoll()<roll){
                    temp=temp.getNext();
                }
                newNode.setNext(temp.getNext());
                temp.setNext(newNode);
            }
        }
    }
    public void peep(){
        Node temp=head;
        while(temp!=null){
            System.out.println(temp.getObj().getName()+" "+ temp.getObj().getRoll());
            temp=temp.getNext();
        }
    }
}

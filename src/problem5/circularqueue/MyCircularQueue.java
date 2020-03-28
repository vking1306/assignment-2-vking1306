package problem5.circularqueue;

import problem5.node.Node;
import problem5.student.Student;

//to implement circular queue
public class MyCircularQueue {
    Node front;
    Node rear;
    int count;

    public MyCircularQueue() {
        this.front = null;
        this.rear = null;
        this.count = 0;
    }
    public void enqueue(int roll,int backlog, int acount) {
        Student s = new Student(roll, backlog, acount);
        Node newNode = new Node();
        newNode.setStudent(s);
        if (front == null) {
            front = newNode;
        } else {
            rear.setNext(newNode);
        }
        rear = newNode;
        rear.setNext(front);
        count++;
    }
    public void removeBacklog(){
        while(count>0){
            count--;
            Student temp = front.getStudent();
            if((temp.getBacklog()-temp.getAcount())>0){
                front= front.getNext();
                rear= rear.getNext();
            }
            else{
                rear.setNext(front.getNext());
                front = front.getNext();
            }
        }
    }
    public void disp(){
        Node temp = front;
        System.out.println();
        while(temp.getNext()!=front){
            System.out.println("Roll No: "+temp.getStudent().getRoll()+" Backlog: "+temp.getStudent().getBacklog()+" Appearing Count "+temp.getStudent().getAcount());
            temp= temp.getNext();
        }
        System.out.println("Roll No: "+temp.getStudent().getRoll()+" Backlog: "+temp.getStudent().getBacklog()+" Appearing Count "+temp.getStudent().getAcount());
    }
}
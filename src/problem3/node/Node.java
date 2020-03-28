package problem3.node;

import problem5.student.Student;

public class Node {
    Student obj;
    Node next;

    public Student getObj() {
        return obj;
    }

    public void setObj(Student obj) {
        this.obj=obj;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}

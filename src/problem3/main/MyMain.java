package problem3.main;

import problem3.myqueue.MyPriorityQueue;

// executable class
// use problem5.student.Student class to create object of student
public class MyMain {
    public static void main(String[] args) {
        MyPriorityQueue obj = new MyPriorityQueue();
        obj.insert("Varan",42);
        obj.insert("deepanshu",14);
        obj.insert("chandresh",13);
        obj.insert("dheeraj",18);
        obj.insert("ishan",22);
        obj.insert("jagrat",23);
        System.out.println("Students according to their roll number are: ");
        obj.peep();
    }
}


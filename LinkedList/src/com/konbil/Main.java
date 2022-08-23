package com.konbil;

public class Main {

    public static void main(String[] args) {
	// write your code here
        LL l = new LL();
        l.insertFirst(5);
        l.insertFirst(1);
        l.insertFirst(10);
        l.insertFirst(12);
        l.insertFirst(3);
        l.insertFirst(2);

        l.insertLast(99);

        l.insert(1000,2);
        l.display();
        System.out.println();
        System.out.println(l.deleteFirst());
        l.display();
        System.out.println();
        System.out.println(l.deleteLast());
        l.display();
    }
}

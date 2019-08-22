package com.example.test;

import academy.learnprogramming.common.Employee;
import academy.learnprogramming.list.DoublyLinkedList;

public class DoublyLinkedListTest {

	public static void main(String[] args) {
		Employee janeNones = new Employee("Jane", "Jones", 123);
		Employee johnDoe = new Employee("John", "Doe", 4567);
		Employee marySmith = new Employee("Mary", "Smith", 22);
		Employee mikeWilson = new Employee("Mike", "Wilson", 3245);
		DoublyLinkedList list = new DoublyLinkedList();
		list.addToFront(janeNones);
		list.addToFront(johnDoe);
		list.addToFront(marySmith);
		list.addToFront(mikeWilson);
		System.out.println(list.getSize());
		list.printList();
		
		Employee billEnd = new Employee("Bill", "End", 589);
		list.addToEnd(billEnd);		
		System.out.println(list.getSize());
		list.printList();
		
		list.removeFromFront();		
		System.out.println(list.getSize());
		list.printList();
		
		list.removeFromLast();
		System.out.println(list.getSize());
		list.printList();
		
	}

}

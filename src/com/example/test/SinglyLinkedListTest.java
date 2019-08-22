package com.example.test;

import academy.learnprogramming.common.Employee;
import academy.learnprogramming.list.SinglyLinkedList;

public class SinglyLinkedListTest {

	public static void main(String[] args) {
		Employee janeNones = new Employee("Jane", "Jones", 123);
		Employee johnDoe = new Employee("John", "Doe", 4567);
		Employee marySmith = new Employee("Mary", "Smith", 22);
		Employee mikeWilson = new Employee("Mike", "Wilson", 3245);
		
		SinglyLinkedList list = new SinglyLinkedList();
		System.out.println("Is Empty : "+list.isEmpty());
		list.addToFront(janeNones);
		list.addToFront(johnDoe);
		list.addToFront(marySmith);
		list.addToFront(mikeWilson);
		list.printList();
		System.out.println();
		System.out.println("Size : "+list.getSize());
		list.removeFromFront();
		System.out.println("Size after removing : "+list.getSize());
		list.printList();
	}

}

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
		list.printList();
	}

}

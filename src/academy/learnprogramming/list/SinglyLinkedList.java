package academy.learnprogramming.list;
//it works only with Employee class for now..

import academy.learnprogramming.common.Employee;
import academy.learnprogramming.common.EmployeeNode;

public class SinglyLinkedList {
	private EmployeeNode head;
	private int size;
	public void addToFront (Employee employee) {
		EmployeeNode node = new EmployeeNode(employee);
		node.setNext(head); //current head will become the second node 
		head=node; //current head will become current node
		size++;
	}
	public EmployeeNode removeFromFront() {
		if(isEmpty())
			return null;
		EmployeeNode removedNode = head;
		head=head.getNext();
		size--;
		removedNode.setNext(null); //not necessary, but still....
		return removedNode;
	}
	public int getSize() {
		return size;
	}
	public boolean isEmpty() {
		return head==null;
	}
	public void printList() {
		EmployeeNode current = head;
		System.out.print("Head -> ");
		while(current != null) {
			System.out.print(current);
			System.out.print(" -> ");
			current=current.getNext();			
		}
		System.out.print("null");
	}
}

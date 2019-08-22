package academy.learnprogramming.list;

import academy.learnprogramming.common.Employee;
import academy.learnprogramming.common.EmployeeNodeDoubly;

public class DoublyLinkedList {
	private EmployeeNodeDoubly head;
	private EmployeeNodeDoubly tail;
	private int size;
	public void addToFront (Employee employee) {
		EmployeeNodeDoubly node = new EmployeeNodeDoubly(employee);
		node.setNext(head);
		if(head == null) {
			tail = node;
		}else {
			head.setPrevious(node);
		}
		head=node;
		size++;
	}
	public void addToEnd (Employee employee) {
		
	}
	public EmployeeNodeDoubly removeFromFront() {
		if(isEmpty())
			return null;
		EmployeeNodeDoubly removedNode = head;
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
		EmployeeNodeDoubly current = head;
		System.out.print("Head -> ");
		while(current.getNext() != null) {
			System.out.print(current);
			System.out.print(" <-> ");
			current=current.getNext();			
		}
		System.out.print("null");
	}
}

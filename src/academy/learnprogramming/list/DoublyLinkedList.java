package academy.learnprogramming.list;

import academy.learnprogramming.common.Employee;
import academy.learnprogramming.common.EmployeeNodeDoubly;

public class DoublyLinkedList {
	private EmployeeNodeDoubly head;
	private EmployeeNodeDoubly tail;
	private int size;
	public void addToFront (Employee employee) {
		EmployeeNodeDoubly node = new EmployeeNodeDoubly(employee);
		if(head == null) {
			tail = node;
		}else {
			node.setNext(head);
			head.setPrevious(node);
		}
		head=node;
		size++;
	}
	public void addToEnd (Employee employee) {
		EmployeeNodeDoubly node = new EmployeeNodeDoubly(employee);
		if(tail == null) {
			head = node;
		}else {
			tail.setNext(node);
			node.setPrevious(tail);
		}
		tail=node;
		size++;
	}
	public EmployeeNodeDoubly removeFromFront() {
		if(isEmpty())
			return null;
		EmployeeNodeDoubly removedNode = head;
		if(head.getNext() == null)
			tail=null;
		else
			head.getNext().setPrevious(null);
		head = head.getNext();
		size--;
		removedNode.setNext(null); //not required but still...
		return removedNode;
	}
	public EmployeeNodeDoubly removeFromLast() {
		if(isEmpty())
			return null;
		EmployeeNodeDoubly removedNode = tail;
		if(tail.getPrevious() == null)
			head=null;
		else
			tail.getPrevious().setNext(null);
		tail = tail.getPrevious();
		size--;
		removedNode.setPrevious(null); //not required but still...
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
		while(current != null) {
			System.out.print(current);
			System.out.print(" <-> ");
			current=current.getNext();			
		}
		System.out.println("null");
	}
}

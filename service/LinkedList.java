package LinkedList.service;

import LinkedList.beans.Employee;

public class LinkedList {
	Node head;
	
	public class Node{
		Employee emp;
		Node next;
		

		public Node(Employee emp) {
			this.emp = emp;
		}
	}
	
	public void add(Employee emp) {
		Node newNode = new Node(emp);
		if(head == null) {
			head = newNode;
			newNode.next = null;
		}
		else {
			Node temp = head;
			while(temp.next != null) {
				temp = temp.next;
			}
			temp.next=newNode;
			temp = newNode;
			newNode.next = null;
		}
		System.out.println("Added Successfully");
	}
	
	public void display() {
		Node temp = head;
		if(temp == null) {
			System.out.println("No employees Present");
		}
		else {
			while(temp != null) {
				System.out.println(temp.emp.toString());
				temp = temp.next;
			}
		}
		
	}

	public void search(int id) {
		Node temp = head;
		if(temp == null) {
			System.out.println("No employees Present");
		}
		else {
			while(temp.emp.getEmpid()!=id && temp.next != null) {
				temp = temp.next;
			}
			if(temp != null) {
				System.out.println(temp.emp.toString());
			}
		}
		
	}
	
	public void delete(int id) {
		Node temp = head;
		if(temp == null) {
			System.out.println("No employees Present");
		}
		else if(head.emp.getEmpid() == id) {
			head = temp.next;
			temp.next = null;
			temp = null;
		}
		else {
			Node current = head;
			while(temp.emp.getEmpid()!=id && temp.next != null) {
				current = temp;
				temp = temp.next;
			}
			if(temp != null) {
				current.next = temp.next;
				temp.next = null;
				temp = null;
				System.out.println("Deleted Successfully");
			}
			else {
				System.out.println("ID not found...");
			}
		}
	}

}

package LinkedList.service;

import java.util.Scanner;

import LinkedList.beans.Employee;

public class EmployeeService {
	Scanner sc = new Scanner(System.in);
	
	LinkedList ll = new LinkedList();

	public void add() {
		System.out.println("Enter ID");
		int id = sc.nextInt();
		System.out.println("Enter name");
		String nm = sc.next();
		System.out.println("Enter Salary");
		double sal = sc.nextDouble();
		Employee emp = new Employee(id, nm, sal);
		ll.add(emp);
	}

	public void search(int id) {
		
		ll.search(id);
		
	}

	public void delete(int eid) {
		ll.delete(eid);
		
	}

	public void display() {
		ll.display();
		
	}

}

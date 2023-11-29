package LinkedList.test;

import java.util.Scanner;

import LinkedList.service.EmployeeService;

public class TestEmployee {

	public static void main(String[] args) {
		EmployeeService emp = new EmployeeService();
		Scanner sc = new Scanner(System.in);
		int choice;
		do {
			System.out.println("1. Add new Employee");
			System.out.println("2. Search Employee by ID");
			System.out.println("3. Delete Employee by ID");
			System.out.println("4. Display All");
			System.out.println("5. Exit");
			choice = sc.nextInt();
			switch(choice) {
			case 1: emp.add();
				break;
				
			case 2:System.out.println("Enter ID");
					int id = sc.nextInt();
					emp.search(id);
				break;
				
			case 3: System.out.println("Enter ID");
					int eid = sc.nextInt();
					emp.delete(eid);
				break;
				
			case 4:emp.display();
				break;
				
			case 5: System.out.println("Thank you");
			 		System.exit(0);
				break;
				
			}
		}while(choice != 5);
	}
}

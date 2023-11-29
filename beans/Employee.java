package LinkedList.beans;

public class Employee {

	private int empid;
	private String name;
	private double sal;
	
	public Employee(int empid, String name, double sal) {
		super();
		this.empid = empid;
		this.name = name;
		this.sal = sal;
	}
	
	

	public Employee() {
		this.empid = 0;
		this.name = null;
		this.sal = 0;
	}



	public int getEmpid() {
		return empid;
	}



	public void setEmpid(int empid) {
		this.empid = empid;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public double getSal() {
		return sal;
	}



	public void setSal(double sal) {
		this.sal = sal;
	}



	@Override
	public String toString() {
		return "\nEmployee: \nEmployee ID : " + empid + "\nName : " + name + "\nSalary : " + sal;
	}
	
	
}

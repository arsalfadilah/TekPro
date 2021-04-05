package staticTest;

/*
 * Static Method
 * Version 1.1
 * Author Kazuno
 */

public class StaticTest {
	public static void main(String[] args){
		Employee[] staff = new Employee[3];
		
		staff[0] = new Employee("Dynamix", 45000);
		staff[1] = new Employee("Rineru", 55000);
		staff[2] = new Employee("Lawliet", 25000);
		
		for (Employee employee : staff) {
			System.out.println("Name = " + employee.getName()+ ",Salary = "+ employee.getSalary());
		}
		
		int n = Employee.getNextId();
		System.out.println("Next availabel id = "+n);
	}
}

class Employee{
	private static int nextId = 1;
	
	private String name;
	private double salary;
	private int id;
	
	public Employee(String n, double s){
		name = n;
		salary = s;
		id = 0;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public double getSalary() {
		return salary;
	}
	
	public void setId() {
		id = nextId;
		nextId++;
	}
	
	public static int getNextId(){
		return nextId;
	}
	
	public static void main(String[] args){
		Employee e = new Employee("Kazuno",75000);
		System.out.println(e.getName() + " "+ e.getSalary());
	}
}

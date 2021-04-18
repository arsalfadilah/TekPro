import java.util.*;

/*
 * Object Constructor
 * Version 0.1
 * Author : Kazuno
 */

public class ConstructorTest {

	public static void main(String[] args){
		
		Employee[] staff = new Employee[3];
		
		staff[0] = new Employee("Harry",4000);
		staff[1] = new Employee(60000);
		staff[2] = new Employee();
		
		for (Employee e: staff) {
			System.out.println("Name = " + e.getName() + " ,id = "+e.getId()+" ,Salary = "+e.getSalary());
		}
	}
	
}

class Employee{
	private static int nextId;
	private int id;
	private String name = "";
	private double salary;
	
	static
	{
		Random generator = new Random();
		nextId = generator.nextInt(10000);
	}
	
	{
		id = nextId;
		nextId++;
	}

	public Employee(String n, double s)
	{
		name = n;
		salary = s;
	}

	public Employee(double s)
	{
		this("Employee #" + nextId, s);
	}
	
	public Employee(){
		// name initialized to ""--see above
		// salary not explicitly set--initialized to 0
		// id initialized in initialization block
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
	
}

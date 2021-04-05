package employeeTest;

import java.time.*;

/*
 * Employee Class
 * Version 1.0
 * Author Kazuno
 */

public class EmployeeTest {
	public static void main(String[] args){
		Employee[] staff = new Employee[3];
		
		staff[0] = new Employee("Kazuno", 75000, 2001, 5, 8);
		staff[1] = new Employee("Rineru", 55000, 2002, 6, 29);
		staff[2] = new Employee("Lawliet", 25000, 2002, 8, 5);
		
		for (Employee employee : staff) {
			employee.raiseSalary(5);
		}
		
		for (Employee employee : staff) {
			System.out.println("Name = " + employee.getName()+ ",Salary = "+ employee.getSalary()+ ",Hire Day = "+employee.getHireDay());
		}
	}
}

class Employee{
	private String name;
	private double salary;
	private LocalDate hireDay;
	
	public Employee(String n, double s, int year, int month, int day){
		name = n;
		salary = s;
		hireDay = LocalDate.of(year,month,day);
	}
	
	public String getName() {
		return name;
	}

	public double getSalary() {
		return salary;
	}

	public LocalDate getHireDay() {
		return hireDay;
	}

	public void raiseSalary(double byPercent){
		double raise = salary* byPercent / 100;
		salary += raise;
	}
	
}

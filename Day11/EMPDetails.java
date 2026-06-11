package basic.Day11;

class Employee {
	String name;
	int age;
	int salary;
	
	Employee() {
		System.out.println("Constructor called");
		name = "Ram";
		age = 23;
		salary = 20000;
	}
	
	void display() {
		System.out.println("Employee name: " + name);
		System.out.println("Age: " + age);
		System.out.println("Salary: " + salary);
	}
}
public class EMPDetails {
	public static void main(String args[]) {
		
		Employee e1 = new Employee();
		e1.display();
	}

}

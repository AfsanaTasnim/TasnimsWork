package moreonthirdchapter;

//This is a test application named EmplpyeeTest that demonstrates class Employee's capabilities.

public class EmployeeTest {

	public static void main(String[] args) {
		Employee e1 = new Employee("Afsana", "Tasnim", 400.00);		//I am creating an employee object here.
		Employee e2 = new Employee("Michael", "Phelps", 40000.00);  //Another employee object created.
		
	
		double p = e1.yearlySalary();
		double q = e2.yearlySalary();
		double r = e1.afterRaiseYearlySalary();
		double s = e2.afterRaiseYearlySalary();
		
		//Displaying each objects yearly salary
		System.out.println("The yearly salary of " + e1.getFirstName() + " " + e1.getLastName() + " is: $" + p);
		System.out.println("The yearly salary of " + e2.getFirstName() + " " + e2.getLastName() + " is: $" + q);
		
		//Displaying each objects yearly salary, after a raise of 10%
		System.out.println("After raise, the yearly salary of " + e1.getFirstName()  + " " + e1.getLastName() + " is: $"+ r);
		System.out.println("After raise, the yearly salary of " + e2.getFirstName() + " " + e2.getLastName() + " is: $" + s);

	}

}

package moreonthirdchapter;
//The class name is Employee.
public class Employee {
	private String firstName;			//firstName is an instance variable here.
	private String lastName;			//lastName is an instance variable here.
	private double monthlySalary;		//monthlySalary is an instance variable here.
	
	public Employee(String fName, String lName, double mSalary) {		//This is a constructor.
		firstName = fName;												//The constructor initializes the three instance variables.
		lastName = lName;
		if(monthlySalary < 0) {
			monthlySalary = 0;
		}
		else 
			monthlySalary = mSalary;
	}
	
	public String getFirstName() {										//This is a get method for the instance variable firstName
		return firstName;
	}
	
	public void setFirstName(String fName) {							//This is a set method for the instance variable firstName
		firstName = fName;
	}
	
	
	public String getLastName() {										//This is a get method for the instance variable lastName
		return lastName;
	}
	
	public void setLastName(String lName) {								//This is a set method for the instance variable lastName
		lastName = lName;
	}
	
	public double getMonthlySalary() {									//This is a get method for the instance variable monthlySalary
		return monthlySalary;
	}
	
	public void setMonthlySalary(double mSalary) {						//This is a set method for the instance variable monthlySalary
		if(monthlySalary < 0) {											//If monthly salary is not positive, we are not setting its value
			monthlySalary = 0;
		} 
		else
			monthlySalary = mSalary;
	}
	
	//A method to calculate yearly salary
	public double yearlySalary() {
		double yearlySalary = 12 * monthlySalary;
		return yearlySalary;
	}
	
	//A method to calculate yearly salary, after a raise of 10%
	public double afterRaiseYearlySalary() {
		double afterRaiseMonthlySalary = 0.1*monthlySalary + monthlySalary;
		double afterRaiseYearlySalary = 12 * afterRaiseMonthlySalary;
		
		return afterRaiseYearlySalary;
	}
	
	
	
	
}

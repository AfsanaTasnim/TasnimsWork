package calculate_heart_rate;
//The class name is HeartRates
/*
 * The formula for calculating your maximum heart rate in beats per minute is 220 minus your age in years. 
 * Your target heart rate is a range that's 50-85% of your maximum heart rate.
 */

public class HeartRates {
	private String firstName;   //This is a variable.
	private String lastName;	//This is a variable.
	private int month;			//This is a variable.
	private int day;			//This is a variable.
	private int year;			//This is a variable.
	
	public HeartRates(String fName, String lName, int m, int d, int y) {	//This is a constructor.
		firstName = fName;													//The constructor receives data as parameters.
		lastName = lName;
		month = m;
		day = d;
		year = y;
	}
	
	public String getFirstName() {				//This is a get method for variable firstName.
		return firstName;
	}
	
	public void setFirstName(String fName) {	//This is a set method for variable lastName.
		firstName = fName;
	}
	
	public String getLastName() {				//This is a get method for variable lastName.
		return lastName;
	}
	
	public void setLastName(String lName) {		//This is a set method for variable lastName.
		lastName = lName;
	}
	
	public int getMonth() {						//This is a get method for variable month.
		return month;
	}
	
	public void setMonth(int m) {				//This is a set method for variable month.
		month = m;
	}
	
	public int getDay() {						//This is a get method for variable day.
		return day;
	}
	
	public void setDay(int d) {					//This is a set method for variable day.
		day = d;
	}
	
	public int getYear() {						//This is a get method for variable year.
		return year;
	}
	
	public void setYear(int y) {				//This is a set method for variable year.
		year = y;
	}
	
	
	public int AgeOfPerson(int year) {			//This method calculates and returns the person's age (in years).
		int age = 2017 - year;
		
		return age;
	}
	
	public int MaxHeartRate(int age) {			//This method calculates and returns the person's maximum heart rate.
		int max = 220 - age;
		
		return max;
	}
	
	public void TargetHeartRate(int max) {		//This method calculates and returns the person's target heart rate.
		double first = 0.5*max;
		double last = 0.85*max;
		
		System.out.println("The target heart rate range is: " + first + "-" + last + "%.");
	}
}

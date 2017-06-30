package calculate_heart_rate_and_bmi;
/*
 * The formula for calculating your maximum heart rate in beats per minute is 220 minus your age in years. 
 * Your target heart rate is a range that's 50-85% of your maximum heart rate.
 */

public class HealthProfile {
	private String firstName;			//This is a class attribute.
	private String lastName;			//This is a class attribute.
	public String gender;				//This is a class attribute.
	private int month;					//This is a class attribute.
	private int day;					//This is a class attribute.
	private int year;					//This is a class attribute.
	private double height;				//This is a class attribute.
	private double weight;				//This is a class attribute.
	
	public HealthProfile(String fName, String lName, String g, int m, int d, int y, double h, double w) {
		firstName = fName;				//This is a constructor that receives the data.
		lastName = lName;
		gender = g;
		month = m;
		day = d;
		year = y;
		height = h;
		weight = w;
	}
	
	public String getFirstName() {						//This is get method for the variable firstName.
		return firstName;
	}
	
	public void setFirstName(String fName) {			//This is set method for the variable firstName.
		firstName = fName;
	}
	
	public String getLastName() {						//This is get method for the variable lastName.
		return lastName;
	}
	
	public void setLastName(String lName) {				//This is set method for the variable lastName.
		lastName = lName;
	}
	
	public String getGender() {							//This is get method for the variable gender.
		return gender;
	}
	
	public void setGender(String g) {					//This is set method for the variable gender.
		gender = g;
	}
	
	public int getMonth() {								//This is get method for the variable month.
		return month;
	}
	
	public void setMonth(int m) {						//This is set method for the variable month.
		month = m;
	}
	
	public int getDay() {								//This is get method for the variable day.
		return day;
	}
	
	public void setDay(int d) {							//This is set method for the variable day.
		day = d;
	}
	
	public int getYear() {								//This is get method for the variable year.
		return year;
	}
	
	public void setYear(int y) {						//This is set method for the variable year.
		year = y;
	}
	
	public double getHeight() {							//This is get method for the variable height.
		return height;
	}
	
	public void setHeight(double h) {					//This is set method for the variable height.
		height = h;
	}
	
	public double getWeight() {							//This is get method for the variable weight.
		return weight;
	}
	
	public void setWeight(double w) {					//This is set method for the variable weight.
		weight = w;
	}
	
	public int AgeOfPerson(int year) {					//This method calculates and returns user's age in years.
		int age = 2017 - year;
		
		return age;
	}
	
	public int MaxHeartRate(int age) {					//This method calculates and returns the user's maximum heart rate.
		int max = 220 - age;
		
		return max;
	}
	
	public void TargetHeartRate(int max) {				//This method calculates and returns the user's target heart rate.
		double first = 0.5 * max;
		double last = 0.85 * max;
		
		System.out.println("The target heart rate is " + first + "-" + last + "%.");
	}
	
	public double BMI(double weight, double height) {	//This method calculates and returns the user's body mass index (BMI).
		double bmi = (weight * 703) / (height * height);
		
		return bmi;
	}
	
	
}

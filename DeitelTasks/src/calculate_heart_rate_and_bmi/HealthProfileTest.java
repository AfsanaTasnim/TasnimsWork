package calculate_heart_rate_and_bmi;

import java.util.Scanner;

public class HealthProfileTest {

	public static void main(String[] args) {
		
		HealthProfile p = new HealthProfile("", "", "", 0, 0, 0, 0.0, 0.0);  //Instantiates an object of class HealthProfile for that person.
		Scanner input = new Scanner(System.in);
		
		//Prompts the user to enter the first name.
		System.out.println("Enter your first name: ");
		String firstName = input.nextLine();
		p.setFirstName(firstName);
		
		//Prompts the user to enter the last name.
		System.out.println("Enter your last name: ");
		String lastName = input.nextLine();
		p.setLastName(lastName);
		
		//Prompts the user to enter the gender.
		System.out.println("Enter your gender: ");
		String gender = input.nextLine();
		p.setGender(gender);
		
		//Prompts the user to enter the month in which he was born.
		System.out.println("Enter the month in which you were born: ");
		int month = input.nextInt();
		p.setMonth(month);
		
		//Prompts the user to enter the day in which he was born.
		System.out.println("Enter the day in which you were born: ");
		int day = input.nextInt();
		p.setDay(day);
		
		//Prompts the user to enter the year in which he was born.
		System.out.println("Enter the year in which you were born: ");
		int year = input.nextInt();
		p.setYear(year);
		
		//Prompts the user to enter the height.
		System.out.println("Enter your height: ");
		double height = input.nextDouble();
		p.setHeight(height);
		
		//Prompts the user to enter the weight.
		System.out.println("Enter your weight: ");
		double weight = input.nextDouble();
		p.setWeight(weight);
		
		System.out.println("Hello " + p.getFirstName() + " " + p.getLastName() + ".");		//Prints the user's name.
		System.out.println("Your gender is " + p.getGender() + ".");						//Prints the user's gender.
		System.out.println("Your date of birth is " + p.getDay() + "/" + p.getMonth() + "/" + p.getYear() + ".");  //Prints the user's birthday.
		System.out.println("Your height is: " + p.getHeight() + " inches.");				//Prints the user's height.
		System.out.println("Your weight is: " + p.getWeight() + " pounds.");				//Prints the user's weight.
		
		int a = p.AgeOfPerson(year);
		System.out.println("You are " + a + " years old.");				//Prints the user's age (in years).
		
		double b = p.BMI(weight, height);								
		System.out.println("Your BMI is " + b + ".");					//Prints the user's body mass index (BMI).
		
		int c = p.MaxHeartRate(a);
		System.out.println("Your maximum heart rate is " + c + ".");    //Prints the user's Maximum HeartRate.
		
		p.TargetHeartRate(c);											//Prints the user's Target Heart Rate.
		
		
		
		System.out.println("");
		System.out.println("BMI VALUES");								//Displays the BMI chart.
		System.out.println("Underweight: less than 18.5");
		System.out.println("Normal: between 18.5 and 24.9");
		System.out.println("Overweight: between 25 and 29.9");
		System.out.println("Obese: 30 or greater");
		
	}

}

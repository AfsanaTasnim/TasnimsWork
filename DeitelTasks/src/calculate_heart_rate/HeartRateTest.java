package calculate_heart_rate;
import java.util.Scanner;

public class HeartRateTest {

	public static void main(String[] args) {
		
		HeartRates h = new HeartRates("", "", 0, 0, 0);			//Instantiates an object of class HeartRates.
		
		Scanner input = new Scanner(System.in);
		
		
		//Prompts the user to enter his first name.
		System.out.println("Enter the person's first name: ");
		String firstName = input.nextLine();
		h.setFirstName(firstName);
		
		//Prompts the user to enter his last name. 
		System.out.println("Enter the person's last name: ");
		String lastName = input.nextLine();
		h.setLastName(lastName);
		
		//Prompts the user to enter the month in which he was born.
		System.out.println("Enter the month in which the person was born: ");
		int month = input.nextInt();
		h.setMonth(month);
		
		//Prompts the user to enter the day in which he was born.
		System.out.println("Enter the day in which the person was born: ");
		int day = input.nextInt();
		h.setDay(day);
		
		//Prompts the user to enter the year in which he was born. 
		System.out.println("Enter the year in which the person was born: ");
		int year = input.nextInt();
		h.setYear(year);
		
		
		
		
		System.out.println("Hello " + h.getFirstName() + " " + h.getLastName() + ", "); //Prints the person's name.
		System.out.println("Your date of birth is: " + h.getMonth() + "/" + h.getDay() + "/" + h.getYear() + "."); //Prints the person's date of birth.
		int p = h.AgeOfPerson(year);
		System.out.println("Your are " + h.AgeOfPerson(year) + " years old.");  //Prints the person's age (in years).
		System.out.println("Your maximun heart rate is " + h.MaxHeartRate(p) + " beats per minute."); //Prints the person's maximum heart rate.
		int q = h.MaxHeartRate(p);
		h.TargetHeartRate(q);		//Prints the persons target-heart-rate.
		
		

	}

}

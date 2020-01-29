package lab8;

/**
 * 
 * @author JeannieMcCarthy
 *
 */
import java.util.*;

public class Lab8 {
	public static void main(String[] args) {

		Scanner scnr = new Scanner(System.in);
		int userChoiceID;
		boolean goAgain = false;

		System.out.print("Welcome to the class information lookup system.");

		do {
			System.out.print("Please enter the Student ID of the Student you wish to know about: ");
			try {
				userChoiceID = scnr.nextInt();
			// System.out.println(studentID[userChoiceID-1]);
			
				Methods8.getInfo(scnr, userChoiceID);
			} catch (Exception e) {
				e.printStackTrace();
				System.out.println("Something went wrong. Try Again!");
			}
			System.out.println("Would you like to know about another student?");
			goAgain = scnr.next().toLowerCase().startsWith("y");
		} while (goAgain);

		System.out.println("Thank you, goodbye.");
		scnr.close();
	}
}

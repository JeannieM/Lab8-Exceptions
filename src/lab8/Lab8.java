package lab8;

/**
 * 
 * @author JeannieMcCarthy
 *
 */
import java.util.*;

public class Lab8 {
	public static void main(String[] args) throws Exception {

		Scanner scnr = new Scanner(System.in);
		int userChoiceID;
		boolean goAgain = true;

		System.out.println("Welcome to the class information lookup system.");

		do {
			System.out.print("Please enter the Student ID of the Student you wish to know about: ");
			userChoiceID = scnr.nextInt();
			try {
				Methods8.getInfo(scnr, userChoiceID);
				System.out.println("Would you like to know about another student?");
				goAgain = scnr.next().toLowerCase().startsWith("y");
			} catch (IndexOutOfBoundsException e) {
				// e.printStackTrace();
				System.out.println(e.getMessage());
			}
		} while (goAgain);

		System.out.println("Thank you, goodbye.");
		scnr.close();
	}
}

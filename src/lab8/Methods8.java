package lab8;

/**
 * @author JeannieMcCarthy
 */
import java.util.*;

public class Methods8 {

	public static void getInfo(Scanner scnr, int userChoiceID) throws Exception {

		int[] studentID = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		String[] studentName = { "Brian Jones", "Jimi Hendrix", "Janis Joplin", "Alan \"Blind Owl\" Wilson",
				"Jim Morrison", "Ron \"Pigpen\" McKernan", "Kurt Cobain", "Jeremy Ward", "Amy Winehouse",
				"Anton Yelchin" };
		String userChoice, firstName;
		boolean goAgain = true;

		if (userChoiceID > 10 || userChoiceID < 1) {
			throw new ArrayIndexOutOfBoundsException("You must not have entered a number 1-10. Try again!");
		}
		for (int i = 0; i < studentName.length; i++) {
			firstName = studentName[i].substring(0, studentName[i].indexOf(" "));
			if (i == userChoiceID - 1) {
				System.out.println("Student " + studentID[userChoiceID - 1] + " is " + studentName[i] + ".");
				do {
					try {
						System.out.println("What would you like to know about " + firstName + "? "
								+ "Type \"Food\" or \"Hobby\" : ");
						userChoice = scnr.next();

						switch (userChoice) {
						case "Food":
							System.out.println(firstName + "'s favourite food is " + getFaveFood(i) + ".");
							break;
						case "Hobby":
							System.out.println(firstName + "'s hobby is " + getHobby(i) + ".");
							break;
						default:
							throw new Exception("Please enter exactly \"Food\" or exactly \"Hobby\".");
						}
						// try {
						scnr.nextLine();
						System.out.println("Would you like to know anything else about " + firstName + "? (yes/no)");
						if (scnr.nextLine().toLowerCase().startsWith("y")) {
							goAgain = true;
						} else if (scnr.nextLine().toLowerCase().startsWith("n")) {
							goAgain = false;
						}
						// throw new Exception("Let's make this simple shall we? Just enter \"y\" or
						// \"n\":");

						// }catch (InputMismatchException e) {//FIXME I want this exception to lead user
						// to try line 43 again
						// System.out.println(e.getMessage());
						// }
					} catch (Exception e) {
						System.out.println(e.getMessage());
					}
				} while (goAgain);
			} 
		}
	}

	public static String getFaveFood(int i) {
		String faveFood;
		String[] studentFaveFood = { "Agedashi Tofu", "Sushi", "Fried Worms", "Okonomiyaki", "Gyoza", "Jap Chae",
				"Bibimbop", "Filet Mignon", "Ambrosia", "Takoyaki" };
		faveFood = studentFaveFood[i];
		return faveFood;
	}

	public static String getHobby(int i) {
		String hobby;
		String[] studentHobby = { "Krav Maga", "Tatting", "Hot Dog Eating Contests", "Collecting Collectibles",
				"LARPing", "Playing CalvinBall", "Parkor", "Square Dancing", "Playing the Theremin", "Climbing Trees" };
		hobby = studentHobby[i];
		return hobby;
	}
}

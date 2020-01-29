package lab8;
/**
 * @author JeannieMcCarthy
 */
import java.util.*;
public class Methods8 {
	
	public static void getInfo(Scanner scnr, int userChoiceID) {
		
		int[] studentID = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		String[] studentName = {"Brian Jones", "Jimi Hendrix", "Janis Joplin", 
				"Alan \"Blind Owl\" Wilson", "Jim Morrison", "Ron \"Pigpen\" McKernan", 
				"Kurt Cobain", "Jeremy Ward", "Amy Winehouse", "Anton Yelchin"};
		
		String userChoice, firstName;
		boolean goAgain;
		
		for (int i = 0; i < studentName.length; i++) {
			firstName = studentName[i].substring(0, studentName[i].indexOf(" "));
			if (i == userChoiceID - 1) {
				System.out.println("Student " + studentID[userChoiceID-1] + " is " +studentName[i] + ".");
				do {
						System.out.println("What would you like to know about " + firstName + "? "
							+ "Type \"Food\" or \"Hobby\" : ");
					userChoice = scnr.next();
					
					switch (userChoice) {
						case "Food":
							System.out.println(firstName + "'s favourite food is " + getFaveFood(i) + ".");
							break;
						case "Hobby" :
							System.out.println(firstName + "'s hobby is " + getHobby(i) + ".");
							break;
						default : break;
					}
					System.out.println("Would you like to know anything else about " + firstName + "? (yes/no)");
					goAgain = scnr.next().toLowerCase().startsWith("y");
					
				} while (goAgain);
			}
		}	
	}
	
	public static String getFaveFood(int i) {
		String faveFood;
		String[] studentFaveFood = {"Agedashi Tofu", "Sushi", "Fried Worms", 
				"Okonomiyaki", "Gyoza", "Jap Chae", 
				"Bibimbop", "Filet Mignon", "Ambrosia", "Takoyaki"};
		faveFood = studentFaveFood[i];
		return faveFood;
	}
	
	public static String getHobby(int i) {
		String hobby;
		String[] studentHobby = {"Krav Maga", "Tatting", "Hot Dog Eating Contests", 
				"Collecting Collectibles", "LARPing", "Playing CalvinBall", 
				"Parkor", "Square Dancing", "Playing the Theremin", "Climbing Trees"};
		hobby = studentHobby[i];
		return hobby;
	}
}

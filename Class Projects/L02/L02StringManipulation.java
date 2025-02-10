import java.util.Scanner;

/**
 * 1/5/24
 * Author Ayo Bond
 * String tickling
 */

public class L02StringManipulation {

	public static void main(String[] args) {
		Scanner szKeyboard = new Scanner(System.in);
		
		System.out.println("-----METHOD 1 (.length)-----");
		
		String szName = "Akingbehin";
		int iNameLength = szName.length();
		
		System.out.println(iNameLength);
		
		//every String ends with (0) and ends with (.length - 1)
		
		System.out.println("-----METHOD 2 (.ToUpperCase and .ToLowerCase)-----");
		
		String szChoice;
		System.out.print("Would you like to continue, Y or N? ");
		szChoice = szKeyboard.nextLine().toUpperCase();
		
		System.out.println("You have chosen: " + szChoice);
		System.out.println(szName.toLowerCase());
		
		System.out.println("-----METHOD 3 (.susbtring)-----");
		
		String szCountryName = "Germany";
		String szCode = szCountryName.substring(0,3);
		System.out.println(szCountryName + " is shortened to " + szCode.toUpperCase());
		
		szKeyboard.close();
	}

}

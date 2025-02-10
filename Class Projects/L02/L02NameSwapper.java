import java.util.Scanner;

/**
 * Author Ayo Bond
 * 15/05/2024
 * To swap the first 2 letters of a first name
 * and surname
 */
public class L02NameSwapper {

	public static void main(String[] args) {
			Scanner szKeyboard = new Scanner(System.in);
			
			String szFirstName;
			String szLastName;
			String szNewName;
			
			System.out.print("What is your first name? ");
			szFirstName = szKeyboard.nextLine();
			System.out.print("What is your last name? ");
			szLastName = szKeyboard.nextLine();
			
			szNewName = szLastName.substring(0,2) + szFirstName.substring(2) + " " +
						szFirstName.substring(0,2) + szLastName.substring(2);
			
			System.out.println("This is your original name: " + szFirstName + " " + szLastName);
			System.out.println("This is your new name: " + szNewName);
			
			szKeyboard.close(); //Closes scanner
	}//end main

}//end class

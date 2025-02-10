import java.util.Scanner;

/**
 * 30/4/24
 * Author Ayo Bond
 * To store a user's postcode and town they live
 */

public class L02PostmanPat {

	public static void main(String[] args) {
		
		//Initialisation
		String szPostcode;
		String szTown;
		char chTownCode;
		
		Scanner szKeyboard = new Scanner(System.in);

		//Input
		System.out.print("Enter your postcode: ");
		szPostcode = szKeyboard.nextLine();
		System.out.print("Enter your town: ");
		szTown = szKeyboard.nextLine();
		
		chTownCode = szTown.toUpperCase().charAt(0); /**Takes the first character from 
									  				 szTown and stores it in this variable**/
		
		//Output
		System.out.println("\nYour postcode is " + szPostcode.toUpperCase() + " and your town code is "+ chTownCode + ".");
		
		szKeyboard.close();
	}

}

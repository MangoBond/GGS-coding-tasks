import java.util.Scanner;

public class L02StringManipulationOCR {

	public static void main(String[] args) {
		Scanner szKeyboard = new Scanner(System.in);
		
		//TASK 5
		System.out.println("-----Task 5-----\n");
		
		String szWord;
		
		System.out.print("Please enter a word: ");
		szWord = szKeyboard.nextLine(); //Requesting an input from the user
		
		System.out.println(szWord.toUpperCase()); //Outputs the user's input as upper case
		
		//TASK 6
		System.out.println("-----Task 6-----\n");
		
		String szFirstName;
		String szSurname;
		
		System.out.print("What is your first name? ");
		szFirstName = szKeyboard.nextLine();
		
		if (szFirstName.length() < 5) { //Checks if your first name is less than 5 characters long
			System.out.print("What is your surname? ");
			szSurname = szKeyboard.nextLine();
			System.out.println((szFirstName+szSurname).toUpperCase()); //Outputs your full name in uppercase
		} else {
			System.out.println(szFirstName.toLowerCase()); //Outputs your first name in lowercase
		}
		
		//TASK 7
		System.out.println("-----Task 7-----\n");
		
		String szWord2;
		
		System.out.print("Enter a word: ");
		szWord2 = szKeyboard.nextLine();
		szWord2 = szWord2.toLowerCase(); /*"Sanitises" szWord2 to make the check on line 46-48
										  a lot easier*/
		
		//Checks to see if the first letter of szWord2 is a vowel
		if (szWord2.charAt(0) == 'a' || szWord2.charAt(0) == 'e' ||
			szWord2.charAt(0) == 'i' || szWord2.charAt(0) == 'o' ||
			szWord2.charAt(0) == 'u') 
		{
			System.out.println(szWord2 + "way");
		} 
		else 
		{
			System.out.println(szWord2 + "ay");
		}
		
		//Closes scanner
		szKeyboard.close();
	}
}

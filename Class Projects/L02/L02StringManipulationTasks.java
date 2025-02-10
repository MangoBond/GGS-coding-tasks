import java.util.Scanner;

/**
 * 09/05/24
 * Author Ayo Bond
 * Converting OCR String Manipulation tasks to Java
 */
public class L02StringManipulationTasks {

	public static void main(String[] args) {
		
		Scanner szKeyboard = new Scanner(System.in);
		Scanner iKeyboard  = new Scanner(System.in);
		
		//Task 1
		System.out.println("----Task 1----");
		String szName;
		
		System.out.print("Enter your name here: ");
		szName = szKeyboard.nextLine();
		System.out.println(szName.length());
		
		//Task 2
		System.out.println("\n----Task 2----");
		String szFirstName;
		String szLastName;
		
		System.out.print("Enter your first name here: ");
		szFirstName = szKeyboard.nextLine();
		System.out.print("Enter your last name here: ");
		szLastName  = szKeyboard.nextLine();
		
		System.out.println(szFirstName + " " + szLastName);
		
		//Task 3
		System.out.println("\n----Task 3----");
		String szFirstName1;
		String szLastName1;
		
		System.out.print("Enter your first name here: ");
		szFirstName1 = szKeyboard.nextLine();
		System.out.print("Enter your last name here: ");
		szLastName1 = szKeyboard.nextLine();
		
		System.out.print(szFirstName1.substring(0,1).toUpperCase() + szFirstName1.substring(1) + szLastName1.substring(0,1).toUpperCase() + szLastName1.substring(1));
		
		//Task 4
		System.out.println("\n----Task 4----");
		//im not completing ts
		
		//TASK 5
		System.out.println("-----Task 5-----\n");
				
		String szWord;
				
		System.out.print("Please enter a word: ");
		szWord = szKeyboard.nextLine(); //Requesting an input from the user
				
		System.out.println(szWord.toUpperCase()); //Outputs the user's input as upper case
				
		//TASK 6
		System.out.println("-----Task 6-----\n");
				
		String szFirstName2;
		String szSurname;
				
		System.out.print("What is your first name? ");
		szFirstName2 = szKeyboard.nextLine();
				
		if (szFirstName2.length() < 5) { //Checks if your first name is less than 5 characters long
			System.out.print("What is your surname? ");
			szSurname = szKeyboard.nextLine();
			System.out.println((szFirstName2+szSurname).toUpperCase()); //Outputs your full name in uppercase
		} else {
			System.out.println(szFirstName2.toLowerCase()); //Outputs your first name in lowercase
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
		
		szKeyboard.close();
		iKeyboard.close();
	}

}

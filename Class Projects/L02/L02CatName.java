import java.util.Scanner;

/**
 * 17/04/2024
 * Author - Ayo Bond
 * Program to display the name of a cat
 */
public class L01CatName {

	public static void main(String[] args) {
		
		//Program 1 - no user input
		System.out.println("Garfield");
		
		//Program 2 - user input
		Scanner szKeyboard = new Scanner(System.in);
		String szCatName = szKeyboard.nextLine();
		System.out.println("The name of your cat is " + szCatName + "!");
		
		szKeyboard.close();
		
	}//end main

}//end class

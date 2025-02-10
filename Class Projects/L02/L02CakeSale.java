 import java.util.Scanner;
 
/**
 * 25/04/24
 * Author - Ayo Bond
 * Program to show estimated profit at cake sale
 */
public class L02CakeSale {

	public static void main(String[] args) {
		
		final float fCup     = 0.4f;
		final float fMacrons = 0.5f;
		final float fCheese  = 0.7f;
		float fTotal = 0f;
		
		int iCupSold     = 0;
		int iMacronsSold = 0;
		int iCheeseSold  = 0;
		
		Scanner iKeyboard = new Scanner(System.in);
		Scanner iKeyboard2 = new Scanner(System.in);
		Scanner iKeyboard3 = new Scanner(System.in);
		
		System.out.println("How many cupcakes do you expect to sell?");
		iCupSold = iKeyboard.nextInt();
		System.out.println("How many macrons do you expect to sell?");
		iMacronsSold = iKeyboard2.nextInt();
		System.out.println("How many cheesecakes do you expect to sell?");
		iCheeseSold = iKeyboard2.nextInt();
		
		fTotal = (fCup * iCupSold) + (fMacrons * iMacronsSold) + (fCheese * iCheeseSold);
		
		System.out.println("You are predicted to make: £" + fTotal);
		
		iKeyboard.close();
		iKeyboard2.close();
		iKeyboard3.close();
	}

}
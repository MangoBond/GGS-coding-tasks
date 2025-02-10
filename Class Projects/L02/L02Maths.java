/**
 * 19/06/2024
 * author Ayo Bond
 * maths in java
 */
public class L02Maths {

	public static void main(String[] args) {
		System.out.println("----------CASTING & PARSING----------");
		//example of casting (no strings)
		float fNum = 3.54127666f;
		int iNum = (int) fNum;
		System.out.println(fNum);
		System.out.println(iNum);
		
		//example of parsing (strings only)
		String szNum = "777";
		int iNum1 = 236;
		System.out.println(szNum + iNum1);
		
		int iNum2 = Integer.parseInt(szNum);
		System.out.print(iNum1 + iNum2);
		
		System.out.println("\n----------USING CONSTANTS----------");
		//store number of days in a constant and output it
		final int iDAYSINAWEEK = 7;
		System.out.println("There are " + iDAYSINAWEEK + " days in a week.");
		
		System.out.println("\n----------RANDOM NUMBERS----------");
		//generate a single digit and output it
		int iDiceRoll;
		iDiceRoll = 1+(int)(Math.random()*6);
		System.out.println(iDiceRoll);
	}

}

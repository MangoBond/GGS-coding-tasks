
public class L01ArithmeticOperationsAndFormatting {

	public static void main(String[] args) {
		
		//declare and assign values to constants. All global declarations should be made at the beginning of the program

				//the "final" keyword is a modifier that can be used when declaring variables to prevent any subsequent changes to the values
				//that are initially assigned to them. This prevents them being changed accidentally. Variables created to store fixed values are known as "constants"
				//constants should always be declared with final appropriate data type and variable name should be in capital letters.
				//any attempt to change the variable in the program will result in the program not compiling
				final int iSEC_IN_MINUTE = 60;
				final int iMIN_IN_HOUR = 60;


				//declare and assign variables
				String header, forecast;

				int iNum1 = 3;
				int iNum2 = 6;
				int iNum3 = 12;
				int iIncNum = 4;
				int iBase = 2;
				int iPower = 3;
				int iDenaryValue = 200;

				float fAddNum1 = 5.2F;
				float fAddNum2 = 6.7F;
				float fSubNum1 = 4.6F;
				float fSubNum2 = 8.7F;

				int iNum4, iAddCalc1, iAddCalc2Cast, iCalcExpon, iMinInDay, iSecInDay, 
				iHoursInLeap, iHoursInYear, iRecTotalSleep2024, iSubCalc1, iSubCalc2,
				iRecTotalSleepYear, iAvgSleepLeapInDays, iAvgSleepYearInDays, 
				iAvgSleepInDaysRemLeap, iAvgSleepInDaysRemYear, iRemainder, iQuotient, iHexConversionCheck;
				float fAddCalc1, fAddCalc2, fSubCalc1, fSubCalc2, fAddCalc2Cast;
				double dCalcExpon;
				char chHexadecimalChar1, chHexadecimalChar2;


				//add space and heading for task
				System.out.println();
				System.out.println("======================================================================================================================");
				System.out.println("ASSIGNMENT 14 PERFORMING ARITHEMTIC OPERATIONS & FORMATTING");
				System.out.println("======================================================================================================================");



				// ----------------------------------------------------------------------------------------------------------------------------------------
				// A) FORMATTING TABLES USING ESCAPE SEQUENCES
				//     i)   produce the required output in an aligned table format. You will need to use tab and new line
				// ========================================================================================================================================

				//add space and heading for task
				System.out.println();
				System.out.println();
				System.out.println();
				System.out.println("======================================================================================================================");
				System.out.println("A) FORMATTING TABLES USING ESCAPE SEQUENCES");
				System.out.println("======================================================================================================================");

				//create the title and the header for the table. Note you will need to build (add) the content in the variable line by line. e.g. header = header + "..."
				//OUTPUT  
				//		  Formatting Tables with Escape Sequences Alone
				//	      TOP 3 PLAYSTATION GAMES OF ALL TIME
				//		  Position	Title				  Platform	  Released
				//	      --------	--------------------  --------	  --------


				//create the data in the table. Again you will need to build (add) the content in the variable line by line. e.g. forecast = forecast + "..."
				//OUTPUT  
				//	  	1		THE LAST OF US			PS3/PS4		2013/2014
				//	    2		GRAND THEFT AUTO III	PS2		 	2001
				//      3		RESIDENT EVIL			PS1			1997

				header = "Position Title\t\t\tPlatform Released"
						+ "\n-------- --------------------\t-------- --------";
				forecast = "1        THE LAST OF US\t\tPS3/PS4  2013/2014"
						+ "\n2        GRAND THEFT AUTO III\tPS3/PS4  2001"
						+ "\n3        RESIDENT EVIL\t\tPS3      1997";
				
				//print out the contents held in the header and the forecast
				System.out.println(header);
				System.out.println(forecast);


				//discuss the things you found whilst using the tab and new line to create the table
				System.out.println("\nI had to manually count spaces at points to make the text align");


				System.out.println("----------------------------------------------------------------------------------------------------------------------");




				// ---------------------------------------------------------------------------------------------------------------------------------------
				// B) FORMATTING TABLES USING PRINTF
				//     i)   produce the required output in an aligned table format. You must ensure you use the correct specifiers
				// ========================================================================================================================================

				//add space and heading for task
				System.out.println();
				System.out.println();
				System.out.println();
				System.out.println("======================================================================================================================");
				System.out.println("B) FORMATTING TABLES USING PRINF");
				System.out.println("======================================================================================================================");

				//create the title and the header for the table. Note you will need to build (add) the content in the variable line by line. e.g. header = header + ...
				//OUTPUT  
				//	      TOP 3 PLAYSTATION GAMES OF ALL TIME
				//		  Position	Title				  Platform	  Released		Sales (millions)
				//	      --------------------------------------------------------------------------
				//	      00000001	THE LAST OF US		  PS3/PS4	  2013/2014		   		   8.231
				//	      00000002	GRAND THEFT AUTO III  PS2		  2001				      17.336
				//        00000003	RESIDENT EVIL		  PS1		  1997			            2.75

				System.out.println("TOP 3 PLAYSTATION GAMES OF ALL TIME");
				System.out.println("------------------------------------------------------------------------------");
				header = "%-8s  %-20s %-10s    %-9s      %16s%n";
				
				System.out.printf(header, "Position", "Title", "Platform", "Released", "Sales (millions)" );
				System.out.println("------------------------------------------------------------------------------");
				System.out.printf(header, "1", "THE LAST OF US", "PS3/PS4", "2013/2024", "8.231");
				System.out.printf(header, "2", "GRAND THEFT AUTO III", "PS2", "2001", "17.336");
				System.out.printf(header, "3", "RESIDENT EVIL", "PS1", "1997", "2.75");

				System.out.println();
				//discuss the things you found whilst using the tab and new line to create the table
				System.out.println("Much easier than using escape sequences because you only have to account for the longest value\nin each collumn");


				System.out.println("----------------------------------------------------------------------------------------------------------------------");


				// ---------------------------------------------------------------------------------------------------------------------------------------
				// C) ADDITION
				//    perform the following calculations using the addition operator
				//     i)   add an int and an int
				//     ii)  add a float and a float
				//     iii) add an int and a float. Can you see a potential problem here?
				//	   iv)  cast a float to an int. Can you see a potential problem here?
				//		v)	cast to a float the round using the Math.round() method
				//	   vi)   write up some notes associated to the addition arithmetic operator, mixing types, casting, formatting (printf, \t and \n
				// ========================================================================================================================================

				//add space and heading for task
				System.out.println();
				System.out.println();
				System.out.println();
				System.out.println("======================================================================================================================");
				System.out.println("C) ADDITION ARITHMETIC OPERATOR, MIXING TYPES, CASTING, FORMATTING (printf, TAB AND NEW LINE)");
				System.out.println("======================================================================================================================");


				//add together x2 iNum1 and iNum2 and store in iAddCalc1
				iAddCalc1 = iNum1 + iNum2;
				//print out using tab 
				//OUTPUT Adding 2 ints using tab and storing in an int type: 	3	+	6	 = 	9
				System.out.println(iNum1 + "\t+\t" + iNum2 + "\t=\t" + iAddCalc1);
				//now use printf to print in the console 
				//OUTPUT Adding 2 ints using printf and storing in an int type: 3 + 6  =  9
				System.out.printf("%-3d + %-3d = %-3d", iNum1, iNum2, iAddCalc1);
				//add together 2 floats fAddNum1 and fAddNum2, the print out using the printf, it should align and be stored in fAddCalc1. 
				//OUTPUT Adding 2 floats and storing in a float: 5.2 + 6.7  =  11.9
				fAddCalc1 = fAddNum1 + fAddNum2;
				System.out.printf("%n%-2.1f + %-2.1f = %-2.1f", fAddNum1, fAddNum2, fAddCalc1);
				//add together an int (iNum1) and a float (fAddNum2) and print the answer using printf, it should align with the others and be stored in fAddCalc2
				//OUTPUT Adding an int and a float and storing in an float type: 3 + 6.7  =  9.7
				fAddCalc2 = iNum1 + fAddNum2;
				System.out.printf("%n%-3d + %-2.1f = %-2.1f", iNum1, fAddNum2, fAddCalc2);
				//now add together  iNum1 and fAddNum2, but this time cast it to an int again it should align with the others and be stored in iAddCalc2Cast
				//OUTPUT Adding an int and a float and casting it to an int:     3 + 6.7  =  9
				iAddCalc2Cast = iNum1 + (int) fAddNum2;
				System.out.printf("%n%-3d + %-2.1f = %-3d", iNum1, fAddNum2, iAddCalc2Cast);
				//now add together  iNum1 and fAddNum2, but this time cast it to a float and round it to an int using the Math.round method
				//OUTPUT Adding an int and a float and casting it to an int:     3 + 6.7  =  9
				fAddCalc2Cast = (float) iNum1 + fAddNum2;
				System.out.printf("%n%-3d + %-2.1f = %3d", iNum1, fAddNum2, Math.round(fAddCalc2Cast));
				
				System.out.println();

				System.out.println("----------------------------------------------------------------------------------------------------------------------");






				// --------------------------------------------------------------------------------------------------------
				// D) SUBTRACTION
				//    perform calculations using the subtraction operator
				//      i)   subtract an int from an int
				//      ii)  subtract a float from a float
				//      iii) subtract an int from a float. Can you see a potential problem here?
				//		iv)	 use casting and Math.round to ensure data accuracy is maintained
				//	    v)  write up some notes associated to the subtraction arithmetic operator related to mixing types.
				// =========================================================================================================

				//add space and heading for task
				System.out.println();
				System.out.println();
				System.out.println();
				System.out.println("======================================================================================================================");
				System.out.println("D) SUBTRACTION USING DIFFERENT PRIMITIVE DATA TYPES");
				System.out.println("======================================================================================================================");

				//subtract and int from an int
				iSubCalc1 = iNum2 - iNum1;
				System.out.printf("%-3d - %-3d = %-3d", iNum2, iNum1, iSubCalc1);
				//subtract a float from a float
				fSubCalc1 = fSubNum2 - fSubNum1;
				System.out.printf("%n%-2.1f - %-2.1f = %-2.1f", fSubNum2, fSubNum1, fSubCalc1);
				//subtract an int from a float and store it in an int. Can you see a potential problem here? 
				//Also note the float must be cast to an int without it there is a syntax error
				iSubCalc2 = (int) fSubNum2 - iNum1;
				System.out.printf("%n%2.1f - %-3d = %-3d", fSubNum2, iNum1, iSubCalc2);
				//use casting to make sure the answer produced is accurate and round it to 1 decimal place
				fSubCalc2 = fSubNum2 - iNum1;
				System.out.printf("%n%2.1f - %-3d = %-3d", fSubNum2, iNum1, Math.round(fSubCalc2));

				System.out.println();
				System.out.println("----------------------------------------------------------------------------------------------------------------------");






				// ---------------------------------------------------------------------------------------------------------------------
				// E) MULTIPLICATION
				//    perform calculations using the multiplication operator, constants and primitive data types
				//    i)    calculate how many minutes in a day. You should use a constant.
				//	  ii)   calculate how many seconds in a day. You should use a constant. 
				//	  iii)  calculate how many hours in 2016. You should use a constant.
				//    iv)   if you will sleep an average of 8 hours a day. How many hours would you sleep in 2016?
				//    v)    attempt to change a constant variable.
				//    vi)   explain what a constant is, why they are used and explain what happens if you try to change the value.
				// ======================================================================================================================

				//add space and heading for task
				System.out.println();
				System.out.println();
				System.out.println();
				System.out.println("======================================================================================================================");
				System.out.println("E) MULTIPLICATION USING CONSTANTS AND MIXED TYPES");
				System.out.println("======================================================================================================================");

				//calculate how many minutes in a day using the. You should use a constant. Enter the code below.
				//OUTPUT: There are 1440 minutes in a day.
				iMinInDay = iMIN_IN_HOUR * 24;
				System.out.println("There are " + iMinInDay + " minutes in a day");
				//calculate how many seconds in a day. You should use a constant. Enter the code below.
				//OUTPUT: There are 86400 seconds in a day.
				iSecInDay = iSEC_IN_MINUTE * iMIN_IN_HOUR * 24;
				System.out.println("There are " + iSecInDay + " seconds in a day");
				//calculate how many hours in a year. You should use a constant. Enter the code below.
				//OUTPUT: There will be 8784 hours in 2016.
				iHoursInYear = 24 * 366;
				System.out.println("There will be " + iHoursInYear + " hours in 2024");
				//if you will sleep an average of 8 hours a day. How many hours would you sleep in 2016? Enter the code below.
				//OUTPUT: You should sleep on average 2928 hours in 2016.
				iRecTotalSleep2024 = 366 * 8;
				System.out.println("You should sleep on average " + iRecTotalSleep2024 + " hours in 2024.");
				
				//attempt to change a constant variable. Record what happens and explain why
				//iHOURSINADAY = iHOURSINADAY + 1;
				System.out.println("\nA constant is a variable which is the same through out the program.\nThey are used for values that will never have to change"
						+ " like days of the week.\nYou will get a syntax error if you attempt to change the value.");

				System.out.println("----------------------------------------------------------------------------------------------------------------------");






				// ----------------------------------------------------------------------------------------------
				// F) DIVISION & MODULUS OPERATORS
				//    perform calculations using the division and modulus operators
				//    i)   calculate how many days in total you should sleep for in 2016. You need to use / and %
				//	  ii)  calculate the recommended hours of sleep in 2017 using the variables above.
				//	  iii) convert the hours into days and hours
				//	   iv) finding the remainder and DIV (quotient)
				// ===============================================================================================

				//add space and heading for task
				System.out.println();
				System.out.println();
				System.out.println();
				System.out.println("======================================================================================================================");
				System.out.println("F) DIVISION & MODULUS OPERATORS");
				System.out.println("======================================================================================================================");

				//calculate how many days in total you should sleep for in a leap year. You need to use / and %
				//OUTPUT: If you sleep the recommended hours a day in 2016 you will sleep in total of 122 days and 0 hours.
				iAvgSleepLeapInDays = iRecTotalSleep2024 / 24;
				System.out.println("In days, you should sleep for " + iAvgSleepLeapInDays + " days and " + iRecTotalSleep2024 % 24 + " hours in 2016.");
				//calculate the recommended hours of sleep in a normal year using the variables above.
				//OUTPUT: You should sleep on average 2920 hours in 2017.
				iRecTotalSleepYear = 365 * 8;
				System.out.println("You should sleep on average " + iRecTotalSleepYear + " hours in 2023.");
				//convert the hours into days and hours
				//OUTPUT: If you sleep the recommended hours a day in 2017 you will sleep in total of 121 days and 16 hours.
				iAvgSleepYearInDays = iRecTotalSleepYear / 24;
				
				System.out.println("In days, you should sleep for " + iAvgSleepYearInDays + " days and " + iRecTotalSleepYear % 24 + " hours in 2023.");
				
				//find the denary values associated to converting denary to hexadecimal
				System.out.println("\n\nDENARY TO HEXADECIMAL CONVERSIONS");
				System.out.println("==================================");

				//STEP 1 Creating the iQuotient and iRemainder from the iDenaryValue variable
				//OUTPUT: STEP 1 - Converting denary 200 into a hexadecimal value is the denary 200 divided by base 16.
				//		  The denary quotient (how many times 16 goes into 200) which forms the first hexadecimal character is 12.
				//		  You then find the remainder using the modulus operator. The remainder is 8 denary.
				iQuotient = iDenaryValue / 16;
				iRemainder = iDenaryValue % 16;
				
				System.out.println("STEP 1 - Converting denary 200 into a hexadecimal value is the denary 200 divided by base 16.\r\n"
						+ "The denary quotient (how many times 16 goes into 200) which forms the first hexadecimal character is " + iQuotient + ".\r\n"
						+ "You then find the remainder using the modulus operator. The remainder is " + iRemainder + " denary.");
				
				//STEP 2 Checking the calculation
				//OUTPUT: STEP 2 - Checking the calculation. The formula would be (Quotient 12 x Base 16) + Remainder 8 = 200
				
				iHexConversionCheck = (iQuotient * 16) + iRemainder;
				System.out.println("\nSTEP 2 - Checking the calculation. The formula would be (Quotient " + iQuotient + " x Base 16) + Remainder " + iRemainder + " = " + iHexConversionCheck);
				
				//STEP 3 Converting the denary value to ASCII and casting to a char
				//OUTPUT: STEP 3 - Converting the denary values into hexadecimal characters using denary to ASCII conversion.
				//Process to convert 1st hexadecimal character using the denary to ASCII conversion
				//not a number in denary must related to the relevant ASCII number
				//if the denary value is greater than 9 the denary value needs to be replaces with letters in the range of A-F
				//else the denary value is 0-9 convert to ASCII
				//do the same to convert the second Hexadecimal character

				System.out.println("\nSTEP 3 - Converting the denary values into hexadecimal characters using denary to ASCII conversion.");
				
				if (iQuotient > 9) {
					chHexadecimalChar1 = (char) ('A' + (iQuotient - 10));
				} else {
					chHexadecimalChar1 = (char) ('0' + iQuotient);
				}
				
				if (iRemainder > 9) {
					chHexadecimalChar2 = (char) ('A' + (iRemainder - 10));
				} else {
					chHexadecimalChar2 = (char) ('0' + iRemainder);
				}
				
				//output the answer for the conversion
				//OUTPUT: ANSWER: 200 converted to hexadecimal is C8
				
				System.out.println("\nANSWER: " + iDenaryValue + " converted to hexadecimal is " + chHexadecimalChar1 + "" + chHexadecimalChar2);
				
				System.out.println("----------------------------------------------------------------------------------------------------------------------");




				// -----------------------------------------------------------------------------------------------------------------------
				// G) B0DMAS
				//    i) add exercises from the PowerPoint below and include the answer before you run compile it. Were you right?
				//	 ii) experiment some more below with BODMAS. Use the same calculations above, but move the brackets.
				//       predict the answer before you run the program as before. Where you right?
				//	iii) summarise in your own words BODMAS
				// =======================================================================================================================

				//add space and heading for task
				System.out.println();
				System.out.println();
				System.out.println();
				System.out.println("======================================================================================================================");
				System.out.println("G) BODMAS EXERCISES WITHOUT USING DECLARED VARIABLES");
				System.out.println("======================================================================================================================");


				//add exercises from the PowerPoint below and include the answer before you run compile it. Were you right?
				//OUTPUT
				// 1) (2+3*2) = 8 		 The correct answer is: ??
				// 2) ((2+3)*2) = 10 	 The correct answer is: ??
				// 3) (1+2*3+7) = 14 	 The correct answer is: ??
				// 4) ((1+2)*(3+7)) = 30 The correct answer is: ??

				System.out.println("1) (2+3*2) = 8 The correct answer is: " + (2+3*2) + "\r\n"
						+ "2) ((2+3)*2) = 10 	 The correct answer is: " + ((2+3)*2) + "\r\n"
						+ "3) (1+2*3+7) = 14 	 The correct answer is: " + (1+2*3+7) + "\r\n"
						+ "4) ((1+2)*(3+7)) = 30 The correct answer is: " + ((1+2)*(3+7)));

				//experiment some more below with BOMAS. Use the same calculations above, but move the brackets.
				//predict the answer before you run the program as before. Where you right?
				System.out.println();
				System.out.println("Add some additional examples considering BODMAS");
				System.out.println("example 1 ");
				System.out.println("example 2 ");
				System.out.println("example 3 ");
				System.out.println("example 4 ");

				System.out.println();
				//summarise in your own words BODMAS
				System.out.println("Summarise BODMAS here");

				System.out.println("----------------------------------------------------------------------------------------------------------------------");




				// --------------------------------------------------------------------------------------
				// H) INCREMENT & DECREMENT OPERATORS
				//      i) print out the variable iIncNum,
				//	   ii)  increment the variable iIncNum by 1
				//    iii) decrement the variable iIncNum by 1
				//     iv) use a for loop to count from 1 to 5
				//      v) print out the value of i after the close brace of the for loop. What happens?
				//	   vi) use a for loop to count down from 5 to 0
				//	  vii) generate 3 random numbers 1 to 10 using a for loop
				//	 viii) generate 3 random numbers 10 to 20 using a for loop
				// ======================================================================================

				//add space and heading for task
				System.out.println();
				System.out.println();
				System.out.println();
				System.out.println("======================================================================================================================");
				System.out.println("H) INCREMENT & DECREMENT OPERATORS & FOR LOOP");
				System.out.println("======================================================================================================================");


				//print out the variable iIncNum
				System.out.println(iIncNum);

				//increment the variable iIncNum by 1
				System.out.println(++iIncNum);

				//decrement the variable iIncNum by 1
				System.out.println(--iIncNum);

				System.out.println();
				System.out.println("Counting from 1 to 5");
				//print out the numbers 1 to 5 in the console. You must use a for loop
				//this uses a local variable, not global. Use i
				
				for (int i = 1; i < 6; i++) {
					System.out.println(i);
				}
				
				//print out the value of i after the close brace of the for loop. Does it work?
				//System.out.println(i);
				System.out.println("\nCan't print, syntax error");

				System.out.println();
				System.out.println("Counting down from 5 to 0");
				//print out the numbers 5 to 0 in the console. You must use a for loop
				//this uses a local variable, not global. Use j

				for (int j = 5; j >= 0; j--) {
					System.out.println(j);
				}
				
				System.out.println();
				System.out.println("Using Math.random() scale 1 to 10");
				//print out 3 randomly generated numbers on the scale of 1 to 10
				//this uses a local variable, not global. Use i
				
				for (int i = 0; i < 3; i++) {
					System.out.println(1 + (int) (Math.random() * 10));
				}
				
				System.out.println();
				System.out.println("Using Math.random() scale of 10 to 20");
				//print out 3 randomly generated numbers on the scale of 10 to 20
				//this uses a local variable, not global. Use i
				
				for (int i = 0; i < 20; i++) {
					System.out.println(10 + (int) (Math.random() * 20));
				}

				System.out.println();

				//summarise in your own words increment, decrement, the differences between local and global variables and 
				System.out.println("Increment: adding 1 to a value"
						+ "\nDecrement: taking one away from a value"
						+ "\nLocal variables can only be used in the selection or iteration statement they are declared in."
						+ "\nGlobal variables can be used throughout the program, anywhere, anytime.");

				//summarise in your own words write what a for loop
				System.out.println("\nA statement in which the code nested inside repeats until a certain conditions is met");

				System.out.println("----------------------------------------------------------------------------------------------------------------------");





				// ---------------------------------------------------------------------------------------------------------------------------------
				// I) EXPONENTIATION CASTING AND PRINTING WITH PRINTF
				//    perform calculations using Exponentiation, casting where appropriate and printf formatting
				//    i)   calculate base 2 to the power of 3 using Math.pow and the variables iBase and iPower
				//    ii)  calculate base 2 to the power of 3 using Math.pow and the variables iBase and iPower. You will need to cast it to an int
				//    iii) print out the results in a table format using printf. All columns must be aligned.
				// =================================================================================================================================

				//add space and heading for task
				System.out.println();
				System.out.println();
				System.out.println();
				System.out.println("======================================================================================================================");
				System.out.println("I) EXPONENTIATION, CASTING AND PRINTING WITH PRINTF");
				System.out.println("======================================================================================================================");


				//calculate base 2 to the power of 3 using Math.pow and the variables iBase and iPower
				//default data type for Math.pow is double, if you do not use a data type with a double variable casting is required
				dCalcExpon = Math.pow(iBase, iPower);

				//calculate base 2 to the power of 3 using Math.pow and the variables iBase and iPower. You will need to cast it to an int
				//this calculation is being stored in an int, so type casting is required
				iCalcExpon = (int) Math.pow(iBase, iPower);

				//print out the results in a table format using printf. All columns must be aligned.
				// OUTPUT:
				//    Method Used                              Base       Power      Answer    
				//    Math.pow() using a double data type.     2          3          8.0       
				//    Math.pow() used with type casting.       2          3          8  

				System.out.printf("%-36s %-4s %-5s %-6s%n","Method Used", "Base", "Power", "Answer");
				System.out.printf("%-36s %-4d %-5d %-5.1f%n","Math.pow() using a double data type.", iBase, iPower, dCalcExpon);
				System.out.printf("%-36s %-4d %-5d %-6d%n","Math.pow() used with type casting.", iBase, iPower, iCalcExpon);

				System.out.println("----------------------------------------------------------------------------------------------------------------------");


				//examples related to test NOT RELATED TO LESSON TASKS CAN BE DELETED
	}

}

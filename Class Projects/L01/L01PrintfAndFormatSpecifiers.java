public class L01PrintfAndFormatSpecifiers 
{

	public static void main(String[] args) 
	{
		String szHexTable = "| %-2s | %-2s | %-2s | %-7s |%n";
		String szMultiplicationTable = "";
		double dPi = Math.PI;
		float fPi = (float) Math.PI;
		int iPosNum = 461012;
		int iNegNum = -534;
		int iRadius = 6;
		double dCircleArea;


		//TASK 1 - FORMATTING INTEGERS WITH PRINTF
		//Complete each of the following. Make sure the output matches the example output. You will need to use the literals iPosNum and iNegNum.
		System.out.println("///////////////////////////////////////////////////////////////////////////////////");
		System.out.println("TASK 1 = FORMATTING INTEGERS WITH PRINTF");
		System.out.println("///////////////////////////////////////////////////////////////////////////////////");
		//Integer without any flags, width or precision applied: "461012"
		System.out.println(iPosNum);
		//An integer filled with 0s up to 8 characters wide: "00461012"
		System.out.printf("%08d%n", iPosNum);
		//A positive integer which is 8 characters wide: " +461012"
		System.out.printf("%+8d%n", iPosNum);
		//An integer 8 characters wide and includes specific grouping: " 461,012"
		System.out.printf("%,8d%n", iPosNum);
		//A positive integer, identified with a plus and includes specific grouping: "+461,012"
		System.out.printf("%,+8d%n", iPosNum);
		//A negative integer, identified with a minus and 4 characters wide: "-534"
		System.out.printf("%+4d", iNegNum );

		System.out.println();
		System.out.println();





		System.out.println("///////////////////////////////////////////////////////////////////////////////////");
		System.out.println("TASK 2 = FORMATTING FLOATS WITH PRINTF");
		System.out.println("///////////////////////////////////////////////////////////////////////////////////");
		System.out.println();
		System.out.println("TASK 2a - Formatting floats with a variety of specifiers");
		//TASK 2a - FORMATTING FLOATS WITH PRINTF
		//Complete each of the following. Make sure the output matches the example output. You will need to use the literals iPosNum and iNegNum.
		//Print float without any flags, widths of precision applied: "3.141593"
		System.out.println(fPi);
		
		//Print float, right aligned to 3 decimal places: "3.142"
		System.out.printf("%.3f%n", fPi );

		//Print float, left aligned, 10 characters wide to 3 decimal places: "3.142"
		System.out.printf("%-10.3f%n", fPi );

		//Print float, right aligned, 10 characters wide to 3 decimal places: "     3.142"
		System.out.printf("%10.3f%n", fPi);

		System.out.println("---------------------------------------------------------------------------------");
		System.out.println();

		System.out.println("TASK 2b = Calculate the area of a circle");
		//TASK 2b: Calculate the area of a circle where the radius is 6. Then print out the answer using printf function to 2 decimal places
		//you will need to add appropriate variables to enable you to complete the calculation. 
		//the variable for Pi is already included at the start of the main method
		
		dCircleArea = dPi * Math.pow(iRadius, 2);
		System.out.printf("%-6.2f%n", dCircleArea );
		
		//OUTPUT The area of the circle to 2 decimal places is: 113.10);


		System.out.println("---------------------------------------------------------------------------------");
		System.out.println();

		//TASK 2 EXT: Print dPi using:
		//			prinf with no restrictions using %f %n
		//			prinf with no restrictions using %.32f %n
		//          println printing Pi using a double type variable. 
		//          println printing Pi using a float type variable. How will you do this using Math.PI? 
		//What do you notice? Why is this happening? Print your summary out in the console.
		System.out.println("TASK 2 EXT = FORMATTING PI & DATA TYPES");
		System.out.println("---------------------------------------------------------------------------------");
		//Pi with printf using dPi literal, no flags, widths or precision used: "3.141593"

		//Pi with printf using dPi to 32 decimal places: "3.14159265358979300000000000000000"

		//Pi printed using the double type variable, not printf: "3.141592653589793"

		//Pi caste to a float and printed from a float type variable, not printf: "3.1415927"

		System.out.println();
		//Using an appropriate output, outline what you notice about the various formats


		System.out.println();
		System.out.println();




		//TASK 3a: Add the following colours to the table. Make sure you follow the output guidance document. It must match
		//		   Use the link https://www.easycalculation.com/colorconverter/rgb-color-converter.php to help you
		//				Red
		//				Green
		//				Blue
		//				cyan
		//				magenta
		//              yellow 
		//              black
		//				white
		System.out.println("///////////////////////////////////////////////////////////////////////////////////");
		System.out.println("TASK 3 = USING PRINTF TO FORMAT HEX CODE IN A TABLE FORMAT");
		System.out.println("///////////////////////////////////////////////////////////////////////////////////");

		
		System.out.println("--------------------------");
		System.out.printf(szHexTable, "R", "G", "B", "COLOURS");
		System.out.printf(szHexTable, "ff", "00", "00", "RED");
		System.out.printf(szHexTable, "00", "ff", "00", "GREEN");
		System.out.printf(szHexTable, "ff", "00", "ff", "BLUE");
		System.out.printf(szHexTable, "00", "ff", "ff", "CYAN");
		System.out.printf(szHexTable, "ff", "00", "ff", "MAGENTA");
		System.out.printf(szHexTable, "ff", "ff", "00", "YELLOW");
		System.out.printf(szHexTable, "00", "00", "00", "BLACK");
		System.out.printf(szHexTable, "ff", "ff", "ff", "WHITE");
		System.out.println("--------------------------");
		
		System.out.println();
		System.out.println();
		//Task 3B
		// (i)  You need to change the output for the hex to appear as capital letters. How will you do this?
		//	    Create an output which explains this
		// (ii) Change the hex conversions from task 3a to output as capital letters
		szHexTable = "| %-2S | %-2S | %-2S | %-7S |%n";
		
		System.out.println("I made the 's' in szHexTable 'S' instead.\n");
		
		System.out.println("--------------------------");
		System.out.printf(szHexTable, "R", "G", "B", "COLOURS");
		System.out.printf(szHexTable, "ff", "00", "00", "RED");
		System.out.printf(szHexTable, "00", "ff", "00", "GREEN");
		System.out.printf(szHexTable, "ff", "00", "ff", "BLUE");
		System.out.printf(szHexTable, "00", "ff", "ff", "CYAN");
		System.out.printf(szHexTable, "ff", "00", "ff", "MAGENTA");
		System.out.printf(szHexTable, "ff", "ff", "00", "YELLOW");
		System.out.printf(szHexTable, "00", "00", "00", "BLACK");
		System.out.printf(szHexTable, "ff", "ff", "ff", "WHITE");
		System.out.println("--------------------------");
		
		System.out.println();
		System.out.println();		
		//Task 3C
		//You need to change the method of formatting to method 3, this requires you to use the String.format
		//and assign the formatting related to the table to a variable.
		//Once done print out the variable
		System.out.println();
		System.out.println();
		System.out.println("///////////////////////////////////////////////////////////////////////////////////");
		System.out.println("TASK 3C = USING STRING.FORMAT TO FORMAT HEX CODE IN A TABLE FORMAT");
		System.out.println("///////////////////////////////////////////////////////////////////////////////////");
		szHexTable = "";
		szHexTable = szHexTable + String.format("--------------------------%n")
							+ String.format("| %-2S | %-2S | %-2S | %-7S |%n", "R", "G", "B", "COLOUR" )
							+ String.format("--------------------------%n")
							+ String.format("| %02X | %02X | %02X | %-7S |%n", 255, 0, 0, "RED")
							+ String.format("| %02X | %02X | %02X | %-7S |%n", 0, 255, 0, "GREEN")
							+ String.format("| %02X | %02X | %02X | %-7S |%n", 0, 0, 255, "BLUE")
							+ String.format("| %02X | %02X | %02X | %-7S |%n", 0, 255, 255, "CYAN")
							+ String.format("| %02X | %02X | %02X | %-7S |%n", 255, 0, 255, "MAGENTA")
							+ String.format("| %02X | %02X | %02X | %-7S |%n", 255, 255, 0, "YELLOW")
							+ String.format("| %02X | %02X | %02X | %-7S |%n", 0, 0, 0, "BLACK")
							+ String.format("| %02X | %02X | %02X | %-7S |%n", 255, 255, 255, "RED")
							+ String.format("--------------------------%n");
		
		System.out.println(szHexTable);
		
		System.out.println();
		System.out.println();		
		//Task 4A	Create a multiplication grid up to x5. Consider:
		//		  	how to separate the columns
		//		  	perform the calculations (note this does not need to be done using variables for this task
		//		  	column widths
		System.out.println("///////////////////////////////////////////////////////////////////////////////////");
		System.out.println("TASK 4A = 5 x 5 MULTIPLICATION GRID WITHOUT USING A FOR LOOP");
		System.out.println("///////////////////////////////////////////////////////////////////////////////////");

		szMultiplicationTable = szMultiplicationTable + String.format("=============================%n")
							+ String.format("  || %-2d | %-2d | %-2d | %-2d | %-2d |%n", 1, 2, 3, 4, 5)
							+ String.format("=============================%n")
							+ String.format("1 || %-2d | %-2d | %-2d | %-2d | %-2d |%n", 1*1, 1*2, 1*3, 1*4, 1*5)
							+ String.format("2 || %-2d | %-2d | %-2d | %-2d | %-2d |%n", 2*1, 2*2, 2*3, 2*4, 2*5)
							+ String.format("3 || %-2d | %-2d | %-2d | %-2d | %-2d |%n", 3*1, 3*2, 3*3, 3*4, 3*5)
							+ String.format("4 || %-2d | %-2d | %-2d | %-2d | %-2d |%n", 4*1, 4*2, 4*3, 4*4, 4*5)
							+ String.format("5 || %-2d | %-2d | %-2d | %-2d | %-2d |%n", 5*1, 5*2, 5*3, 5*4, 5*5)
							+ String.format("=============================%n");
		
		System.out.println(szMultiplicationTable);
		
		System.out.println();
		System.out.println();		
		//Task 4B	Create a multiplication grid up to x10. Consider:
		//		  	how to separate the columns
		//		  	perform the calculations (note this does not need to be done using variables for this task
		//		  	column widths
		System.out.println("///////////////////////////////////////////////////////////////////////////////////");
		System.out.println("TASK 4B = 10 x 10 MULTIPLICATION GRID USING A FOR LOOP");
		System.out.println("///////////////////////////////////////////////////////////////////////////////////");
		
		szMultiplicationTable = "";
		szMultiplicationTable = szMultiplicationTable + String.format("===================================================================")
							+ String.format("%n     || %3d | %3d | %3d | %3d | %3d | %3d | %3d | %3d | %3d | %3d |", 1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
							+ String.format("%n===================================================================");

		for (int i = 1; i < 11; i++) {
			szMultiplicationTable = szMultiplicationTable
							+ String.format("%n| %2d || %3d | %3d | %3d | %3d | %3d | %3d | %3d | %3d | %3d | %3d |", i, i * 1,
							i * 2, i * 3, i * 4, i * 5, i * 6, i * 7, i * 8, i * 9, i * 10);
		}

		szMultiplicationTable = szMultiplicationTable + String.format("%n===================================================================");

		System.out.println(szMultiplicationTable);
	}//end main

}//end class
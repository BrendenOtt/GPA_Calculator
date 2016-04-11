/*
 * GPACALCULATOR.JAVA
 * Programmer: Brenden Ott
 * Start: 4/10/16
 * Last Edited: 4/10/16
 */

import java.util.Scanner;
import java.lang.Math;

public class GPACalculator {

	public static void main(String[] args) {
		
		//Declarations
		String gradeLetter = null;
		int credits = 1, totCredits = 0;
		double grade = 0, gradeValue = 0, totGrade = 0, gpa = 0;

		Scanner console = new Scanner(System.in);
		
		System.out.println("This program is used to calculate GPA on a 4.0 scale.");
		
		System.out.println("\nPlease enter the number of credits for this course.");
		credits = console.nextInt();
		
		//While Loop
		while (credits > 0)
		{			
			console.nextLine();
			
			System.out.println("\nPlease enter the letter grade you received. (i.e. A, B+, C-)");
			gradeLetter = console.nextLine();
			
			//gradeLetter Switch Block
			switch (gradeLetter.toLowerCase())
			{
				case "a": case "a+":
					grade = 4.0;
					break;					
				case "a-":
					grade = 3.7;
					break;
					
				case "b+":
					grade = 3.3;
					break;				
				case "b":
					grade = 3.0;
					break;					
				case "b-":
					grade = 2.7;
					break;
					
				case "c+":
					grade = 2.3;
					break;				
				case "c":
					grade = 2.0;
					break;					
				case "c-":
					grade = 1.7;
					break;
					
				case "d+":
					grade = 1.3;
					break;					
				case "d":
					grade = 1.0;
					break;
				case "d-":
					grade = 0.7;
					break;
					
				case "f+":
					grade = 0.3;
					break;					
				case "f": case "f-": case "w":
					grade = 0.0;
					break;
					
				default:
					System.out.println("Invalid letter grade! Please re-enter course information.");
					break;
			}
			
			//Calculations
			gradeValue = grade * credits;
			totGrade = totGrade + gradeValue;
			totCredits = totCredits + credits;
			
			System.out.println("\nPlease enter the number of credits for this course. \n(Enter 0 if you're done entering your courses.)");
			credits = console.nextInt();
		}
		
		//Final Calculation
		gpa = totGrade / totCredits;
		
		//Print Result
		System.out.println("Your GPA for this semester is " + Math.round(gpa * 100.0) / 100.0);
	}
}

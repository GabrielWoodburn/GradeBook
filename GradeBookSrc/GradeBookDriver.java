/* CIS 175
 * GradeBookDriver
 * Gabriel Woodburn */

import java.util.ArrayList;
import java.util.Scanner;

public class GradeBookDriver {

	static final int NEGATIVE = -1;  // Used for validation
	static final int ZERO = 0;
	static final int TEN = 10;
	static final int HUNDRED = 100;

	public static void main(String[] args) {
		String test;      // Hold test name
		int numOfScores;  // Hold number of scores
		int scoreValue;   // Hold score value
		Scanner in = new Scanner(System.in);
		
		System.out.println("Please enter the name of your test: ");  // Prompt for name of test
		test = in.nextLine();
		
		
		System.out.println("Please enter the number of scores: ");  // Prompt for number of scores
		numOfScores = in.nextInt();

		ArrayList<Integer> listOfScores = new ArrayList<Integer>(numOfScores);  // New ArrayList for scores
		
		while(numOfScores > ZERO)
		{
			System.out.println("Please enter a score: ");
			if(in.hasNextInt())  // Check for valid input
			{
				scoreValue = in.nextInt();
				if(scoreValue > NEGATIVE)  // if positive value
				{
					listOfScores.add(scoreValue);  // add score
					--numOfScores;  // decrement numOfScores
				}
				else
				{
					System.out.println("\nYou didn't enter a positive integer score!");  // Display error message
				}
			}
			else
			{
				System.out.println("\nYou didn't enter a positive integer score!");  // Display error message
				in.next();  // Reset scanner
			}
		}

		GradeBook bookOne = new GradeBook(test, listOfScores);  // New GradeBook object
		ArrayList<Character> grades = bookOne.getGrade();       // ArrayList for grades
		ArrayList<Integer> scores = bookOne.getListOfScores();  // ArrayList for scores
		
		System.out.println("\nTest: " + bookOne.getTest());  // Display test name
		System.out.println("\nScore ------ Grade");  
		for(int i = ZERO; i < scores.size(); i++)  // Length of scores
		{
			if(scores.get(i) >= TEN && scores.get(i) < HUNDRED)  // Formatted output for 2 digit value
			{
				System.out.println(scores.get(i) + "    ------\t" + grades.get(i));
			}
			else if(scores.get(i) < TEN)  // Formatted output for 1 digit value
			{
				System.out.println(scores.get(i) + "     ------\t" + grades.get(i));
			}
			else // Formatted output for values with more than 2 digits
			{
				System.out.println(scores.get(i) + "   ------\t" + grades.get(i));
			}
		}
		
		in.close();	// Close scanner
	}
}

/* TEST DATA 1:
 * Please enter the name of your test: 
1
Please enter the number of scores: 
6
Please enter a score: 
100
Please enter a score: 
99
Please enter a score: 
89
Please enter a score: 
79
Please enter a score: 
69
Please enter a score: 
59

Test: 1
Score ------ Grade
100   ------	A
99    ------	A
89    ------	B
79    ------	C
69    ------	D
59    ------	F
 */

/* TEST DATA 2:
Please enter the name of your test: 
1
Please enter the number of scores: 
2
Please enter a score: 
a

You didn't enter a positive integer score!
Please enter a score: 
1
Please enter a score: 
!

You didn't enter a positive integer score!
Please enter a score: 
101

Test: 1

Score ------ Grade
1     ------	F
101   ------	A */
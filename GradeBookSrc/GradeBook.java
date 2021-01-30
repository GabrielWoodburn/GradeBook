/* CIS 175
 * GradeBook
 * Gabriel Woodburn */

import java.util.ArrayList;

public class GradeBook {
	
	private String test;   // Hold test name
	private ArrayList<Integer> listOfScores;  // ArrayList for scores
	private ArrayList<Character> grade;       // ArrayList for grades
	
	GradeBook()  // Default no-arg constructor
	{
		test = "";
	}
	
	GradeBook(String test, ArrayList<Integer> scores)  // Parameterized constructor
	{
		this.test = test;
		this.listOfScores = scores;
		this.grade = setLetterGrades(scores);
	}
	
	public ArrayList<Character> setLetterGrades(ArrayList<Integer> score)  // setLetterGrades to check score and assign grade
	{
		ArrayList<Character> letterGrade = new ArrayList<Character>(score.size()); 
		for(int i = 0; i < score.size(); i++)
		{
			if(score.get(i) >= 90)
			{
				letterGrade.add('A');
			}
			else if(score.get(i) >= 80)
			{
				letterGrade.add('B');
			}
			else if(score.get(i) >= 70)
			{
				letterGrade.add('C');
			}
			else if(score.get(i) >= 60)
			{
				letterGrade.add('D');
			}
			else
			{
				letterGrade.add('F');
			}
		}
		return letterGrade;
	}
	
	public String getTest() {  // getter for test
		return test;
	}

	public void setTest(String test) {  // setter for test
		this.test = test;
	}

	public ArrayList<Integer> getListOfScores() {  // getter for listOfScores
		return listOfScores;
	}

	public void setListOfScores(ArrayList<Integer> listOfScores) {  // setter for listOfScores
		this.listOfScores = listOfScores;
	}

	public ArrayList<Character> getGrade() {  // getter for grade
		return grade;
	}

	public void setGrade(ArrayList<Character> grade) {  // setter for grade
		this.grade = grade;
	}

	@Override
	public String toString() {  // overridden toString 
		return "GradeBook [grade=" + grade + ", listOfScores=" + listOfScores + ", test=" + test + "]";
	
	}
}

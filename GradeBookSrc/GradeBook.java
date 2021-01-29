/* CIS 175
 * GradeBook
 * Gabriel Woodburn */

import java.util.ArrayList;

public class GradeBook {
	
	private String _test;   // Hold test name
	private ArrayList<Integer> _listOfScores;  // ArrayList for scores
	private ArrayList<Character> _grade;       // ArrayList for grades
	
	GradeBook()  // Default no-arg constructor
	{
		_test = "";
	}
	
	GradeBook(String test, ArrayList<Integer> scores)  // Parameterized constructor
	{
		_test = test;
		_listOfScores = scores;
		_grade = setLetterGrades(scores);
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
		return _test;
	}

	public void setTest(String _test) {  // setter for test
		this._test = _test;
	}

	public ArrayList<Integer> getListOfScores() {  // getter for listOfScores
		return _listOfScores;
	}

	public void setListOfScores(ArrayList<Integer> _listOfScores) {  // setter for listOfScores
		this._listOfScores = _listOfScores;
	}

	public ArrayList<Character> getGrade() {  // getter for grade
		return _grade;
	}

	public void setGrade(ArrayList<Character> _grade) {  // setter for grade
		this._grade = _grade;
	}

	@Override
	public String toString() {  // overridden toString 
		return "GradeBook [_grade=" + _grade + ", _listOfScores=" + _listOfScores + ", _test=" + _test + "]";
	}
	
}

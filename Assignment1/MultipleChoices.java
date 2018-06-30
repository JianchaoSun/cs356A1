package Assignment1;

import java.util.ArrayList;
import java.util.Random;

public class MultipleChoices implements Question  {
	//each problem consists a question, a array of answer and a correct answer  
	private String question;
	private Answer[]answer;   
	private int correctAnswer;
	
	public MultipleChoices(){
		answer=new Answer[4];
	}
	public boolean isCorrect(int ans){
		return ans==correctAnswer;
	}

	@Override
	public void setQuestion(String question, Answer[] answer, int correctAns) {
		this.question=question;
		this.answer=answer;
		correctAnswer=correctAns;		
	}
	@Override
	public String questionType() {
		// used for other class to determine the question type
		return "MultipleChoices";
	}
	
	public String toString(){
		String toReturn=question+"\n";
		for(int i=0;i<answer.length;i++){
			toReturn+=answer[i].toString()+", ";
		}
		toReturn+="\n";
		return toReturn;
	}
	
}

package Assignment1;

public class TrueOrFalse implements Question {
	private String question;
	private Answer[]answer;
	private int correctAnswer;
	
	public TrueOrFalse(){
		answer=new Answer[2];
	}

	@Override
	public void setQuestion(String question, Answer[] answer, int correctAns) {
		//set question, answer and correct answer, the correct answer is not used later
		this.question=question;
		this.answer=answer;
		correctAnswer=correctAns;
	}

	@Override
	public boolean isCorrect(int ans) {
		//determine if the student get correct answer
		return correctAnswer==ans;
	}

	@Override
	public String questionType() {
		//to determine the question type
		return "TrueOrFalse";
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

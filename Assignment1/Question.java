package Assignment1;

public interface Question {
	//two class that specify the question type will implements this interface
	public void setQuestion(String question,Answer[]answer,int correctAns);
	public boolean isCorrect(int ans);//not used
	public String toString();	
	public String questionType();

}

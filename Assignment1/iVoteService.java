package Assignment1;

import java.util.ArrayList;
import java.util.List;

public class iVoteService {
    private List<Question>questionList; //put problem includes answer in this list
    private List<ScoreCounter>scoreCount;//record the amount of each choice of each question 
    private int questionCount=0;  //track how many problem has been entered the service
    private int answerCount=0;    //track which problem is currently showing for student to answer
    public iVoteService(){
    	questionList=new ArrayList<Question>();
    	scoreCount=new ArrayList<ScoreCounter>();	
    }

    public void addQuestion(Question q){
    	questionList.add(q);
    	
    	if(q.questionType().equals("MultipleChoices")){
    		scoreCount.add(new MultiCounter());
    	}
    	else{
    		scoreCount.add(new TFCounter());
    	}
    	questionCount++;
    	
    }
    public void receiveSubmission(Student s){
    	//after receive from students, send answers straight to the score counting list
    	scoreCount.get(answerCount).receiveScore(s, questionList.get(answerCount));
    }
    public void goToNextQuestion(){
    	answerCount++;
    }
    public boolean hasNextQuestion(){
    	return answerCount!=questionCount;
    }
    public String display(){
    	String y="";
    	int x=questionList.size();
    	for(int i=0;i<x;i++){
        y+="Question "+(i+1)+ ", ";
    	y+=questionList.get(i).toString();
    	y+=scoreCount.get(i).toString();	
    	y+="\n";
    	}
    	
    	return y;
    }
    
    

}

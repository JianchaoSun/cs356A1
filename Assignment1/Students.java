package Assignment1;

import java.util.Random;
import java.util.UUID;

public class Students implements Student {
	private String id;
	
	public Students(){
		setId();
	}
	
	public int getAnswer(Question Qtype){
		return generateAnswer(Qtype); 
	}
	
	public String getId(){
		return id;
	}
	
	private void setId(){
		id=UUID.randomUUID().toString(); //generate random string id
	}
	
	private int generateAnswer(Question Qtype){
		int choice;
		Random rd=new Random();
		if(Qtype.questionType().equals("MultipleChoices")){
			choice =rd.nextInt(4)+0;    //generate choice from 4 random answer if encounter a multiple choice
		}
		else
			choice=rd.nextInt(2)+0; // generate from 2 if true false
		return choice;  //get the choice of this time of this student
	}
}

package Assignment1;

import java.util.Random;

public class Driver {
	public static void main(String []args){
		simulator();
	}
	static void simulator(){
		{
			//create questions
			Question q1=new TrueOrFalse();
			Answer[] aList1=new Answer[2];
			Answer a1=new Answer("yes");
			Answer a2=new Answer("no");
			aList1[0]=a1;
			aList1[1]=a2;
			q1.setQuestion("is spider a insect ", aList1, 2);
			iVoteService vote=new iVoteService();
			vote.addQuestion(q1);
			
			Question q2=new MultipleChoices();
			Answer[] aList2=new Answer[4];
			Answer a3=new Answer("Brazil");
			Answer a4=new Answer("Spain");
			Answer a5=new Answer("Egypt");
			Answer a6=new Answer("Germany");
			aList2[0]=a3;
			aList2[1]=a4;
			aList2[2]=a5;
			aList2[3]=a6;
			q2.setQuestion("Who won the 2010 world cup", aList2, 2);
			vote.addQuestion(q2);
			
			Question q3=new MultipleChoices();
			Answer[] aList3=new Answer[4];
			Answer a7=new Answer("tiger");
			Answer a8=new Answer("pig");
			Answer a9=new Answer("turtle");
			Answer a10=new Answer("dog");
			aList3[0]=a7;
			aList3[1]=a8;
			aList3[2]=a9;
			aList3[3]=a10;
			q3.setQuestion("Which of the following is not mammal.", aList3, 3);
			vote.addQuestion(q3);
			
			Question q4=new TrueOrFalse();
			q4.setQuestion("is elephant the largest animal ", aList1, 2);
			vote.addQuestion(q4);
			
			//generate random amount of students and put them in a array
			Random rd=new Random();
			int random=rd.nextInt(100)+1;
			Student[]stu=new Student[random];
			for(int i=0;i<random;i++){
				stu[i]=new Students();	
			}
			while(vote.hasNextQuestion()){
				//if there is still problem left in iVoteService, keep showing them
			for(int i=0;i<random;i++){
				//each student submit an answer to each question
				vote.receiveSubmission(stu[i]);	
			}
			vote.goToNextQuestion();//after one round, update the question list in ivoteService to the next
				
			}
			
			System.out.print(vote.display()); //display results
		}
		
	}

}

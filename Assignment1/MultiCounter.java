package Assignment1;
//this class is used to count the number of answer of each choice for multiple choice question
public class MultiCounter implements ScoreCounter {
	private int[]scoreCount;
	public MultiCounter(){
		scoreCount=new int[4];
	}
	public void receiveScore(Student s,Question q){
		//take in Student and Question as input, Question works as input of Students' getAnswer method
		//so student can generate one random choice from 4 option.
		if(s.getAnswer(q)==0){
			scoreCount[0]+=1;
		}
		else if(s.getAnswer(q)==1){
			scoreCount[1]+=1;
		}
		else if(s.getAnswer(q)==2){
			scoreCount[2]+=1;
		}
		else
			scoreCount[3]+=1;
		
	}

	public String toString(){
		String s="1.A: "+scoreCount[0]+" 2.B: "+scoreCount[1]+" 3.C: "+scoreCount[2]+" 4.D: "+ scoreCount[3];
		return s;
	}


}

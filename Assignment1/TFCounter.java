package Assignment1;
//this class is used to count the number of choice for True False question
public class TFCounter implements ScoreCounter {
	private int[]scoreCount;
	public TFCounter(){
		scoreCount=new int[2];
	}
	public void receiveScore(Student s,Question q){
		if(s.getAnswer(q)==0){
			//if student select true, true +1
			scoreCount[0]+=1;
		}
		else
			scoreCount[1]+=1;
	}

	public String toString(){
		String s="1.True: "+scoreCount[0]+" 2.False: "+scoreCount[1];
		return s;
	}

}

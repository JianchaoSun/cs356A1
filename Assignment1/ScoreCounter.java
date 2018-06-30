package Assignment1;
//classes that implements this interface are used to count
//the amount of submission for every choices of one question
public interface ScoreCounter {
	public void receiveScore(Student s,Question q);
	public String toString();

}

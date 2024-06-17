package exceptionEx.throwEX;

public class ThrowEx1 {
	
	private int score;

	public int getScore() {
		return score;
	}

	public void setScore(int score1) throws ArithmeticException,ArrayIndexOutOfBoundsException{
		try
		{
			if(score1 < 0)
			{
				throw new Exception();
			}
			else
			{
				this.score = score1;
			}
		}
		catch(Exception e)
		{
			System.out.println("Score should not be less than 0");
		}
	}

	@Override
	public String toString() {
		return "ThrowEx1 [score=" + score + "]";
	}
	
	
}

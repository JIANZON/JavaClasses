import java.util.Random;

public abstract class ThinkRandom {
	protected int getRandomNum() {
		Random r = new Random();
		int ran = r.nextInt(10)+1;
		return ran;
		
	}
	public abstract void speakRandomNum();
	
}

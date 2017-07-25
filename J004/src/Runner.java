
public class Runner {

	public static void main(String[] args) {
		ChineseSpeaker chineseSpeaker = new ChineseSpeaker();
		for (int id = 0; id < 10; id++) {
			chineseSpeaker.speakRandomNum();
			
		}
		EnglishSpeaker englishSpeaker = new EnglishSpeaker();
		for (int id = 0; id < 10; id++) {
			englishSpeaker.speakRandomNum();
			
		}
	}

}

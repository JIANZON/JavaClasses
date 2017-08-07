
public class Runner {

	public static void main(String[] args) {

		int minNum = 0, maxNum = 9, AllTimes = 1000;
		boolean isbool;
		int number = 7;

		RandomNumberCounter randomNumberCounter = new RandomNumberCounter();
		isbool = randomNumberCounter.excute(minNum, maxNum, AllTimes);

		if (isbool) {
			randomNumberCounter.minNum = minNum;
			randomNumberCounter.maxNum = maxNum;
			randomNumberCounter.AllTimes = AllTimes;
			System.out.println("羆磅︽Ω计" + AllTimes);
			randomNumberCounter.Counts = randomNumberCounter.allHitCounts();
			for (int id = 0; id <= maxNum; id++) {
				System.out.println("计" + id + " 玻ネΩ计" + randomNumberCounter.Counts[id]);
			}

			randomNumberCounter.NumberPercents = randomNumberCounter.allHitPercents();
			for (int id = 0; id <= maxNum; id++) {
				System.out.println("计" + id + " 玻ネ诀瞯" + randomNumberCounter.NumberPercents[id]);
			}
			
			System.out.println("计" + number + " 玻ネΩ计" + randomNumberCounter.hitCountOf(number));
			System.out.println("计" + number + " 玻ネ诀瞯" + randomNumberCounter.hitPercentOf(number));

		}
	}
}
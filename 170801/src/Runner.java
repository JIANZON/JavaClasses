
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
			System.out.println("�`���榸�ơG" + AllTimes);
			randomNumberCounter.Counts = randomNumberCounter.allHitCounts();
			for (int id = 0; id <= maxNum; id++) {
				System.out.println("�Ʀr�G" + id + " ���m���ͦ��Ƭ��n" + randomNumberCounter.Counts[id]);
			}

			randomNumberCounter.NumberPercents = randomNumberCounter.allHitPercents();
			for (int id = 0; id <= maxNum; id++) {
				System.out.println("�Ʀr�G" + id + " ���m���;��v���n" + randomNumberCounter.NumberPercents[id]);
			}
			
			System.out.println("�Ʀr�G" + number + " ���m���ͦ��Ƭ��n" + randomNumberCounter.hitCountOf(number));
			System.out.println("�Ʀr�G" + number + " ���m���;��v���n" + randomNumberCounter.hitPercentOf(number));

		}
	}
}
import java.util.Random;

/**
 * ��@�ɶ��O���G
 * ����G<mm/dd>: <00:00>~<00:00>: <01:00>
 * �{���ؼСG
 * �]�p�W��G
 * �]�p�Q�k�G
 * �����X�G
 *  
 */

public class RandomNumberCounter{
	
	Random random = new Random();
	int AllTimes;
	int[] Counts = new int[10];
	int number;
	int minNum, maxNum;
	double [] NumberPercents = new double[10];
	
	public static void main(String[] args) {

		int minNum = 0, maxNum = 9, AllTimes = 1000;
		boolean b;
		int number = 5;

		RandomNumberCounter randomNumberCounter = new RandomNumberCounter();
		b = randomNumberCounter.excute(minNum, maxNum, AllTimes);

		if (b) {
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
	
	public int[] allHitCounts(){
		for (int id = 0; id < AllTimes; id++) {
			number = random.nextInt(maxNum+1);
			Counts[number] = Counts[number] + 1;
		}
		return Counts;
	}
	public double[] allHitPercents(){
		for(int id = 0;id<maxNum;id++) {
			NumberPercents[id]=(Counts[id]*100)/AllTimes;
		}
		return NumberPercents;
	}
	public int hitCountOf(int number){
		
		return Counts[number];
	}
	public double hitPercentOf(int number){
	
		return NumberPercents[number];
	}
	public int[] allNumber() {
		
		
		return Counts;
	}
	public boolean excute(int minNum,int maxNum,int TotalTimes) {
		
		if(minNum<maxNum & maxNum!=0 & TotalTimes !=0) {
			return true;
		}
		else {
			return false;
		}

	}
	
}
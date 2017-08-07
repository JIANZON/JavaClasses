import java.util.Random;

/**
 * 實作時間記錄：
 * 日期：<mm/dd>: <00:00>~<00:00>: <01:00>
 * 程式目標：
 * 設計規格：
 * 設計想法：
 * 虛擬碼：
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
			System.out.println("總執行次數：" + AllTimes);
			randomNumberCounter.Counts = randomNumberCounter.allHitCounts();
			for (int id = 0; id <= maxNum; id++) {
				System.out.println("數字：" + id + " 的《產生次數為》" + randomNumberCounter.Counts[id]);
			}

			randomNumberCounter.NumberPercents = randomNumberCounter.allHitPercents();
			for (int id = 0; id <= maxNum; id++) {
				System.out.println("數字：" + id + " 的《產生機率為》" + randomNumberCounter.NumberPercents[id]);
			}
			
			System.out.println("數字：" + number + " 的《產生次數為》" + randomNumberCounter.hitCountOf(number));
			System.out.println("數字：" + number + " 的《產生機率為》" + randomNumberCounter.hitPercentOf(number));

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
import java.text.DecimalFormat;
import java.util.Random;
import java.util.Scanner;
/**
* 寫的很好，有處理到格式問題
* 有注意到共同使用函式問題
* 定義成物件，可以更好重覆使用
* class CountRandom
* consstructor CountRandom( int iFrom, int iTo, int iRollingTimes) >> let the dice roll
* int getHitTimes(int iNum)
* double getHitPercentage(int iNum)
* 
*/
/**
 * 實作時間記錄：
 * 日期：<07/17>: <00:00>~<00:00>: <40:00>
 * 	    <07/17>: <00:00>~<00:00>: <50:00>
 * 程式目標：使用Math.random()，產生0到9的亂數，並計算在執行10次，100次，1000次的情形下，輸出每個數字出現的比例。
 * 設計規格：
 * >>記得寫輸入、輸出
 * >> 這一行移到設計想法：cntNum(執行次數), cntRandom(方法名稱), numMatrix(矩陣), randomNum(亂數)
 * 設計想法：先讓使用者輸入執行次數, 將輸入次數作為引數呼叫方法cntRandom, 計算完後輸出結果
 * 虛擬碼： >>寫的很好，以後再注意寫概念，盡量不要寫實作細節
 * 		   定義方法cntRandom帶一個integer參數cntTimes >>定義一個方法，傳入"亂數產生次數"
 * 			   建構一個陣列numMatrix大小為10 >>建立長度為10的矩陣，儲放各數字產生次數
 * 			   建構一個integer randomNum存放隨機產生的數字 
 * 			   for迴圈重覆執行傳入引數次數 >>作10次
 * 				   每次迴圈獲得獲得0~9任一隨機亂數 >>先產生0~9的整數亂數
 * 				   將產生出的隨機數字對應到該陣列下標值進行遞增 >>加總該數字產生個數
 * 			   計算每一個數字的比例 
 * 			   輸出結果
 * 
 * 		   建構一個integer cntNum存放輸入次數
 * 		   建構一個Scanner read作為輸入stream
 * 		   讓使用者輸入執行次數
 * 		   以cntNum為引數呼叫方法cntRandom
 *  
 */

public class L001 {
	static void cntRandom(int cntTimes) {
		//建構一個陣列randomCnt大小為10
		int[] numMatrix = new int[10];
		//建構一個integer randomNum存放隨機產生的數字
		int randomNum = 0;
		//for迴圈重覆執行傳入引數次數
		for (int id = 0; id < cntTimes; id++) {
			//獲得0~9隨機亂數
			randomNum = (int) (Math.random() * 10);
			//將產生出的隨機數字對應到該陣列下標值進行遞增
			numMatrix[randomNum]++;
		}
		double cntPercent = 0.00;
		//建構DecimalFormat物件來處理小數點後兩位
		DecimalFormat df = new DecimalFormat("#.00");
		//計算每一個數字的比例並輸出
		for (int id = 0; id < numMatrix.length; ++id) {
			cntPercent =  (((double)(numMatrix[id])/(cntTimes)) * 100);
			if (cntPercent == 0) {
				System.out.println("數字" + id + " 產生" + numMatrix[id] +"次, "+ "比例為:" + 0 + "%");
				continue;
			}	
			System.out.println("數字" + id + " 產生" + numMatrix[id] +"次, "+ "比例為:" + df.format(cntPercent) + "%");
		}
	}
	
	public static void main(String[] args) {
		// 建構一個integer cntNum存放輸入次數
		int cntNum = 0;
		//建構一個Scanner read作為輸入stream
		Scanner read = new Scanner(System.in);
		//讓使用者輸入執行次數
		System.out.print("執行次數:");
		cntNum = read.nextInt();
		//以cntNum為引數呼叫方法cntRandom
		cntRandom(cntNum);

	}
	
}

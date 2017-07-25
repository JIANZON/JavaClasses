/**
 * 實作時間記錄：
 * 日期：<07/20>: <13:30>~<14:30>: <01:00>
 * 日期：<07/19>: <15:50>~<16:30>: <00:40>
 * 程式目標：請使用Math.random()，產生0到9的亂數，並計算在執行10次，100次，1000次的情形下，每個數字出現的比例。
 * 設計規格：
 * 		設計一個骰子，可以骰出0到9的數字，最後會統計執行幾次，骰出的數字佔多少比重
 * 設計想法：
 *		出現次數，英文 iHitCnt, iHitCnts
 * 		把Math.random()包起來
 * 虛擬碼：
 * 		產生一個矩陣，長度為10。0，放0的出現次數，依此類推
 * 		呼叫亂數10次
 * 		依產生數字，更新該數字出現的次數
 * 		最後，計算數字出現比例，可以計算到小數點後的第二位
 * 		印出
 * 
 */
public class J005 {

	public static void main(String[] args) {
//		  * 產生一個矩陣，長度為10。0，放0的出現次數，依此類推
		int[] iHitCnts = new int[10];
//		  * 呼叫亂數10次
		for (int id = 0; id < 1000; id++) {
//			  * 呼叫亂數1 
			int iNum = (int)(10*Math.random());
//			  * 依產生數字，更新該數字出現的次數
			iHitCnts[iNum]++;
		}
//		  *	最後，計算數字出現比例
		for (int id = 0; id < iHitCnts.length; id++) {
//			  * 計算數字出現比例
			double dblPercent = (iHitCnts[id] / 1000.0)*100;
//			  * 印出
			System.out.println("數字：" + id + "出現比例：");
			System.out.printf("%.2f", dblPercent);
			System.out.println("%");

		}
	}

}

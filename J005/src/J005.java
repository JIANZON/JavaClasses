/**
 * ��@�ɶ��O���G
 * ����G<07/20>: <13:30>~<14:30>: <01:00>
 * ����G<07/19>: <15:50>~<16:30>: <00:40>
 * �{���ؼСG�Шϥ�Math.random()�A����0��9���üơA�íp��b����10���A100���A1000�������ΤU�A�C�ӼƦr�X�{����ҡC
 * �]�p�W��G
 * 		�]�p�@�ӻ�l�A�i�H��X0��9���Ʀr�A�̫�|�έp����X���A��X���Ʀr���h�֤�
 * �]�p�Q�k�G
 *		�X�{���ơA�^�� iHitCnt, iHitCnts
 * 		��Math.random()�]�_��
 * �����X�G
 * 		���ͤ@�ӯx�}�A���׬�10�C0�A��0���X�{���ơA�̦�����
 * 		�I�s�ü�10��
 * 		�̲��ͼƦr�A��s�ӼƦr�X�{������
 * 		�̫�A�p��Ʀr�X�{��ҡA�i�H�p���p���I�᪺�ĤG��
 * 		�L�X
 * 
 */
public class J005 {

	public static void main(String[] args) {
//		  * ���ͤ@�ӯx�}�A���׬�10�C0�A��0���X�{���ơA�̦�����
		int[] iHitCnts = new int[10];
//		  * �I�s�ü�10��
		for (int id = 0; id < 1000; id++) {
//			  * �I�s�ü�1 
			int iNum = (int)(10*Math.random());
//			  * �̲��ͼƦr�A��s�ӼƦr�X�{������
			iHitCnts[iNum]++;
		}
//		  *	�̫�A�p��Ʀr�X�{���
		for (int id = 0; id < iHitCnts.length; id++) {
//			  * �p��Ʀr�X�{���
			double dblPercent = (iHitCnts[id] / 1000.0)*100;
//			  * �L�X
			System.out.println("�Ʀr�G" + id + "�X�{��ҡG");
			System.out.printf("%.2f", dblPercent);
			System.out.println("%");

		}
	}

}

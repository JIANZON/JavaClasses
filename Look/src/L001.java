import java.text.DecimalFormat;
import java.util.Random;
import java.util.Scanner;
/**
* �g���ܦn�A���B�z��榡���D
* ���`�N��@�P�ϥΨ禡���D
* �w�q������A�i�H��n���Шϥ�
* class CountRandom
* consstructor CountRandom( int iFrom, int iTo, int iRollingTimes) >> let the dice roll
* int getHitTimes(int iNum)
* double getHitPercentage(int iNum)
* 
*/
/**
 * ��@�ɶ��O���G
 * ����G<07/17>: <00:00>~<00:00>: <40:00>
 * 	    <07/17>: <00:00>~<00:00>: <50:00>
 * �{���ؼСG�ϥ�Math.random()�A����0��9���üơA�íp��b����10���A100���A1000�������ΤU�A��X�C�ӼƦr�X�{����ҡC
 * �]�p�W��G
 * >>�O�o�g��J�B��X
 * >> �o�@�沾��]�p�Q�k�GcntNum(���榸��), cntRandom(��k�W��), numMatrix(�x�}), randomNum(�ü�)
 * �]�p�Q�k�G�����ϥΪ̿�J���榸��, �N��J���Ƨ@���޼ƩI�s��kcntRandom, �p�⧹���X���G
 * �����X�G >>�g���ܦn�A�H��A�`�N�g�����A�ɶq���n�g��@�Ӹ`
 * 		   �w�q��kcntRandom�a�@��integer�Ѽ�cntTimes >>�w�q�@�Ӥ�k�A�ǤJ"�üƲ��ͦ���"
 * 			   �غc�@�Ӱ}�CnumMatrix�j�p��10 >>�إߪ��׬�10���x�}�A�x��U�Ʀr���ͦ���
 * 			   �غc�@��integer randomNum�s���H�����ͪ��Ʀr 
 * 			   for�j�魫�а���ǤJ�޼Ʀ��� >>�@10��
 * 				   �C���j����o��o0~9���@�H���ü� >>������0~9����ƶü�
 * 				   �N���ͥX���H���Ʀr������Ӱ}�C�U�Эȶi�滼�W >>�[�`�ӼƦr���ͭӼ�
 * 			   �p��C�@�ӼƦr����� 
 * 			   ��X���G
 * 
 * 		   �غc�@��integer cntNum�s���J����
 * 		   �غc�@��Scanner read�@����Jstream
 * 		   ���ϥΪ̿�J���榸��
 * 		   �HcntNum���޼ƩI�s��kcntRandom
 *  
 */

public class L001 {
	static void cntRandom(int cntTimes) {
		//�غc�@�Ӱ}�CrandomCnt�j�p��10
		int[] numMatrix = new int[10];
		//�غc�@��integer randomNum�s���H�����ͪ��Ʀr
		int randomNum = 0;
		//for�j�魫�а���ǤJ�޼Ʀ���
		for (int id = 0; id < cntTimes; id++) {
			//��o0~9�H���ü�
			randomNum = (int) (Math.random() * 10);
			//�N���ͥX���H���Ʀr������Ӱ}�C�U�Эȶi�滼�W
			numMatrix[randomNum]++;
		}
		double cntPercent = 0.00;
		//�غcDecimalFormat����ӳB�z�p���I����
		DecimalFormat df = new DecimalFormat("#.00");
		//�p��C�@�ӼƦr����Ҩÿ�X
		for (int id = 0; id < numMatrix.length; ++id) {
			cntPercent =  (((double)(numMatrix[id])/(cntTimes)) * 100);
			if (cntPercent == 0) {
				System.out.println("�Ʀr" + id + " ����" + numMatrix[id] +"��, "+ "��Ҭ�:" + 0 + "%");
				continue;
			}	
			System.out.println("�Ʀr" + id + " ����" + numMatrix[id] +"��, "+ "��Ҭ�:" + df.format(cntPercent) + "%");
		}
	}
	
	public static void main(String[] args) {
		// �غc�@��integer cntNum�s���J����
		int cntNum = 0;
		//�غc�@��Scanner read�@����Jstream
		Scanner read = new Scanner(System.in);
		//���ϥΪ̿�J���榸��
		System.out.print("���榸��:");
		cntNum = read.nextInt();
		//�HcntNum���޼ƩI�s��kcntRandom
		cntRandom(cntNum);

	}
	
}

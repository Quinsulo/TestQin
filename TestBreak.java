import java.util.Scanner;

//break�����ϰ
public class TestBreak{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int score;
		int sum=0;
		System.out.print("������ѧ��������");
		String name=input.next();
		for(int i=1;i<6;i++){
			System.out.print("�������"+i+"�ſεĳɼ���");
			score=input.nextInt();
			sum+=score;
			if(score<0){
				System.out.println("��Ǹ������¼�����������¼�룡");
				break;
			}
			if(i==5){
				double avg=sum/5;
				System.out.println("ƽ����Ϊ��"+avg);
			}
		}
	}
}
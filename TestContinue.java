import java.util.Scanner;

//continue�����ϰ
public class TestContinue{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		double classNum,num;
		int score;
		num=0;
		System.out.print("������༶��������");
		classNum=input.nextInt();
		for(int i=1;i<classNum+1;i++){
			System.out.print("�������"+i+"λѧ���ĳɼ�:");
			score=input.nextInt();
			if(score<80){
				continue;
			}
			num++;
		}
		System.out.println("80�����ϵ�ѧ������Ϊ��"+(int)num);
		System.out.print("80������ѧ����ռ����Ϊ��"+(num/classNum)*100+"%");
	}
}
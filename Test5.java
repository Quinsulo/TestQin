import java.util.Scanner;

//���̿�����ϰ
public class Test5{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		double score;
		System.out.print("������ѧ���ɼ���");
		score=input.nextDouble();
		if(score>=80){
			System.out.print("�óɼ�Ϊ����");
		}else if(score>=60){
			System.out.print("�óɼ�Ϊ�е�");
		}else{
			System.out.println("�óɼ�Ϊ���ϸ�");
			if(score>=55){
				System.out.print("���ǲ�һ��Ƭ��������");
			}
		}
	}
}
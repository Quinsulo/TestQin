//¼�������ɼ��Լ�����ƽ����
import java.util.Scanner;

public class Example1{
	public static void main(String[] args){
		String name;
		double point=0;
		double sum=0;
		Scanner input=new Scanner(System.in);
		System.out.print("����ѧ��������");
		name=input.next();
		for(int i=1;i < 6;i++){
			System.out.print("������5�Ź����е�"+i+"�ſεĳɼ���");
			point=input.nextDouble();
			sum=sum+point;
		}
		sum=sum/5;
		System.out.print(name+"��ƽ����Ϊ��"+sum);
	}
}
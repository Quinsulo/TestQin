//���һ���ӷ���
import java.util.Scanner;

public class Example2{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int number;
		System.out.print("������һ��ֵ��");
		number = input.nextInt();
		//System.out.print("�������ֵ����������¼ӷ���:");
		for(int i=0,j=number;i<=number;i++,j--){
				System.out.println(i+" + "+j+" = "+number);
		}
	}
}
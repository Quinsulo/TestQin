import java.util.Scanner;

//���������ʹ����ϰ
public class Test4{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("������һ������������");
		int num=input.nextInt();
//		if(num%2==1){
//			System.out.println("����"+num+"��һ������");
//		}else{System.out.println("����"+num+"��һ��ż��");
//		}
		String result = (num % 2 == 1) ? "����" : "ż��";//���������
		System.out.println("����" + num + "��һ��" + result);
	}
}
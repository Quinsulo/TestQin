import java.util.Scanner;

//�����������Ӧ����ϰ
public class Test3{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		int cardNum;
		System.out.println("��������λ��Ա���ţ�");
		cardNum=input.nextInt();
		System.out.println("��Ա�����ǣ�"+cardNum);
		int ge,shi,bai,qian;
		int sum=0;
		qian=cardNum/1000;
		sum+=qian;
		bai=(cardNum%1000)/100;
		sum+=bai;
		shi=(cardNum%100)/10;
		sum+=shi;
		ge=cardNum%10;
		sum+=ge;
		
		System.out.print("ǧλ����"+qian+";");
		System.out.print("��λ����"+bai+";");
		System.out.print("ʮλ����"+shi+";");
		System.out.println("��λ����"+ge+";");
		System.out.print("��Ա����"+cardNum+"��λ֮�ͣ�"+sum);
	}
}
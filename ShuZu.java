import java.util.Scanner;

//������ϰ
public class ShuZu{
	public static void main(String[] args){
	/*	int sum=0;
		//����ͬʱ����ռ�
		int[] a=new int[5];
		//�����������ռ�
		int[] b;
		b=new int[3];
		//����ͬʱ��ֵ������Ĭ�ϳ���
		String[] c=new String[]{"","",""};
		int[] d={1,2,3};
		//���鳤��
		int e=a.length;
		//forѭ���������飬foreach,����
		for(int num:a){
			sum+=num;
		}*/
		
		
/*		int[] a={8,4,2,1,23,344,12};
		int sum=0;
		int num;
		boolean guessResult = false;
		for(int outer:a){
			System.out.println(outer);
			sum+=outer;
		}
		System.out.println("������ֵ�ĺ�Ϊ��"+sum);
		Scanner input=new Scanner(System.in);
		
		while(!guessResult){
		    System.out.print("����������һ������:");
		    num=input.nextInt();
		    for(int temp:a){
			    if(temp==num){
				   System.out.println("��ϲ�������֣�");
				   guessResult=true;
				   break;
			    }
			    guessResult=false;
		    } 
		    if(!guessResult){
			    System.out.println("��Ǹ��δ���У����������룡");
		    }
		}*/
		
		double[] money=new double[5];
		double sum=0;
		Scanner input=new Scanner(System.in);
		System.out.println("�������Ա���µ����Ѽ�¼");
		for(int i=0;i<money.length;i++){
			System.out.print("�������"+(i+1)+"�ʹ����");
			money[i]=input.nextDouble();
			sum+=money[i];
		}
		System.out.print("\n"+"���"+"\t\t"+"��Ԫ��"+"\n");
		for(int i=0;i<money.length;i++){
			System.out.print((i+1)+"\t\t"+money[i]+"\n");
		}
		System.out.print("�ܽ��"+"\t\t"+sum+"\n");
		double max=money[0];
		//�����ֵ
		for(int i=0;i<money.length;i++){
			if(money[i]>max){
				max=money[i];
			}
		}
		System.out.print("���ֵ"+"\t\t"+max+"\n");
		
		//�������Ԫ��
		
	}
}
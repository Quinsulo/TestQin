import java.util.Scanner;

//数组练习
public class ShuZu{
	public static void main(String[] args){
	/*	int sum=0;
		//声明同时分配空间
		int[] a=new int[5];
		//先声明后分配空间
		int[] b;
		b=new int[3];
		//声明同时赋值，产生默认长度
		String[] c=new String[]{"","",""};
		int[] d={1,2,3};
		//数组长度
		int e=a.length;
		//for循环遍历数组，foreach,迭代
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
		System.out.println("数列数值的和为："+sum);
		Scanner input=new Scanner(System.in);
		
		while(!guessResult){
		    System.out.print("请任意输入一个整数:");
		    num=input.nextInt();
		    for(int temp:a){
			    if(temp==num){
				   System.out.println("恭喜猜中数字！");
				   guessResult=true;
				   break;
			    }
			    guessResult=false;
		    } 
		    if(!guessResult){
			    System.out.println("抱歉，未猜中，请重新输入！");
		    }
		}*/
		
		double[] money=new double[5];
		double sum=0;
		Scanner input=new Scanner(System.in);
		System.out.println("请输入会员本月的消费记录");
		for(int i=0;i<money.length;i++){
			System.out.print("请输入第"+(i+1)+"笔购物金额：");
			money[i]=input.nextDouble();
			sum+=money[i];
		}
		System.out.print("\n"+"序号"+"\t\t"+"金额（元）"+"\n");
		for(int i=0;i<money.length;i++){
			System.out.print((i+1)+"\t\t"+money[i]+"\n");
		}
		System.out.print("总金额"+"\t\t"+sum+"\n");
		double max=money[0];
		//求最大值
		for(int i=0;i<money.length;i++){
			if(money[i]>max){
				max=money[i];
			}
		}
		System.out.print("最大值"+"\t\t"+max+"\n");
		
		//数组插入元素
		
	}
}
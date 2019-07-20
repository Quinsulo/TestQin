//录入姓名成绩以及计算平均分
import java.util.Scanner;

public class Example1{
	public static void main(String[] args){
		String name;
		double point=0;
		double sum=0;
		Scanner input=new Scanner(System.in);
		System.out.print("输入学生姓名：");
		name=input.next();
		for(int i=1;i < 6;i++){
			System.out.print("请输入5门功课中第"+i+"门课的成绩：");
			point=input.nextDouble();
			sum=sum+point;
		}
		sum=sum/5;
		System.out.print(name+"的平均分为："+sum);
	}
}
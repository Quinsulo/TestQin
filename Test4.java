import java.util.Scanner;

//条件运算符使用练习
public class Test4{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("请输入一个非零整数：");
		int num=input.nextInt();
//		if(num%2==1){
//			System.out.println("数字"+num+"是一个奇数");
//		}else{System.out.println("数字"+num+"是一个偶数");
//		}
		String result = (num % 2 == 1) ? "奇数" : "偶数";//条件运算符
		System.out.println("数字" + num + "是一个" + result);
	}
}
//输出一个加法表
import java.util.Scanner;

public class Example2{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int number;
		System.out.print("请输入一个值：");
		number = input.nextInt();
		//System.out.print("根据这个值可以输出以下加法表:");
		for(int i=0,j=number;i<=number;i++,j--){
				System.out.println(i+" + "+j+" = "+number);
		}
	}
}
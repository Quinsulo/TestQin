import java.util.Scanner;

//算术运算符的应用练习
public class Test3{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		int cardNum;
		System.out.println("请输入四位会员卡号：");
		cardNum=input.nextInt();
		System.out.println("会员卡号是："+cardNum);
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
		
		System.out.print("千位数："+qian+";");
		System.out.print("百位数："+bai+";");
		System.out.print("十位数："+shi+";");
		System.out.println("个位数："+ge+";");
		System.out.print("会员卡号"+cardNum+"各位之和："+sum);
	}
}
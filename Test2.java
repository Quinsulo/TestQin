//Scanner类的使用练习
import java.util.*;
public class Test2{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		int number;
		System.out.print("请输入会员卡号：");
		number=input.nextInt();
		//next方法似乎只生效一次
		//System.out.print("会员卡号是："+input.nextInt());
		System.out.print("会员卡号是："+number);
	}
}
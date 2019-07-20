import java.util.Scanner;

public class DoWhile{
	public static void main(String[] args){
		String result="";
		Scanner input=new Scanner(System.in);
		
		do{
			System.out.println("搞学习");
			System.out.println("是否合格（y/n)");
			result = input.next();
		}while("n".equals(result));
		
		System.out.println("搞完了");
	}
}
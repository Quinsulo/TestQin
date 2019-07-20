import java.util.Scanner;

public class HelloWorld{
	public static void main(String[] args){

		String result;
		@SuppressWarnings("resource")
		Scanner input=new Scanner(System.in);
		System.out.println("是否合格（y/n)");
		result = input.next();
		
		while("n".equals(result)){
			System.out.println("继续学！");
			System.out.println("是否合格（y/n)");
			result = input.next();
		}
		System.out.println("学完了！");
	}
}
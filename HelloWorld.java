import java.util.Scanner;

public class HelloWorld{
	public static void main(String[] args){

		String result;
		@SuppressWarnings("resource")
		Scanner input=new Scanner(System.in);
		System.out.println("�Ƿ�ϸ�y/n)");
		result = input.next();
		
		while("n".equals(result)){
			System.out.println("����ѧ��");
			System.out.println("�Ƿ�ϸ�y/n)");
			result = input.next();
		}
		System.out.println("ѧ���ˣ�");
	}
}
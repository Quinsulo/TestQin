import java.util.Scanner;

public class DoWhile{
	public static void main(String[] args){
		String result="";
		Scanner input=new Scanner(System.in);
		
		do{
			System.out.println("��ѧϰ");
			System.out.println("�Ƿ�ϸ�y/n)");
			result = input.next();
		}while("n".equals(result));
		
		System.out.println("������");
	}
}
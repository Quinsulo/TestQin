//����100���ڵ�ż����
public class Work1{
	public static void main(String[] args){
		int i=0;
		int sum=0;
		
		while(i<=100){
			sum=sum+i;
			i=i+2;
		}
		System.out.println("ʹ��whileѭ�����㣺"+sum);
		sum=0;
		i=0;
		
		do{
			sum=sum+i;
			i=i+2;
		}while(i<=100);
		System.out.println("ʹ��do-whileѭ�����㣺"+sum);
		sum=0;
		i=0;
		
		for(;i<=100;i=i+2){
			sum=sum+i;
		}
		System.out.println("ʹ��forѭ�����㣺"+sum);
	}
}
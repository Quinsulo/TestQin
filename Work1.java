//计算100以内的偶数和
public class Work1{
	public static void main(String[] args){
		int i=0;
		int sum=0;
		
		while(i<=100){
			sum=sum+i;
			i=i+2;
		}
		System.out.println("使用while循环计算："+sum);
		sum=0;
		i=0;
		
		do{
			sum=sum+i;
			i=i+2;
		}while(i<=100);
		System.out.println("使用do-while循环计算："+sum);
		sum=0;
		i=0;
		
		for(;i<=100;i=i+2){
			sum=sum+i;
		}
		System.out.println("使用for循环计算："+sum);
	}
}
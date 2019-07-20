//²âÊÔÑ­»·Ç¶Ì×
public class Test{
	public static void main(String[] args){
		for(int i = 1;i<=5;i++){
			if(i>1){
				System.out.print("\n");
			}
			for(int k=0;k<5-i;k++){
				System.out.print(" ");
			}
			for(int j=0;j<2*i-1;j++){
				System.out.print("*");
			}
			for(int k=0;k<5-i;k++){
				System.out.print(" ");
			}
		}
	}
}
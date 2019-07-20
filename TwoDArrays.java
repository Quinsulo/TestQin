import java.util.Scanner;

//¶şÎ¬Êı×éÁ·Ï°
public class TwoDArrays{
	public static void main(String[] args){
		double[][] scores=new double[5][5];
		Scanner input=new Scanner(System.in);
		for(int i=0;i<scores.length;i++){
			for(int j=0;j<scores[i].length;j++){
				System.out.print("Please Import The Score of Class "+(i+1)+" Student "+(j+1)+":");
				scores[i][j]=input.nextDouble();
			}
		}
		for(int i=0;i<scores.length;i++){
			double sum=0;
			for(int j=0;j<scores[i].length;j++){
				sum+=scores[i][j];
			}
			System.out.println("The Total Score of Class "+(i+1)+" Is:"+sum);
		}
	}
}
import java.util.Scanner;

//break语句练习
public class TestBreak{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int score;
		int sum=0;
		System.out.print("请输入学生姓名：");
		String name=input.next();
		for(int i=1;i<6;i++){
			System.out.print("请输入第"+i+"门课的成绩：");
			score=input.nextInt();
			sum+=score;
			if(score<0){
				System.out.println("抱歉，分数录入错误，请重新录入！");
				break;
			}
			if(i==5){
				double avg=sum/5;
				System.out.println("平均分为："+avg);
			}
		}
	}
}
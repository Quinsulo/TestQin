import java.util.Scanner;

//continue语句练习
public class TestContinue{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		double classNum,num;
		int score;
		num=0;
		System.out.print("请输入班级总人数：");
		classNum=input.nextInt();
		for(int i=1;i<classNum+1;i++){
			System.out.print("请输入第"+i+"位学生的成绩:");
			score=input.nextInt();
			if(score<80){
				continue;
			}
			num++;
		}
		System.out.println("80分以上的学生人数为："+(int)num);
		System.out.print("80分以上学生所占比例为："+(num/classNum)*100+"%");
	}
}
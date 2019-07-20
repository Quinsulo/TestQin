import java.util.Scanner;

//流程控制练习
public class Test5{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		double score;
		System.out.print("请输入学生成绩：");
		score=input.nextDouble();
		if(score>=80){
			System.out.print("该成绩为优良");
		}else if(score>=60){
			System.out.print("该成绩为中等");
		}else{
			System.out.println("该成绩为不合格");
			if(score>=55){
				System.out.print("嗯是差一篾片豆及格了");
			}
		}
	}
}
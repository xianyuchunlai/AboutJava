import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

		/*
         * 有四个班级，每个班级有5个学生
		 * 所以每个班级都要循环一次  在班级循环中再去接收没个学生的成绩
		 */

        //第一层循环，每次循环表示一个班级
        for (int i = 1; i < 5; i++) {
            //第二层循环表示要接收一个学生成绩
            double sum = 0;
            for (int j = 1; j < 6; j++) {
                //当两层循环都执行完毕时下面的输出语句会执行多少次？
                System.out.println("请输入" + i + "班，第" + j + "名学生的成绩：");
                double score = input.nextInt();
                sum += score;
            }
            System.out.println(i + "班的学生平均分：" + (sum / 5));
        }
        input.close();
    }
}

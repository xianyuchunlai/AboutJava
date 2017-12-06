import java.util.Scanner;

public class Main5Sort {
    public static void main(String[] args) {
        /*
		 * 创建一个数组用来接收成绩
		 */
        int[] scores = new int[5];
        Scanner input = new Scanner(System.in);
//		for (int i = 0; i < scores.length; i++) {
//			System.out.println("第" + i + "个成绩");
//			scores[i] = input.nextInt();
//		}
//		Arrays.sort(scores);
//		System.out.println(Arrays.toString(scores));

        int max = 0;
        for (int i = 0; i < 5; i++) {
            System.out.println("请输入第" + i + "个学生的成绩：");
            scores[i] = input.nextInt();
            if (max < scores[i]) {
                max = scores[i];
            }
        }
        System.out.println(max);
        input.close();
    }

}

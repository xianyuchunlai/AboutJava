import java.util.Arrays;
import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        //创建数组的方式一：
        int[] scores = {98, 99, 94, 56, 87};
        /*
		 * scores就是标识符，是这个数组的名字
		 * int表示这个数组可以存放的类型
		 * int[]表示这个数组的类型
		 *
		 * {}中的内容，就是数组的元素
		 * 98：数组中的元素，就是数组的内容
		 * 下标：元素在数组中的位置，从0开始计数
		 * 数组中最后一个元素的下标为：数组的长度 - 1
		 */

        //取出数组中下标为0的元素，赋值给b
        int b = scores[0];
        System.out.println(b);

        //创建数组的方式二：
        int[] d = new int[3];

        Scanner input = new Scanner(System.in);

        //d.length表示数组d的长度
        for (int i = 0; i < d.length; i++) {
            System.out.println("请输入第" + (i + 1) + "个成绩：");
            d[i] = input.nextInt();
        }
        System.out.println(Arrays.toString(d));
//		d[4] = 100;
        input.close();
    }
}

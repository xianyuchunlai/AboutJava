import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {

//		System.out.println("1");

		/*
		 * while循环
		 * 先判断括号中的内容，是否为true   如果为true则执行大括号里面的内容
		 * 然后在判断括号中的内容是否为true，如果……重复执行
		 * 当括号中的内容为false时，循环停止
		 */


//		int i = 50;
//		while(i < 50) {
//			//小括号里面的内容叫循环条件
//			//大括号里面的内容叫循环体
//			System.out.println(i);
        //循环增量：为了跳出循环，防止出现死循环
//			i = i + 1;
//			i++;
//			i = i * 7;
//			i *= 7;
//		}

//		int progress = 1;
//		do {
//			System.out.println(progress);
//			progress += 2;
//		}while(progress < 10);

		/*
		 * do while与while的区别
		 * do while先执行一次循环体再判断
		 * while先判断再执行循环体
		 */
//		int a = 1;
//		int count = 0;
//		while(a <= 100) {
//			count++;
//			System.out.println("第" + count + "次：好好学习天天向上");
//			a++;
//		}


		/*
		 * int j = 0;设置初始条件
		 * j < 100；循环条件
		 * j++;循环增量
		 * {}中的内容；循环体
		 */
        for (int j = 100; j < 100; j++) {
            System.out.println("第" + (j + 1) + "次：好好学习天天向上");
        }

		/*while(true) {}
		for(;;) {

		}
		这两个都是死循环
		*/

        int f = 0;
        for (; f < 10; f++) {

        }
        for (; f < 10; f += 5) {

        }

        Scanner input = new Scanner(System.in);
        System.out.println("请输入五门课成绩");
        //下面这句话，会得到控制台输入的内容，我们建立一个变量去接受得到内容
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            System.out.println("第" + (i + 1) + "门:");
            int sc = input.nextInt();
            System.out.println("第" + (i + 1) + "门课的成绩：" + sc);
            sum = sum + sc;
        }
        int avg = sum / 5;
        System.out.println("五门课的平均值：" + avg);
        input.close();
    }
}

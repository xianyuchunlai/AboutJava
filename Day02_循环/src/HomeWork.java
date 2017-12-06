import java.util.Scanner;

public class HomeWork {
    public static void main(String[] args) {
        System.out.println("******************\n  ***  JAVA  ***\n    ******************");

        int sum = 189;
        //计算189如何由最少的100.50.30.10.5.1组成
        for (int i = 1; i <= sum / 100; i++) {
            for (int j = 1; j <= sum / 50; j++) {
                for (int k = 1; k <= sum / 20; k++) {
                    for (int m = 1; m <= sum / 10; m++) {
                        for (int n = 1; n <= sum / 5; n++) {
                            for (int r = 1; r <= sum / 1; r++) {
                                if (100 * i + 50 * j + 20 * k + 10 * m + 5 * n + 1 * r == sum) {
                                    System.out.println("100面值：" + i);
                                    System.out.println("50面值：" + j);
                                    System.out.println("20面值：" + k);
                                    System.out.println("10面值：" + m);
                                    System.out.println("5面值：" + n);
                                    System.out.println("1面值：" + r);
                                }
                            }
                        }
                    }
                }
            }
        }

        //判断是数是奇数还是偶数
        if (sum % 2 == 0) {
            System.out.println("是偶数");
        } else {
            System.out.println("是奇数");
        }

        if (sum <= 50) {
            System.out.println(sum * 0.15);
        } else {
            System.out.println(sum * 0.15 + (sum - 50) * 0.25);
        }

        //判断一个年份是否是闰年
//		System.out.println("请输入一个年份：");
//		Scanner input = new Scanner(System.in);
//		int sc = input.nextInt();
//		if(sc % 4 == 0 && sc % 100 != 0 || sc % 400 == 0) {
//			System.out.println(sc + "年是闰年");
//		}else {
//			System.out.println(sc + "年不是闰年");
//		}
//		input.close();

        //10亿每天取一半，什么时候可以取完
        int t = 1000000000;
        int count = 0;
        while (t > 0) {
            t /= 2;
            count++;
        }
        System.out.println(count);
    }
}
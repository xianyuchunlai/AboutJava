import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入一个数：");
//		int sum = input.nextInt();
//		for (int i = 0; i <= sum; i++) {
//			System.out.println(i + "+" + (sum - i) + "=" + sum);
//		}
//		for(int i = 0; i <= sum; i++) {
//			for(int j = sum; j >= 0; j--) {
//				if(i + j == sum) {
//				System.out.println(i + "+" + j + "=" + sum);
//				}
//			}
//		}

//		for(int i = 0, j = sum; i <= sum; i++, j--) {
//			System.out.println(i + "+" + j + "=" + sum);
//		}

//		for(int i = 0; i < 5; i++) {
//			int score = input.nextInt();
//			//循环输入成绩
//			//做一个条件判断是否为负数
//			if(score < 0) {
//				System.out.println("输入错误");
//				//使用break跳出循环
//				break;
//			}
//		}

        int people = 0;
        for(int i = 0; i < 10; i++) {
            //循环输入成绩如果成绩大于80则people++
            int javaScore = input.nextInt();
            if(javaScore < 80) {
                continue;
            }
            people++;
        }
        System.out.println("80分以上的人数：" + people);



        input.close();
    }
}

import java.util.Scanner;

public class Homework {
    public static void main(String[] args) {
//		for(int i = 0; i < 5; i++) {
//			for(int j = 0; j < 5; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//
//		for (int i = 1; i <= 9; i++) {
//			for (int j = 1; j <= i; j++) {
//				System.out.print(i + "*" + j + "=" + (i * j) + "\t");
//			}
//			System.out.println();
//		}


        for(int i = 100; i < 1000; i++) {
            int geWei,shiWei,baiWei;
            baiWei = i / 100;
            shiWei = (i - baiWei * 100) / 10;
            geWei = i - baiWei * 100 - shiWei * 10;
            if(Math.pow(geWei, 3) + Math.pow(shiWei, 3) + Math.pow(baiWei, 3) == i) {
                System.out.println("水仙花数：" + i);
            }


        }
        int[] arr = new int[] {55,45,65,23,54};
        int sum = 0;
        int avg = 0;
        int max = 0;
        for(int j = 0; j < arr.length; j++) {
            sum += arr[j];
            avg = sum / arr.length;
            if(max < arr[j]) {
                max = arr[j];
            }
        }
        System.out.println("和：" + sum);
        System.out.println("平均值：" + avg);
        System.out.println("最大值：" + max);
        int min = 0;
        for(int j = 0; j < arr.length - 1; j++) {
            min = arr[j];
            if(arr[j] > arr[j + 1]) {
                min = arr[j + 1];
            }
        }
        System.out.println("最小值：" + min);

        for(int i = 0; i < 7; i++) {
            for(int j = i; j < 7; j++) {
                System.out.print(" ");
            }
            for (int j2 = 0; j2 <= i; j2++) {
                if(i % 2 == 0) {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }

        int H = 19, W = 19;
        for(int i = 0; i < (H+1) / 2; i++) {
            for(int j = 0; j < W / 2 - i; j++) {
                System.out.print(" ");
            }
            for(int k = 1; k < (i + 1) * 2; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i = 1; i <= H / 2; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            for(int k = 1; k <= W - 2 * i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

//	    String Id = "zhangs123";
//	    int password = 197346285;
//	    String name = "zhangs";
//
//	    System.out.println("请输入账号：");
//	    Scanner input = new Scanner(System.in);
//	    while(true) {
//	    if(input.next().equals(Id)) {
//	    	System.out.println("请输入密码：");
//	    	break;
//	    }else {
//	    	System.out.println("账号错误请重新输入！！！");
//	    }
//	    }
//	    while(true) {
//	    if(input.nextInt() == password) {
//	    	System.out.println("欢迎" + name + "登录系统");
//	    	break;
//	    }else {
//	    	System.out.println("密码错误请重新输入！！！");
//	    }
//	    }
//	    input.close();
//
        int l = 11;
        for (int i = 0; i < l; i++) {
            for (int j = 0; j < l; j++) {
                if(i == 0 | i == (l - 1)) {
                    System.out.print("*");
                }else if(j == 0 | j == (l - 1)) {
                    System.out.print("*");
                }else if(j == i | (i == l - j - 1)) {
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}

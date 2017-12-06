public class Main {
    public static void main(String[] args) {


        //定义一个变量，表示JAVA成绩
        int javaScore = 90;
        if (javaScore > 90) {
            System.out.println("成绩优秀");
        }

        if (javaScore > 60) {
            System.out.println("进入下一阶段学习");
        } else {
            System.out.println("重修");
        }
        //当要执行的语句只有一条是，if语句后面可以不写{}
        if (javaScore < 60)
            System.out.println("重修");
        System.out.println("aa");

        //当成绩大于85并且小100时，才会执行{}中的语句
        //&&：当左侧的条件表达式不成立就不会再去判断右侧的表达式
        //&：当左侧表达式不成立依然会判断右侧表达式
        if (javaScore > 85 && javaScore < 100) {
            System.out.println("屌爆了屌爆了");
        }


        if (javaScore > 60 || javaScore < 90) {
            //两个表达式只要有一个成立，结果就为true
            //||：当左侧的条件表达式成立就不会判断右侧的条件表达式
            //|：当左侧的条件表达式成立任然会判断右侧的条件表达式
        }

        // ! 非：
        if (!(javaScore < 60)) {
            //非真即假   非假即真
            System.out.println("说明》= 60");
        }


        //如何交换两个变量的值
        int a = 10;
        int b = 20;
        //第一种方法：定义一个变量c，将a的值赋给c，再将b的值赋给a,再将c的值赋给b
        int c = a;
        a = b;
        b = c;
        System.out.println(a);
        System.out.println(b);
        //第二种方法：不使用第三方变量，直接使用加减运算
        a = a + b;
        b = a - b;
        a = a - b;
        //第三种方法：使用^
        //两者相同，则为0，不相同则为0    相同则0，不同则1
        a = a^b;
        b = a^b;
        a = a^b;
        System.out.println("  " + a);
        System.out.println("  " + b);

        if (javaScore >= 80) {
            System.out.println("优秀");
        }else if (javaScore >= 60) {
            System.out.println("中等");
        }else {
            System.out.println("差");
        }
        int speed = 15;
        String sex = "man";
        if (speed > 10) {
            if (sex == "man" ) {
                System.out.println("进入男子决赛组");
            }else if(sex == "female"){
                System.out.println("进入女子决赛组");
            }else {
                System.out.println("这不是人");
            }
        }

        int n = 3;
        switch(n) {
            case 2:
                //如果switch后面的括号中的内容等于2的话，那么就执行下面的代码
                System.out.println("就是2");
                break;
            case 3:
                System.out.println("就是3");
                break;
            default:
                System.out.println("默认值");
        }
        switch(n) {
            case 1:
                System.out.println("参加夏令营一个月");
                break;
            case 2:
                System.out.println("惠普电脑一台");
                break;
            case 3:
                System.out.println("移动硬盘一个");
                break;
            default:
                System.out.println("谢谢参与");
        }
        char ch = 'a';
        switch(ch) {
            case 'a':
                break;
            case 'b':
                break;
        }
    }
}

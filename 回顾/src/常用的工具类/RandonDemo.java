package 常用的工具类;

import java.util.Random;

public class RandonDemo {
    public static void main(String[] args) {
        Random random =new Random();
//        int r = random.nextInt();
//        System.out.println(random);
//        System.out.println(r);
//
//
//        int e = random.nextInt(11);
//        System.out.println(e);


        //30-50
//        for (int i = 0; i < 100; i++) {
//            int x = random.nextInt(50-30+1)+30;
//            System.out.print(x+"\n");
//            if (x >48) {
//                System.out.println("存在大于50的");
//            }
//        }


          int p =0;
        for (int i = 0; i < 500; i++) {
            Boolean flag = random.nextBoolean();
            System.out.println(flag);

            if (flag==true){
               p++;
            }

        }
        System.out.println(p);

    }
}

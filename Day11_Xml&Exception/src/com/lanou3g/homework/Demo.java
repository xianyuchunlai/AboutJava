package com.lanou3g.homework;

public class Demo {
    public static void main(String[] args) {
        test("abcdefg", 0);
    }
    public static String test(String str,int i){
        char[] chars = str.toCharArray();
            //第一次反转第一个元素和最后一个元素换位
            char temp = chars[i];
            chars[i] = chars[chars.length - 1 - i];
            chars[chars.length - 1 - i] = temp;
            String s = str.valueOf(chars);
            i++;
            if (i <= chars.length / 2){
                test(s,i);
                System.out.println(s);
            }
//            System.out.println(s);
                return s;
        }
}

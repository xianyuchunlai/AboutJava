package share;

import java.util.Arrays;

public class Sort {

	public static void main(String[] args) {
		// 这里初始化数组
		int [] array ={8,9,6,0,7,5,3,1,4,2};
		
		for(int i=1;i<array.length;++i){
			if(array[i]<array[i-1]){
				int temp = array[i];
				//把角标保存到m变量上
				//这样操作这个变量变化的时候
				//是不会影响到外层循环中使用的i的
				int m = i;
				for(int j = m-1; j>=0 && array[j]>temp;j--){
					array[j+1] = array[j];
					m--;
				}
				array[m] = temp;
			}
		}
		System.out.println(Arrays.toString(array));
	}

}

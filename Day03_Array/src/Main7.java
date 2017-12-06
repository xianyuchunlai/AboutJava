import java.util.Arrays;

public class Main7 {

    public static void main(String[] args) {
        int[] arr = new int[] {98,88,83,63,64};
        int a = 100;
        int[] arr1 = Arrays.copyOf(arr, 6);
        arr1[5] = a;
        Arrays.sort(arr1);
        System.out.println(Arrays.toString(arr1));
    }
}

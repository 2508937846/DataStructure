/**
 * @author wtx
 * @date 2022/4/19
 */
import java.util.Scanner;

public class SelectionSort {
    public static void main(String[] args) {
        System.out.println("请输入排序的个数");
        Scanner in = new Scanner(System.in);
        int sc = in.nextInt();
        int temp;
        System.out.println("请输入要排列的数");
        int[] arr = new int[sc];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=in.nextInt();
        }

        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i]>arr[j]){
                    temp=arr[i];
                     arr[i]=arr[j];
                                             arr[j]=temp;
                }
            }
        }
        System.out.println("这个是排序后的结果:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
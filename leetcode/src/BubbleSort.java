import javax.xml.crypto.Data;
import java.sql.SQLOutput;

/**
 * @author wtx
 * @date 2022/4/18
 */
import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("请输入需要排列的数的个数");
        int sc = in.nextInt();

        System.out.println("请输入要排列的数据");
        int temp;
        int[] arr = new int[sc];
        for (int i = 0; i < sc; i++) {
            arr[i]= in.nextInt();
        }
        for(int i=0;i<arr.length-1;i++) {
            for (int j = 0; j < arr.length-i-1; j++) {
                if(arr[j]>arr[j+1]){
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        System.out.println("排列结果");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
//缺点:有空排序
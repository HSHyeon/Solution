import java.util.Arrays;
import java.util.Scanner;

public class SlidingWindow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        int[] arr = new int[N];


        for(int i=0;i<N ; i++){
            arr[i]= sc.nextInt();
        }
        Arrays.sort(arr);

        int i =0;
        int count = 0;
        int j = N-1;

        while(i<j){
            if(arr[i] + arr[j] == M) {
                i++;
                j--;
                count++;
            }else if(arr[i] + arr[j] < M ){
                i++;
            }else if(arr[i]+arr[j] > M)
                j--;
        }
        System.out.println(count);

    }
}

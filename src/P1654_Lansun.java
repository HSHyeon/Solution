import java.util.Arrays;
import java.util.Scanner;

public class P1654_Lansun {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int K = sc.nextInt();
        int N = sc.nextInt();
        int[] arr = new int[K+1];


        for(int i=0;i<K;i++){
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);
        long high = arr[K];
        long low = 1;
        long mid = 0;
        long answer =0;

        while(high>=low){
            int tmptotal =0;
            mid =(high +low)/2;

            for(int i=0;i<=K;i++)
                tmptotal += arr[i]/mid;

            if(tmptotal>=N) {
                answer = mid;
                low = mid + 1;
            }
            else {

                high = mid - 1;
            }

        }System.out.println(answer);

    }
}

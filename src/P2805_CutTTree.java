import java.util.Arrays;
import java.util.Scanner;

public class P2805_CutTTree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        int[] arr = new int[N+1];

        for(int i=0;i<N;i++)
            arr[i] = sc.nextInt();

        Arrays.sort(arr);

        int high = arr[N];
        int low = 0;
        int mid = (high+low)/2;
        int answer=mid;

        while(low<=high){
            mid = (high+low)/2;
            long total =0;
            for(int i=0;i<=N;i++){
                if(arr[i]>mid) total+=(arr[i]-mid);
            }
            if(total < M) {
                high = mid-1;
            }else {
                answer = mid;
                low = mid + 1;
            }

        }System.out.println(answer);
    }
}

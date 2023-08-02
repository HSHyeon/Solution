import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;


public class P2512_Money {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());

        int[] arr = new int[n+1];
        String[] str = bf. readLine().split(" ");
        int total =0;

        for(int i=0;i<n;i++) {
            arr[i] = Integer.parseInt(str[i]);
            total = total + arr[i];
        }

        int m =  Integer.parseInt(bf.readLine());
        Arrays.sort(arr);
       // System.out.println(Arrays.toString(arr));
        int high = arr[n];
        int low = 0;
        int answer =0;
        int  mid = (high + low) / 2;

        if(total <=  m) System.out.println(arr[n]);
        else {
            while (low <= high) {
                int tmptotal = 0;
                mid = (high + low) / 2;

                for (int i = 0; i <= n; i++) {
                    tmptotal += Math.min(arr[i],mid);
                }

                if (tmptotal > m) {
                    high = mid - 1;
                } else {
                    answer = mid;
                    low = mid + 1;

                }

            }System.out.println(answer);
        }
    }
}

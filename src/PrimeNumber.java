import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

            int m = sc.nextInt();
            int k = sc.nextInt();

            int[] arr = new int[k+1];


            for(int i=2;i<=k;i++){
                arr[i] =i;
            }
            for (int i = 2; i <= k; i++) {
                if (arr[i] == 0) continue;
                for (int j = 2 * i; j <= k; j += i) {
                    arr[j] = 0;
                }
            }

            for(int i=m;i<=k;i++)
                if(arr[i]!=0) System.out.println(arr[i]);
    }
}

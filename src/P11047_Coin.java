import java.util.Scanner;

public class P11047_Coin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n+1];
        int count =0;
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        for(int i=n-1;i>=0;i--) {
            if (arr[i] <= k && k != 0){
                count = count + k/arr[i];
                k = k % arr[i];
            }
        }
        System.out.println(count);
    }
}

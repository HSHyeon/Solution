import java.util.Scanner;

public class P1912_SequenceHap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n+1];
        int[] D = new int[n+1];

        for(int i=0;i<n;i++)
            arr[i] = sc.nextInt();

        D[0] = arr[0];
        int max = D[0];
        for(int i=1;i<n;i++){
            if(D[i-1]>0) D[i] = D[i-1] +arr[i];
            else D[i] = arr[i];

            if(max< D[i]) max = D[i];
        }


        System.out.println(max);
    }
}

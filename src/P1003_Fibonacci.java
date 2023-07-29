import java.util.Scanner;

public class P1003_Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int[][] fib = new int[T+1][2];
        for(int i=0;i<T;i++){
            int n = sc.nextInt();
            int[][] fib1 = new int[n+1][2];

            fib1[0][0] = 1;
            fib1[0][1] = 0;

            if(n == 0) {
                fib[i][0] = fib1[n][0];
                fib[i][1] = fib1[n][1];
                continue;
            }

            fib1[1][0] = 0;
            fib1[1][1] = 1;

            if(n == 1) {
                fib[i][0] = fib1[n][0];
                fib[i][1] = fib1[n][1];
                continue;
            }

            for(int j=2;j<=n;j++){
                fib1[j][0] = fib1[j-1][0]+fib1[j-2][0];
                fib1[j][1] = fib1[j-1][1]+fib1[j-2][1];
            }

            fib[i][0] = fib1[n][0];
            fib[i][1] = fib1[n][1];
        }
        for(int i=0;i<T;i++)
            System.out.println(fib[i][0]+" "+fib[i][1]);

    }
}

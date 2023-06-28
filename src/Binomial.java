import java.util.Scanner;

public class Binomial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N =  sc.nextInt();
        int K =  sc.nextInt();
        int res = 1;

        for(int i=N;i>N-K;i--)
            res = res*i;
        for(int i=1;i<=K;i++)
            res = res/i;

        System.out.println(res);
    }
}

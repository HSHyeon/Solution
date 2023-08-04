import java.util.Arrays;
import java.util.Scanner;

public class P11399_ATM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N+1];

        for(int i=0;i<N;i++)
            arr[i] = sc.nextInt();

        int total =0;
        Arrays.sort(arr); //왜 정렬만 하면 인덱스 1부터 저장되지?

        for(int i=0;i<N;i++)
            total = total + arr[i+1]*(N-i);


        System.out.println(total);
    }
}

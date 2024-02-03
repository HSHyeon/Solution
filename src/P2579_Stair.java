import java.util.Scanner;

public class P2579_Stair {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] arr = new int[N+1];
        int[] answer = new int[N+1];
    
        for(int i=0;i<N;i++){
            arr[i] = sc.nextInt();
        }
        
        answer[0] = arr[0];
        answer[1] = answer[0]+ arr[1];

        for(int i=2;i<N ;i++) {
            if( i == 2 ) answer[i] =  Math.max(answer[i-2]+arr[i], arr[i-1]+arr[i]);
            else answer[i] = Math.max(answer[i-2]+arr[i], answer[i-3]+arr[i-1]+arr[i]);
        }

        System.out.println(answer[N-1]);
    }
}
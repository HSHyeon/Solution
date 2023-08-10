import java.util.Scanner;

public class P6603_Lotto {

    static int[] nums;
    static int[] S;
    static int K;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        K = 1;

        while(K != 0)
        {
            K = sc.nextInt();

            S = new int[K + 1];
            nums = new int[6];
            for (int i = 0; i < K; i++)
                S[i] = sc.nextInt();


            dfs(0,0);

            System.out.println();


        }
    }
    static void dfs(int a, int count){
        if(count == 6) {
            for(int i=0; i<6; i++)
                System.out.print(nums[i]+" ");
            System.out.println();
            return;
        }

        if(a == K)
            return;

        for(int i=a; i<K; i++) {
            nums[count] = S[i];
            dfs(i+1,count+1);
        }
    }
}

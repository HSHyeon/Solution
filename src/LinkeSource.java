import java.util.ArrayList;
import java.util.Scanner;

public class LinkeSource {
    static boolean[] visit;
    static ArrayList<Integer>[] arr;
    static int[][] arr1;
    static int N = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        int M = sc.nextInt();

        visit = new boolean[N+1];
       // arr = new ArrayList[N=1];

        arr1 = new int[N+1][N+1];

        int count=0;

        for(int i=0;i<M;i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            arr1[a][b]=1;
            arr1[b][a]=1;
       //     arr.add(sc.nextInt(),sc.nextInt());
        }

        for(int i=1;i<N+1;i++){
            if(!visit[i]) {
                Dfs(i);
                count++;
            }
        }
        System.out.println(count);
    }


    public static void Dfs(int v){
        visit[v] = true;

        for(int i=0; i<N+1; i++) {
            if (!visit[i] && arr1[v][i] != 0)
                Dfs(i);
        }
    }
}

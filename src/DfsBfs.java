
import java.io.IOException;
import java.util.*;

public class DfsBfs {
    static boolean[] dvisited, bvisited;
    static int[][] arr;
    static int n;
    public static void Dfs(int v){
        dvisited[v] = true;
        System.out.print(v + " ");

        for(int i=0; i<n+1; i++) {
            if (!dvisited[i] && arr[v][i] != 0)
                Dfs(i);
        }
    }
    public static void Bfs(int v){
        bvisited[v] =true;
        Queue<Integer> bqueue = new LinkedList<>();

        bqueue.add(v);

        while(!bqueue.isEmpty()){
            int curr = bqueue.remove();
            System.out.print(curr+ " ");
            for(int i =0 ; i< n+1 ; i++){
                if(!bvisited[i]&& arr[curr][i]!=0){
                    bvisited[i] = true;
                    bqueue.add(i);
                }
            }
        }
    }
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

         n =  sc.nextInt();
        int m =  sc.nextInt();
        int v =  sc.nextInt();

        arr = new int[n+1][n+1];
        dvisited = new boolean[n+1];
        bvisited = new boolean[n+1];


        for(int i=0;i<m;i++){
            int a =  sc.nextInt();
            int b =  sc.nextInt();

            arr[a][b] = arr[b][a] = 1;

        }

        Dfs(v);
        System.out.println();
        Bfs(v);

    }
}

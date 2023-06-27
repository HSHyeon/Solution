import java.util.Scanner;

public class virus {
    static boolean[] dvisited;
    static int[][] arr;
    static int n, count;
    public static void Dfs(int v){
        dvisited[v] = true;
        if(v!=1) count++;
        //   System.out.print(v + " ");

        for(int i=0; i<n+1; i++) {
            if (!dvisited[i] && arr[v][i] != 0)
                Dfs(i);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n =  sc.nextInt();
        int m =  sc.nextInt();

        arr = new int[n+1][n+1];
        dvisited = new boolean[n+1];

        count =0;
        for(int i=0;i<m;i++){
            int a =  sc.nextInt();
            int b =  sc.nextInt();

            arr[a][b] = arr[b][a] = 1;

        }
        Dfs(1);

        System.out.println(count);
    }
}

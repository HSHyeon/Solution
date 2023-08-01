import java.util.Scanner;

public class P1012_Cabbage {
    static boolean[][] visited;
    static int[][] arr;
    static int[] answer;
    static int[] dx = {0,1,0,-1};
    static int[] dy = {1,0,-1,0};
    static int count;
  //  static int N;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        answer = new int[T+1];
        for(int t=0;t<T;t++){
            count= 0;

            int M = sc.nextInt();
            int N = sc.nextInt();

            int K = sc.nextInt();

            arr = new int[M+2][N+2];
            visited = new boolean[M+2][N+2];

            for(int j=0;j<K;j++){
                int x = sc.nextInt();
                int y = sc.nextInt();

                arr[x+1][y+1] = 1;
            }

            for(int i=1;i<=M;i++)
                for(int j=1;j<=N;j++)
                    if(!visited[i][j] && arr[i][j]==1){
                    Dfs(i,j);
                    count++;
                }
            answer[t] = count;
        }

        for(int i=0;i<T;i++)
            System.out.println(answer[i]);
    }


    public static void Dfs(int v, int w){
        visited[v][w] = true;
        for(int k=0;k<4;k++){
            int x = v + dx[k];
            int y = w + dy[k];
            if(!visited[x][y] && arr[x][y]==1) Dfs(x,y);
    }
}
}

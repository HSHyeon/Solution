import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class P2178_Miro {
    static int n,m=0;
    static int[] dx = {0,1,0,-1};
    static int[] dy = {1,0,-1,0};

    static boolean[][] visited;
    static int[][] arr;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        arr =new int[n][m];
        visited= new boolean[n][m];

        for(int i=0;i<n;i++) {
            st = new StringTokenizer(br.readLine());
            String line = st.nextToken();
            for (int j = 0; j < m; j++) {
                arr[i][j] = Integer.parseInt(line.substring(j, j + 1));
            }
        }

        Bfs(0,0);
        System.out.println(arr[n-1][m-1]);
    }

    public static void Bfs(int v,int w){
      //  visited[v][w] =true;
        Queue<int[]> bqueue = new LinkedList<>();
        bqueue.offer(new int[]{v,w});
        visited[v][w] = true;

        while(!bqueue.isEmpty()){
            int now[] = bqueue.poll();
            for(int k=0;k<4;k++){
                int x = now[0] + dx[k];
                int y = now[1] + dy[k];
                if(x>=0 && y>=0 && x<n && y<m)
                    if(arr[x][y]!=0 && !visited[x][y]){
                        visited[x][y] =true;
                        arr[x][y] = arr[now[0]][now[1]] +1;
                        bqueue.add(new int[] {x,y});
                    }

            }

        }


    }
}

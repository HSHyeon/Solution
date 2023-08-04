import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class P2667_EstatNum {
    static int[][] arr;
    static boolean[][] visited;
    static ArrayList<Integer> estat = new ArrayList<>();
    static int count =0;
    static int answer =0;
    static int[] dx = {0,1,0,-1};
    static int[] dy = {1,0,-1,0};

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());

        arr = new int[n+2][n+2];
        visited = new boolean[n+2][n+2];

        for(int i=1; i<=n; i++) {
            String str = bf.readLine();
            for(int j=0; j<n; j++) {
                arr[i][j+1] = Character.getNumericValue(str.charAt(j));
            }
        }

        for(int i=1;i<=n ;i++)
            for(int j=1;j<=n;j++)
                if(!visited[i][j]&&arr[i][j] == 1) {
                    count =0;
                    dfs(i, j);
                    estat.add(answer, count);
                    answer++;
                }

        System.out.println(answer);
        estat.sort(Comparator.naturalOrder());
        for(int num:estat) System.out.println(num);


    }

    static void dfs(int v, int w){
        visited[v][w] = true;
        count++;

        for(int i=0;i<4;i++) {
            int y = w + dy[i];
            int x = v + dx[i];
            if(!visited[x][y] && arr[x][y] == 1)
                dfs(x,y);
        }
    }
}

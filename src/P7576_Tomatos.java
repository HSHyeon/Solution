import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class P7576_Tomatos {
    static int count =1;
    static int[][] arr;
    static int[] dx = {0,1,0,-1}; //좌우
    static int[] dy = {1,0,-1,0}; //상하
    static int n, m;
    static Queue<int[]> bqueue = new LinkedList<>();

    public static void Bfs(){
   
        while(!bqueue.isEmpty()){
            int[] a = bqueue.poll();
            int x = a[0];
            int y = a[1];
            for(int i=0;i<4;i++){ 

                int mx = x + dx[i];
                int my = y + dy[i];
                if( mx > m-1 || my > n-1 || mx < 0 || my < 0 ) continue;
                if(arr[mx][my]==0) {
                    arr[mx][my] = arr[x][y] + 1;
                    bqueue.add(new int[]{mx,my});;
                }
            }
        }

    }

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

         n =  sc.nextInt();
         m =  sc.nextInt();
        

        arr = new int[1002][1002];

     
        for(int i=0;i<m;i++){
            for(int j = 0 ; j < n ; j++){
                int a =  sc.nextInt();
                arr[i][j] = a;
                if(a == 1) bqueue.add(new int[]{i,j});
        }}
     Bfs();

     for(int i=0;i<m;i++){
        for(int j = 0 ; j < n ; j++){
            if(arr[i][j] == 0){
                count = 0;
                break;
            }
            if(arr[i][j] > count && count != 0)count = arr[i][j];
        }
    }
        System.out.println(count-1);

    }}
    




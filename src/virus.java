import java.util.Scanner;

public class virus {
    static int count =0;
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);	
		
		int N= sc.nextInt(); // 컴퓨터의 수
		int M = sc.nextInt(); // 네트워크 상에 연결되어 있는 컴퓨터 쌍의 수 즉, 간선의 수
		int V = sc.nextInt(); 
		
		int node[][]=new int[N+1][N+1];
		boolean check[] = new boolean[N+1];

		for(int i=0;i<M;i++) { // 그래프 구성
			int a=sc.nextInt();
			int b = sc.nextInt();
            node[a][b] = 1;
            node[b][a] = 1;
        }
        
        dfs(node,check ,N);
    
       

    }
    public static void dfs(int[][] a, boolean[] check, int v) {  

        check[v] = true;
        for(int i=0;i<check.length;i++){
            if(check[i]==false) dfs(a,check,i);
            count++;
        }
    }

}
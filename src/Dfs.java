import java.util.Scanner;

public class Dfs {
  
    public int[] memo;
    public void main(String[] args) {
 
		Scanner in = new Scanner(System.in);
        int[] visit;
		int N = in.nextInt();
        int M = in.nextInt();
        int R = in.nextInt();

        memo = new int[N+1];
		//System.out.println(fib(N));
//        dfs(N, visit, R);

 
	}
    public void dfs(int V, int E, int R) {
       memo[R] = 0;
       for(int i=0;i<R;i++){
 //       if(memo[x] == 1) dfs(V,E,x);
       }
  
    }

}
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Set;

public class P1327_SortGame {
    public static int[] reverse(int j, int K , int[] arr){
        int[] temp  = arr.clone(); 
        for(int i =j ;i < j+K  ;i++){
            temp[i] = arr[2*j+K-i-1];
        }
        return temp;
    }
    public static int dfs(int[] arr, int K){   
        Set<String> bvisited = new HashSet<>();
        Queue<StrCnt> bqueue = new LinkedList<>();
        int[] arrsort =  arr.clone();
        Arrays.sort(arrsort);  

        StrCnt start = new StrCnt(arr.clone(), 0);
        bqueue.add(start);
     
        while(!bqueue.isEmpty()){
            StrCnt temp = bqueue.poll();
            int[] tmparr = temp.arr;
            int count = temp.count;
            if(Arrays.equals(tmparr, arrsort)) return count;
            if(!bvisited.contains(Arrays.toString(tmparr))){  
                bvisited.add(Arrays.toString(tmparr));  
                for(int j = 0 ; j < arr.length -K +1; j++)
                {
                    StrCnt add = new StrCnt(reverse(j, K , tmparr), count+1);

                    bqueue.add(add);
                }
        }}return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        
        int[] arr = new int[N];

        for(int i=0;i<N;i++){
            arr[i] = sc.nextInt();
        }

        System.out.println(dfs(arr, K));
    }
    public static class StrCnt{
        int[] arr;
        int count;
        public StrCnt(int[] arr, int count){
            this.arr = arr;
            this.count = count;
        }
    }
}

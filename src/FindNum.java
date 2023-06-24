import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;

public class FindNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        HashSet<Integer> arr = new HashSet<>(n); //ArrayList에서 검색이 빠른 HashSet로 수정
        for(int i=0;i<n;i++){
            arr.add(sc.nextInt());
        }
        int m = sc.nextInt();


        for(int i=0;i<m;i++){
            if (arr.contains(sc.nextInt())) System.out.println(1);
            else System.out.println(0);
        }
    }
}

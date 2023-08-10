import java.util.LinkedList;
import java.util.Scanner;

public class P1158_Josephus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();

        LinkedList<Integer> queue = new LinkedList<>();

        for(int i = 1 ; i <= N ; i++)
            queue.add(i);

        int count =1;

        System.out.print("<");
        while(queue.size()!=1) {
            for(int i = 0 ; i < K-1 ; i++) {
                queue.offer(queue.poll());
                }System.out.print(queue.poll()+", ");
            }
        System.out.print(queue.poll());
        System.out.print(">");
    }
}

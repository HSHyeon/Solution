import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Card {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        Queue<Integer> cardque = new LinkedList<>();

        for(int i=1;i<= N ;i++){
            cardque.add(i);
        }

        while(cardque.size()>1){
            cardque.poll();
            cardque.add(cardque.poll());
        }

        System.out.println(cardque.poll());
    }
}

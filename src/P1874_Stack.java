import java.util.Scanner;
import java.util.Stack;

public class P1874_Stack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int temp;

        Stack<Integer> stack = new Stack<>();
        Stack<String> answer = new Stack<>();
        int[] arr = new int[N+1];
        Stack<Integer> check = new Stack<>();

        for(int i=1;i<=N;i++) {
            arr[i] = sc.nextInt();
            check.add(N - i + 1);
        }
        while(!check.isEmpty())
            for(int i=1;i<=N;i++)
             {
                 if (arr[i] == stack.peek()) {
                    stack.pop();
                    answer.push("-");

                } else if (check.peek() <= arr[i]) {
                    stack.push(check.pop());
                    answer.push("+");
                } else {
                    answer.clear();
                    break;

                }
            }

        if(answer.isEmpty()) System.out.println("NO");
        else for(String ans:answer) System.out.println(ans);

    }
}

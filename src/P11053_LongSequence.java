import java.util.Scanner;

public class P11053_LongSequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int[] arr = new int[A+1];
        int[] D = new int[A+1];
        int last=0;
        int count =0;

        for(int i=0;i<A;i++)
            arr[i] = sc.nextInt();

        for(int i=0;i<A;i++){
            if(arr[i] > last) {
                last = arr[i];
                count++;
            }
        }

        System.out.print(count);
    }
}

import java.util.Scanner;

public class P2839_SugarDelivery {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int count =0;

        while(N!=0){
            if( N % 5 ==0){
                count= count + N/5;
                N = 0;
            }
            else {
                N = N - 3;
                count ++;
            }
            if(N<3 && N>0){
                count = -1;
                break;
            }
        }
        System.out.println(count);

    }
}

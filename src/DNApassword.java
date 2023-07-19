import java.util.Scanner;

public class DNApassword {
    static int[] check = new int[4];
    static int[] min = new int[4];

    static  void Getpass(char c){
        switch (c){
            case 'A':
                check[0]++;
                break;
            case 'C':
                check[1]++;
                break;
            case 'G':
                check[2]++;
                break;
            case 'T':
                check[3]++;
                break;
        }
    }
    static  void Getpas(char c){
        switch (c){
            case 'A':
                check[0]--;
                break;
            case 'C':
                check[1]--;
                break;
            case 'G':
                check[2]--;
                break;
            case 'T':
                check[3]--;
                break;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        int count = 0;


        char[] arr = new char[N];
        arr =  sc.next().toCharArray();

        for(int i=0;i<4;i++){
            min[i] = sc.nextInt();
            check[i] = 0;
        }


        for(int i=0;i<N;i++){
            if(i-M>=0){
                Getpas(arr[i-M]);
            }
            Getpass(arr[i]);

            if( i>=M-1 &&check[0] >= min[0] && check[1] >= min[1] && check[2] >= min[2] && check[3] >= min[3]) {
                count++;
            }
        }
        System.out.println(count);

    }
}

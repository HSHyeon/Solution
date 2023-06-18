import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Opt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        int count=1;
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        int size = sc.nextInt();
        int[] arr = new int[size];

        //3.입력된 이름을 배열에 순서에 맞게 저장

        for(int i=0; i<size; i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        for(int i=0;i<size-1;i++){
            if(arr[i]==arr[i+1]) {
                count++;
                if(i==size-2) if(count>1) list.add(count);
            }
            else {
                if(count>1) list.add(count);
                count = 1;
            }
        }
        if(!list.isEmpty()){
            System.out.println(list);
        }else System.out.println(-1);
    }
}
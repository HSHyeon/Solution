import java.awt.*;
import java.util.*;

public class WordSort {

    public static void sortArr(String[] arr) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j > 0; j--)
                if (arr[j].length() < arr[j - 1].length()) {
                    String a = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = a;
                } else break;
        }


        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) System.out.println(arr[i]);
            else if (!Objects.equals(arr[i], arr[i + 1])) System.out.println(arr[i]);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<String> arr = new ArrayList<>(n);

        for(int i=0;i<n;i++){
            String par = sc.next();
        //    if(!arr.contains(par))
                arr.add(par);
        }
        Collections.sort(arr);

       sortArr(arr.toArray(new String[n]));

    }
}

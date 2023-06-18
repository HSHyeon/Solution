import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.TreeMap;

public class Main2 {
    public static void main(String[] args) {
        // Press Opt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.

        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();

        TreeMap<Integer,Integer> map = new TreeMap<>();

        //3.입력된 이름을 배열에 순서에 맞게 저장

        for(int i=0; i<size; i++){
            int value = sc.nextInt();
            if(map.get(value)!=null) {
                map.put(value,map.get(value)+1 );
            }
            else    map.put(value,1 );
        }

        List<Integer> valueList = new ArrayList<>();
        //   System.out.println(valueList);

        for(int x: map.keySet()){
            if(map.get(x)!=1){
                valueList.add(map.get(x));
            }//else System.out.println(-1);
        }        System.out.print(valueList);
    }
}

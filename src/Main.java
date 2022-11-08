import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println();
    }
    public static double solution(int[] arr){
        LinkedList<Integer> integers = new LinkedList<>();
        Arrays.stream(arr).forEach(integers::add);
        boolean go = true;
        int result = 0;
        while(go){
            for (int i = 0; i < arr.length - 3; i++) {
                if (integers.size() < 4){
                    go = false;
                }
                if (integers.get(i) == 1 && integers.get(i+1) == 2&& integers.get(i+2) == 3&& integers.get(i+3) == 1){
                    result +=1;
                    integers.p
                    break;
                }
            }
            go = false;
        }
        return result;
    }
}

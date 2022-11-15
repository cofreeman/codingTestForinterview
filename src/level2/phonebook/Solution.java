package level2.phonebook;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Objects;

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.solution(new String[]{"123","456","789"}));
    }
    public boolean solution(String[] phone_book) {
        HashMap<String, String> hm = new HashMap<>();
        Arrays.stream(phone_book).forEach(ele -> hm.put(ele, ele));
        for (int i = 0; i < phone_book.length; i++) {
            for (int j = 1; j < phone_book[i].length() + 1; j++) {
                String s = hm.get(phone_book[i].substring(0, j));
                // 해싱한게 자기자신의 값이아니거나 nonnull 이면 return true
                if (Objects.nonNull(s) && !Objects.equals(s,phone_book[i])) return false;
            }
        }
        return true;
    }
}

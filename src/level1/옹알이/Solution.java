package level1.옹알이;

import java.util.Arrays;

public class Solution {
    int result = 0;


    public int solution(String[] babbling) {
        String[] strings = {"aya", "ye", "woo", "ma"};
        for (int i = 0; i < babbling.length; i++) {
            for (String word: strings){
                babbling[i] = babbling[i].replace(word," ");
            }
        }
        for (int i = 0; i < babbling.length; i++) {
            System.out.println(babbling[i]);
        }
        Arrays.stream(babbling).forEach(ele -> {
            ele = ele.replace(" ","");
            if (ele.equals("")){
                result++;
            }
        });
        return result;
    }
}

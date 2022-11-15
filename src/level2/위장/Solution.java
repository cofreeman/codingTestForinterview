package level2.위장;
// https://school.programmers.co.kr/learn/courses/30/lessons/42578
//스트림의 끝
import java.util.Arrays;

import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

public class Solution {

    public int solution(String[][] clothes) {
        return Arrays.stream(clothes)
                .collect(groupingBy(arr -> arr[1], counting()))
                .values()
                .stream()
                .reduce(1L, (a, b) -> a * (b + 1)).intValue() - 1;
    }
}

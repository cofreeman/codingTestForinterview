package level1.poketmon;

import java.util.Arrays;
import java.util.HashSet;

public class Solution {
    public int solution(int[] nums) {
        HashSet<Integer> hs = new HashSet<>();
        Arrays.stream(nums).forEach(hs::add);
        return Math.min(hs.size(), nums.length / 2);
    }
}

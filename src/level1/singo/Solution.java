package level1.singo;

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.solution(new String[]{"muzi", "frodo", "apeach", "neo"},new String[] {"muzi frodo", "apeach frodo", "frodo neo", "muzi neo", "apeach muzi"}, 2));
    }
    public int[] solution(String[] id_list, String[] report, int k) {
        HashSet<String> hashSet = new HashSet<>();
        hashSet.addAll(Arrays.asList(report));
        HashMap<String, Integer> hashMap = new HashMap<>();
        Arrays.stream(id_list).forEach(str -> hashMap.put(str,0));
        hashSet.stream().forEach(str -> hashMap.put(str.split(" ")[1],hashMap.get(str.split(" ")[1]) + 1));
        LinkedHashMap<String, Integer> linkedHashMap = new LinkedHashMap<>();
        Arrays.stream(id_list).forEach(str -> linkedHashMap.put(str,0));
        hashSet.stream().forEach(str -> {
            if (hashMap.get(str.split(" ")[1]) >= k){
                linkedHashMap.put(str.split(" ")[0],linkedHashMap.get(str.split(" ")[0]) + 1);
            }
        });
        return linkedHashMap.values().stream().mapToInt(Integer::intValue).toArray();
    }
}
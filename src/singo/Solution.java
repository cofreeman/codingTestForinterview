package singo;

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.solution(new String[]{"muzi", "frodo", "apeach", "neo"},new String[] {"muzi frodo", "apeach frodo", "frodo neo", "muzi neo", "apeach muzi"}, 2));
    }
    public int[] solution(String[] id_list, String[] report, int k) {
        // 각 아이디마다 신고한거 추려서 "신고한자 신고당한자"의 문자열을 중복이 없게 집어넣는다.
        HashSet<String> hashSet = new HashSet<>();
        hashSet.addAll(Arrays.asList(report));
        //각 이이디:신고당한 횟수의 자료구조를 만든다.
        HashMap<String, Integer> hashMap = new HashMap<>();
        //hashmap 초기화
        Arrays.stream(id_list).forEach(str -> hashMap.put(str,0));
        //아아디:신고당한 횟수 넣기 초기화
        hashSet.stream().forEach(str -> hashMap.put(str.split(" ")[1],hashMap.get(str.split(" ")[1]) + 1));
        //내 아이디: 처리결과를 담을 LinkedHashMap 선언
        LinkedHashMap<String, Integer> linkedHashMap = new LinkedHashMap<>();
        Arrays.stream(id_list).forEach(str -> linkedHashMap.put(str,0));
        // 내가 신고한 아이디가 정지당했는가?
        hashSet.stream().forEach(str -> {
            if (hashMap.get(str.split(" ")[1]) >= k){
                linkedHashMap.put(str.split(" ")[0],linkedHashMap.get(str.split(" ")[0]) + 1);
            }
        });
        //신고처리결과횟수를 반환한 배열 선언
        return linkedHashMap.values().stream().mapToInt(Integer::intValue).toArray();
    }
}
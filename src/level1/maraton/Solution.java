package level1.maraton;

import java.util.HashMap;

public class Solution {
    public String solution(String[] participant, String[] completion) {
        HashMap<String, Integer> hashMap = new HashMap<String, Integer>();
        for (String part : participant) hashMap.put(part, hashMap.getOrDefault(part, 0) + 1);
        for (String comp : completion) hashMap.put(comp, hashMap.get(comp) - 1);
        return hashMap.keySet().parallelStream().filter(key -> hashMap.get(key) == 1).findAny().get();
    }
}

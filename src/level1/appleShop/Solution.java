package level1.appleShop;

import java.util.Arrays;

class Solution {
    // k 사과 품질 범위 최대값 m = 사과박스 포장단위, score 사과 점수 배열
    int result = 0;
    public int solution(int k, int m, int[] score) {

        int appleAmount = score.length;
        int[] ints = Arrays.stream(score).sorted().toArray();
        if (ints.length < m) return 0;
        for (int i = 0; i < score.length / m; i++) {
            result += ints[appleAmount % m + m * i] * m;
        }
        return result;
    }
}

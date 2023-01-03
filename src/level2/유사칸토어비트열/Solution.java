package level2.유사칸토어비트열;

import static java.lang.Math.pow;

public class Solution {
    public int solution(int n, long l, long r) {
        int result;
        result = get1ByReculsion(n,r) - get1ByReculsion(n,l);
        return result;
    }

    private int get1ByReculsion(int n, long r) {
        int pow = (int) pow(5, n);
        if (n == 1){
            return
        }

        return get1ByReculsion(n - 1, r % ) + ;
    }


}

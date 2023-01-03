package inflearn.string.문자찾기;

import java.util.Scanner;

public class Main {
    public int solution(String str, char t) {
        int answer = 0;
        char lowerChar = Character.toLowerCase(t);
        char upperChar = Character.toUpperCase(t);
        return (int) str.chars().parallel().filter(c -> c == lowerChar || c == upperChar)
                .count();
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        char c = kb.next().charAt(0);

        System.out.print(T.solution(str, c));
    }
}

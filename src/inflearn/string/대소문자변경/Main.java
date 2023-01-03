package inflearn.string.대소문자변경;

import java.util.Scanner;

public class Main {
    public String solution(String str) {
        return str.chars().map(
                        s -> Character.isUpperCase(s) ? Character.toLowerCase(s) : Character.toUpperCase((s))
                ).collect(StringBuilder::new,
                        StringBuilder::appendCodePoint,
                        StringBuilder::append)
                .toString();
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();

        System.out.print(T.solution(str));
    }
}

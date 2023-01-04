package inflearn.string.문장속단어;

import java.util.Scanner;

public class Main {
    public String solution(String str) {
        String[] stringArray = str.split(" ");
        String result = "";
        int max = 0;
        for (String s :
                stringArray) {
            if (s.length() > max) {
                result = s;
                max = s.length();
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        String str = kb.nextLine();

        System.out.print(T.solution(str));
    }
}

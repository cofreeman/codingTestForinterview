package level3.베스트앨범;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static java.util.Comparator.*;
import static java.util.stream.Collectors.*;

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.solution(new String[]{"classic", "pop", "classic", "classic", "pop"}, new int[]{500, 600, 150, 800, 2500});
    }

    public class Music implements Comparable<Music> {
        String genre;
        int play;
        int idx;

        public Music(String genre, int play, int idx) {
            this.genre = genre;
            this.play = play;
            this.idx = idx;
        }

        public int getPlay() {
            return play;
        }

        public String getGenre() {
            return genre;
        }

        public int getIdx() {
            return idx;
        }

        @Override
        public int compareTo(Music o) {
            return this.play - o.play;
        }
    }

    public int[] solution(String[] genres, int[] plays) {
        return IntStream.range(0, genres.length)
                .mapToObj(i -> new Music(genres[i], plays[i], i))//  Music 인스턴스들을 생성한다.
                .collect(groupingBy(Music::getGenre))// 장르에 따라 분류한다.
                .entrySet().stream()// 분류한 것을 스트림으로 만든다.
                .sorted(Comparator.comparingInt(Solution::getPlay).reversed())
                .flatMap(x -> x.getValue().stream().sorted().limit(2))
                .mapToInt(Music::getIdx).toArray();
    }

    private static Integer getPlay(Map.Entry<String, List<Music>> s) {
        return s.getValue().stream().map(Music::getPlay).reduce(0, (i,j) -> i + j);
    }
}

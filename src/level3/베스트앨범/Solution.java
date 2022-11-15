package level3.베스트앨범;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.groupingBy;

public class Solution {
    class Music{
        String genre;
        int idx;
        int play;

        public Music(String genre, int idx, int play) {
            this.genre = genre;
            this.idx = idx;
            this.play = play;
        }
    }
    public int[] solution(String[] genres, int[] plays) {
        int SONG_AMOUNT = genres.length;
        ArrayList<Music> arrayList = new ArrayList<>();
        for (int i = 0; i < SONG_AMOUNT; i++) {
            arrayList.add(new Music(genres[i],plays[i],i));
        }
        Map<String, List<Music>> collect = arrayList.stream().collect(groupingBy(music -> music.genre));
        collect.entrySet().stream().reduce((a,b) -> a.)
    }
}

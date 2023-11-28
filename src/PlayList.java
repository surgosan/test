import java.util.ArrayList;
import java.util.Random;

public class PlayList {
    private final ArrayList<String> myPlayList;

    public PlayList() {
        myPlayList = new ArrayList<>();
    }
    public void addToPlayList(String songName) {
        myPlayList.add(songName);
    }

    public static ArrayList<String> numShuffle(ArrayList<String> playList, int shuffles) {
        Random r = new Random();
        int songOneIndex = r.nextInt(playList.size());
        int songTwoIndex = r.nextInt(playList.size());
        for(int i = 0; i < shuffles; i++) {
            String songOne = playList.get(songOneIndex);
            String songTwo = playList.get(songTwoIndex);

            playList.set(songTwoIndex, songOne);
            playList.set(songOneIndex, songTwo);

            songOneIndex = r.nextInt(playList.size());
            songTwoIndex = r.nextInt(playList.size());
        }
        return playList;
    }

    public String toString() {
        String output = "";
        for (String song: myPlayList) {
            output = String.format("%s%n%s", output, song);
        }
        return output;
    }
}

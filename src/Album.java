import java.util.ArrayList;
import java.util.LinkedList;

public class Album {

    private String name;
    private String artist;

    private ArrayList<Song> listOfSongs;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.listOfSongs = new ArrayList<Song>();
    }

    public void addSong(Song newSong) {
        listOfSongs.add(newSong);
    }

    public void removeSong(Song songToRemove){
        listOfSongs.remove(songToRemove);
    }

    public ArrayList<Song> getListOfSongs() {
        return listOfSongs;
    }

    public void setListOfSongs(ArrayList<Song> listOfSongs) {
        this.listOfSongs = listOfSongs;
    }

    private Song findSong(String title){
            for(Song checkedSong: this.listOfSongs){
                if(checkedSong.getTitle().equals(title)){
                    return checkedSong;
                }
            }
            return null;
    }

    public boolean addSongToPlayList(Song song, LinkedList<Song> playList) {
        playList.add(song);
        return true;
    }
}

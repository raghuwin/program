import java.util.*;

public class PlayList {
    private ArrayList<Album> listOfSongs = new ArrayList<Album>();

    public ArrayList getListOfSongs() {
        return listOfSongs;
    }

    public void setListOfSongs(ArrayList listOfSongs) {
        this.listOfSongs = listOfSongs;
    }

    public void play(LinkedList<Song> playList) {
        ListIterator<Song> iterator = playList.listIterator();
        System.out.println("Playing : "+iterator.next().getTitle());
        Scanner scan = new Scanner(System.in);
        boolean quite = false;
        while (!quite){
            int action = scan.nextInt();
            switch (action) {
                case 0:
                    quite = true;
                    break;
                case 1:
                    System.out.println("Playing somg:"+iterator.next().getTitle());
                    break;
                case 2:
                    System.out.println("Playing somg:"+iterator.previous().getTitle());
                    break;
            }
        }
    }

    public void playNextSong(LinkedList<Song> playList) {
        ListIterator<Song> iterator = playList.listIterator();
        System.out.println("Playing : "+iterator.next().getTitle());
    }

    public void playPreviousSong(LinkedList<Song> playList) {
        ListIterator<Song> iterator = playList.listIterator();
        System.out.println("Playing : "+iterator.previous().getTitle());
    }

    public void rePlay() {
        System.out.println("Re play");
    }

    public static void main(String arg[]){
        PlayList playList1 = new PlayList();
        Album album = new Album("Raja","Elaiyaraja");
        Song song = new Song("manguile","30ms");
        Song song1 = new Song("Idiyam","30ms");
        Song song2 = new Song("Unna Nenichen","30ms");
        album.addSong(song);
        album.addSong(song1);
        album.addSong(song2);
        playList1.getListOfSongs().add(album);
        Album album1 = new Album("AR Rahman","AR Rahman");
        Song song3 = new Song("pete rob","30ms");
        Song song4 = new Song("urvasi","30ms");
        Song song5 = new Song("Ellai","30ms");
        album1.addSong(song3);
        album1.addSong(song4);
        album1.addSong(song5);
        playList1.getListOfSongs().add(album1);

        LinkedList<Song> playList = new LinkedList<Song>();
        album.addSongToPlayList(song,playList);
        album.addSongToPlayList(song1,playList);
        album.addSongToPlayList(song2,playList);
        album.addSongToPlayList(song3,playList);
        album.addSongToPlayList(song4,playList);
        album.addSongToPlayList(song5,playList);

        playList1.play(playList);
       // playList1.playNextSong(playList);
        //playList1.playPreviousSong(playList);
    }
}

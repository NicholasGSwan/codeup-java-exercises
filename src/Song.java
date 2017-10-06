public class Song {
    private String songTitle;
    private String artist;
    private int durationInSeconds;
    public Song(String title,String artist, int duration){
        this.songTitle = title;
        this.artist = artist;
        this.durationInSeconds = duration;

    }

    public int getDurationInSeconds() {
        return durationInSeconds;
    }

    public String getArtist() {
        return artist;
    }

    public String getSongTitle() {
        return songTitle;
    }
}

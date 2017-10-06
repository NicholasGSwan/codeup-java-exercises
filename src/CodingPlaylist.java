import util.FileHandler;
import util.Input;

import java.util.ArrayList;
import java.util.List;

public class CodingPlaylist {
    public static void main(String[] args){
        Input input = new Input();
        FileHandler fH = new FileHandler("Playlists", "coding_playlist.txt");
        fH.createFile();
        List<Song> songList = convertArrayToSongList(fH.getFileContents());

        System.out.println("Welcome to Playlist Manager!");
        mainMenu(input, songList, fH);


    }
    //Feature/methods

    //Main Menu method
    public static void mainMenu(Input input, List<Song> songList, FileHandler fH){
        System.out.println("1. View playlist");
        System.out.println("2. Add song");
        System.out.println("3. Remove song");
        System.out.println("4. Shuffle playlist");
        System.out.println("5. Sort list by duration");
        System.out.println("6. Filter by artist");
        System.out.println("7. Exit");
        int menuChoice = input.getInt(1, 7, "Enter your choice! (1-7)");
        switch(menuChoice) {
            case 1:/*Print the whole playlist*/
                printAllSongs(songList);
                break;
            case 2:/*Add song to the playlist*/
                addSong(input, songList);
                break;
            case 3:/*Remove a song from the playlist*/
                break;
            case 4:/*Shuffle playlist*/
                break;
            case 5:/*sort list by duration*/
                break;
            case 6:/*Filter by artist*/
                break;
            case 7:/*Exit (write to file as well)*/
                fH.writeFile(convertSongListToCSV(songList));
                System.exit(0);
                break;
        }
        mainMenu(input, songList, fH);
    }
    public static List<Song> convertArrayToSongList(List<String> SongTxtArray){
        List<Song> listToReturn = new ArrayList<>();
        for(String songInfo: SongTxtArray){
            String[] songSplitArray = songInfo.split(", ");
            Song newSong = new Song(songSplitArray[0], songSplitArray[1], Integer.valueOf(songSplitArray[2]));
            listToReturn.add(newSong);
        }
        return listToReturn;
    }
    //view playlist
    public static void printAllSongs(List<Song> songList){
        System.out.println("Song      | Artist       |Duration\n------------------------------------------");
        for(Song song: songList){
            System.out.println(printSingleSong(song));
        }
    }
    public static String printSingleSong(Song song){
        String durationString = convertSecondsToStringDuration(song.getDurationInSeconds());
        return song.getSongTitle()+"  |  "+song.getArtist()+"  |  "+durationString;
    }

    /*Returns a string formatted for minutes:seconds when given total seconds*/
    public static String convertSecondsToStringDuration(int durationSeconds){
        int minutes = durationSeconds/60;
        int seconds = durationSeconds%60;
        String returnString = String.format("%1d"+":"+"%02d", minutes, seconds);
        return returnString;
    }
    //add song
    public static void addSong(Input input, List<Song> songList){
        songList.add(new Song(input.getString("What is the title?"),input.getString("What is the artist's name/band name"),convertStringDurationToSeconds(input.getString("How long is this song in \"min:sec\" format?"))));
    }
    public static int convertStringDurationToSeconds(String duration){
        int minutes = Integer.valueOf(duration.split(":")[0]);
        int seconds = Integer.valueOf(duration.split(":")[1]);
        return (minutes*60)+seconds;
    }
    //remove song
    //shuffle playlist
    //sort list by duration
    //filter by artist
    //exit
    public static List<String> convertSongListToCSV(List<Song> songList){
        List<String> listToReturn = new ArrayList<>();
        for (Song song: songList){
            listToReturn.add(song.getSongTitle()+", "+song.getArtist()+", "+song.getDurationInSeconds());
        }
        return listToReturn;
    }
}

package no.ntnu.simonhou.musicplayercontent;

public class Song {

  private String songName; //Maybe get name from file or just add manually.
  private String artistName; //Same as above.
  private String songGenre; //Done manually, might also have multiple genres per song.
  private String fileName; //Filename / location.
  private int songLength; //May need to change datatype. Might have to get length from file?

  public Song(String songName, String artistName, String songGenre, String fileName,
      int songLength) {
    this.songName = songName;
    this.artistName = artistName;
    this.songGenre = songGenre;
    this.fileName = fileName;
    this.songLength = songLength;
  }

  public String getSongName() {
    return songName;
  }

  public void setSongName(String songName) {
    this.songName = songName;
  }

  public String getArtistName() {
    return artistName;
  }

  public void setArtistName(String artistName) {
    this.artistName = artistName;
  }

  public String getSongGenre() {
    return songGenre;
  }

  public void setSongGenre(String songGenre) {
    this.songGenre = songGenre;
  }

  public String getFileName() {
    return fileName;
  }

  public void setFileName(String fileName) {
    this.fileName = fileName;
  }

  public int getSongLength() {
    return songLength;
  }

  public void setSongLength(int songLength) {
    this.songLength = songLength;
  }

}

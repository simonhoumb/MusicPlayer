package no.ntnu.simonhou.musicplayercontent;

import java.util.HashMap;

public enum SongGenre {

  ROCK("rock");

  private final String label;

  private static final HashMap<String, SongGenre> BY_LABEL = new HashMap<>();

  static
  {
    for (SongGenre genre : values())
    {
      BY_LABEL.put(genre.label, genre);
    }
  }

  SongGenre(String label)
  {
    this.label = label;
  }

  public static SongGenre valueOfLabel(String label)
  {
    return BY_LABEL.get(label);
  }


  public String getLabel()
  {
    return label;
  }

}

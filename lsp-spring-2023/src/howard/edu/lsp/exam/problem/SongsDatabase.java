package howard.edu.lsp.exam.problem;

import java.util.*;

public class SongsDatabase {
    private Map<String, Set<String>> database;

    public SongsDatabase() {
        database = new HashMap<>();
    }
    public void addSong(String genre, String song) {
        if (!database.containsKey(genre)) {
            database.put(genre, new HashSet<String>());
        }
        database.get(genre).add(song);
    }

    public Set<String> getSongsByGenre(String genre) {
        if (database.containsKey(genre)) {
            return database.get(genre);
        } else {
            return new HashSet<String>();
        }
    }
	
    public void removeSong(String genre, String song) {
        if (!database.containsKey(genre)) {
            // genre does not exist, so nothing to remove
            return;
        }

        HashSet<String> songSet = (HashSet<String>) database.get(genre);
        if (songSet.contains(song)) {
            songSet.remove(song);
        }
    }	
    public boolean containsGenre(String genre) {
        return database.containsKey(genre);
    }

    public boolean containsSong(String genre, String song) {
        if (!database.containsKey(genre)) {
            // genre does not exist, so song cannot exist
            return false;
        }

        HashSet<String> songSet = (HashSet<String>) database.get(genre);
        return songSet.contains(song);
    }
    
    public void clear() {
        database.clear();
    }


}
  


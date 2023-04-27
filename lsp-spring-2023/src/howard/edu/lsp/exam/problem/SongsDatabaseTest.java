package howard.edu.lsp.exam.problem;

import static org.junit.Assert.*;
import org.junit.*;

public class SongsDatabaseTest {
    private SongsDatabase database;

    @Before
    public void setUp() {
        database = new SongsDatabase();
    }

    @Test
    public void testAddSong() {
        database.addSong("Pop", "Bad Guy");
        assertTrue(database.containsGenre("Pop"));
        assertTrue(database.containsSong("Pop", "Bad Guy"));
    }

    @Test
    public void testGetSongsByGenre() {
        database.addSong("Rock", "Stairway to Heaven");
        database.addSong("Rock", "Country Boy");
        database.addSong("Pop", "As Long as you love me");

        assertEquals(2, database.getSongsByGenre("Rock").size());
        assertTrue(database.getSongsByGenre("Rock").contains("Stairway to Heaven"));
        assertTrue(database.getSongsByGenre("Rock").contains("Country Boy"));

        assertEquals(1, database.getSongsByGenre("Pop").size());
        assertTrue(database.getSongsByGenre("Pop").contains("As Long as you love me"));
    }

    @Test
    public void testRemoveSong() {
        database.addSong("Rock", "Stairway to Heaven");
        database.removeSong("Rock", "Stairway to Heaven");

        assertFalse(database.containsSong("Rock", "Country Boy"));
    }

    @Test
    public void testContainsGenre() {
        database.addSong("Jazz", "Take Five");

        assertTrue(database.containsGenre("Jazz"));
        assertFalse(database.containsGenre("Classical"));
    }

    @Test
    public void testContainsSong() {
        database.addSong("Pop", "Bad Guy");

        assertTrue(database.containsSong("Pop", "Bad Guy"));
        assertFalse(database.containsSong("Pop", "Old Town Road"));
    }

    @Test
    public void testClear() {
        database.addSong("Pop", "As Long as you love me");
        database.addSong("Rock", "Country Boy");

        database.clear();

        assertEquals(0, database.getSongsByGenre("Pop").size());
        assertEquals(0, database.getSongsByGenre("Rock").size());
    }
}


package org.howard.edu.lsp.oopfinal.question1;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.Set;

public class SongsDatabaseTest {
    private SongsDatabase db;

    @BeforeEach
    void setUp() {
        db = new SongsDatabase();
        db.addSong("Rap", "Savage");
        db.addSong("Rap", "Gin and Juice");
        db.addSong("Country", "Sweet Alabama");
        db.addSong("Jazz", "Always There");
    }

    @Test
    void testAddSong() {
        db.addSong("Pop", "Bad Romance");
        assertTrue(db.getSongs("Pop").contains("Bad Romance"));
    }

    @Test
    void testGetGenreOfSong() {
        assertEquals("Rap", db.getGenreOfSong("Savage"));
        assertEquals("Jazz", db.getGenreOfSong("Always There"));
        assertNull(db.getGenreOfSong("Unchained Melody")); // Test with a song not in any genre
    }

    @Test
    void testGetSongs() {
        Set<String> rapSongs = db.getSongs("Rap");
        assertTrue(rapSongs.contains("Savage"));
        assertTrue(rapSongs.contains("Gin and Juice"));
        assertEquals(2, rapSongs.size());
    }
}
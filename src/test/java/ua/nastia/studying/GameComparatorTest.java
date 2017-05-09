package ua.nastia.studying;

import org.junit.Test;

import java.text.SimpleDateFormat;
import java.util.Date;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GameComparatorTest {

    @Test
    public void compareTo() throws Exception {

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/mm/yyyy");
        Date date = simpleDateFormat.parse("11/09/2017");
        Game game = mock(Game.class);
        when(game.getCountPlayers()).thenReturn(10);
        when(game.getGameName()).thenReturn("myGame");
        when(game.getCreatedDate()).thenReturn(date);

        Game game1 = mock(Game.class);
        when(game.getCountPlayers()).thenReturn(10);
        when(game1.getGameName()).thenReturn("notmyGame");
        when(game.getCreatedDate()).thenReturn(date);

        GameComparator comparatorTest = new GameComparator();

        assertNotEquals(0, comparatorTest.compareTo(game, game1));
    }

    @Test
    public void compareTo1() throws Exception {

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/mm/yyyy");
        Date date = simpleDateFormat.parse("11/09/2017");
        Game game = mock(Game.class);
        when(game.getCountPlayers()).thenReturn(10);
        when(game.getGameName()).thenReturn("myGame");
        when(game.getCreatedDate()).thenReturn(date);

        Game game1 = mock(Game.class);
        when(game1.getCountPlayers()).thenReturn(10);
        when(game1.getGameName()).thenReturn("myGame");
        when(game1.getCreatedDate()).thenReturn(date);

        GameComparator comparatorTest = new GameComparator();

        assertEquals(0, comparatorTest.compareTo(game, game1));
    }


}
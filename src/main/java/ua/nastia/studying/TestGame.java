package ua.nastia.studying;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestGame {

    public static void main(String... args) throws ParseException {

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        GameComparator comparator = new GameComparator();
        Date date = dateFormat.parse("01/01/2017");
        Date date1 = dateFormat.parse("07/05/2017");
        System.out.println("Expected game date = " + dateFormat.format(date));
        Game game = new Game(10, "myGame", date);
        Game game1 = new Game(100, "myNewGame", date1);
        System.out.println("Games are equal ? "+ comparator.compareTo(game, game1));

        date.setTime(System.currentTimeMillis());

        System.out.println("Game date after changing source variable = " + dateFormat.format(game.getCreatedDate()));

        Date createdDate = game.getCreatedDate();
        createdDate.setTime(System.currentTimeMillis());

        System.out.println("Game date after changing outside variable = " + dateFormat.format(game.getCreatedDate()));

    }

}
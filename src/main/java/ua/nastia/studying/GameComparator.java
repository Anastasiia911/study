package ua.nastia.studying;

import org.apache.commons.lang.builder.CompareToBuilder;

public class GameComparator {

    // Option1 build comparator based on fields you need apache builder
    public int compareTo(Game game1, Game game2) {
        return new CompareToBuilder()
                .append(game1.getCreatedDate(), game2.getCreatedDate())
                .append(game1.getCountPlayers(), game2.getCountPlayers())
                .append(game1.getGameName(), game2.getGameName())
                .toComparison();
    }
    //Option 2 create list of comparators and chaining them

}

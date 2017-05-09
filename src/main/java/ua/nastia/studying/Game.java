package ua.nastia.studying;

import java.util.Date;

// Make this class immutable
class Game {
    private final int countPlayers;
    private final String gameName;
    private final Date createdDate;


    protected Game(int countPlayers, String gameName, Date createdDate) {
        this.countPlayers = countPlayers;
        this.gameName = gameName;
        this.createdDate = (Date) createdDate.clone();
    }

    public int getCountPlayers() {
        return countPlayers;
    }

    public String getGameName() {
        return gameName;
    }

    public Date getCreatedDate() {
        return (Date) createdDate.clone();
    }


}
package pl.sda.rafal.zientara.rockpaperscissors.players;

import pl.sda.rafal.zientara.rockpaperscissors.GameAction;

public class StonedPlayer extends Player {

    public StonedPlayer(String nick) {
        super(nick);
    }

    @Override
    public GameAction getAction() {
        return GameAction.ROCK;
    }
}

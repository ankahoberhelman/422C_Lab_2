package mastermind;

import core.Configuration;
import core.GameRules;
import core.TurnResult;

public class MastermindRules extends GameRules{
    @Override 
    public boolean isValidGuess(String input, Configuration config) {
        return false;
    }
    @Override 
    public TurnResult evaluateGuess(String guess, String secret, Configuration config) {
        TurnResult b = new TurnResult();
        return b;

    }
    @Override 
    public boolean isWinCondition(TurnResult result, Configuration config) {
        return false;
    }

}

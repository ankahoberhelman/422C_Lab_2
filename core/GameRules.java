package core;

public class GameRules {
    public boolean isValidGuess(String input, Configuration config) {
        return false;
    }

    public TurnResult evaluateGuess(String guess, String secret, Configuration config) {
        return new TurnResult();
    }

    public boolean isWinCondition(TurnResult result, Configuration config) {
        return false;
    }

    String generateSecret(Configuration config, boolean isTestMode) {
        String c = "5";
        return c;
    }
}

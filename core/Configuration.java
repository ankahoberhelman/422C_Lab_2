package core;
import java.util.Set;


public class Configuration {
    int maxGuess;
    Set<String> Colors;
    int pegCount;

    public Configuration(int maxGuess, int pegCount, Set<String> Colors) {


    }

    public static Configuration createDefaultMastermindConfig() {
        return new Configuration(12, 4, Set.of("B", "G", "O", "P", "R", "Y"));

    }

    public char[] CodeGenerator(char[] code, int numPegs) {
        return code;

    }
    
    public int SetNumGuesses(int guesses) {
        return -1;
    }

    public int getNumGuesses() {
        return maxGuess;
    }

    public char[] SetColorPegs(char[] code) {
        return code;
    }

}

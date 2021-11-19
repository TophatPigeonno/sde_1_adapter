package com.hz;
import java.util.*;

public class BooleanAdapter {
    private ConsoleReader reader;
    private Set<String> answers = Set.of("true", "yes", "oh yeah", "great", "sure", "love to", "of course", "always", "never done otherwise");

    /**
     * @param reader ConsoleReader
     */
    public BooleanAdapter(ConsoleReader reader) {
        this.reader = reader;
    }

    /**
     * Gets the input
     * @return true if the input corresponds to the accepted values
     */
    public Boolean readInput() {
        String input = reader.readLine();
        return answers.contains(input);
    }
}
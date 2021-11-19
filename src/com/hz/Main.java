package com.hz;

import java.awt.geom.NoninvertibleTransformException;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
	// write your code here

        ConsoleReader reader = new ConsoleReader();
        ConsoleWriter writer = new ConsoleWriter();

        // ask questions
        String q1 = "Do you like eating vegetables?";

        String good = "You healthy person!";
        String bad = "Maybe you should try to eat some carrots";

        // ask question to user
        writer.write(q1);

        // read response
        Boolean ans1 = reader.readLine().equals("Yep");

        //TODO
        // the reader should accept the following values as true:
        // "true", "yes", "oh yeah", "great", "sure", "love to", "of course", "always", "never done otherwise"
        Boolean ans2 = reader.readLine().equals("true");
        Boolean ans3 = reader.readLine().equals("yes");
        Boolean ans4 = reader.readLine().equals("oh yeah");
        Boolean ans5 = reader.readLine().equals("great");
        Boolean ans6 = reader.readLine().equals("sure");
        Boolean ans7 = reader.readLine().equals("love to");
        Boolean ans8 = reader.readLine().equals("of course");
        Boolean ans9 = reader.readLine().equals("always");
        Boolean ans10 = reader.readLine().equals("never done otherwise");


        if (ans1 || ans2 || ans3 || ans4 || ans5 || ans6 || ans7 || ans8 || ans9 || ans10) {
            writer.write(good);
        } else {
            writer.write(bad);
        }

        // allow user to read our response
        reader.readLine();
    }
}

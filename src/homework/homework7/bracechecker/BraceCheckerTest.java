package homework.homework7.bracechecker;

import java.awt.*;

public class BraceCheckerTest {
    public static void main(String[] args) {
        String text = "Hello} (({world]";
        BraceChecker bc = new BraceChecker(text);
        bc.check();

    }
}

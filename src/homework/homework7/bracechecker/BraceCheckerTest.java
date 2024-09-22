package homework.homework7.bracechecker;

import java.awt.*;
import java.util.Scanner;

public class BraceCheckerTest {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        String text = sc.nextLine();

        BraceChecker braceChecker = new BraceChecker(text);

        braceChecker.check();
        sc.close();


    }
}

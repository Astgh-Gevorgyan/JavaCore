package homework;

public class FigurePainter {
    public static void main(String[] args) {
        System.out.println("1");
        for (int i = 0; i < 7; i++) {
            for (int j = 7; j > i; j--) {
                System.out.print("$" + " ");
            }
            System.out.println();
        }

        System.out.println("2");
        for (int a = 0; a < 7; a++) {
            for (int k = 0; k < a; k++) {
                System.out.print("$" + " ");
            }
            System.out.println();
        }

        System.out.println("3");
        for (int i = 7; i > 0; i--) {
            for (int j = 1; j < i; j++) {
                System.out.print("  ");
            }
            for (int j = 8; j > i; j--) {
                System.out.print("$ ");
            }
            System.out.println();
        }

        System.out.println("4");
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("  ");
            }
            for (int j = 7; j > i; j--) {
                System.out.print("$ ");
            }
            System.out.println();


        }
        System.out.println("5");
        for (int i = 6; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 7; j > i; j--) {
                System.out.print(" $");
            }
            System.out.println();
        }
        for (int i = 0; i < 5; i++) {
            for (int j = -2; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 5; j > i; j--) {
                System.out.print(" $");
            }
            System.out.println();
        }

    }

}
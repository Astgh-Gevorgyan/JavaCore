package homework;

public class ForlfExamples {
    public static void main(String[] args) {
        System.out.println("ONE");
        int i;
        for (i = 1; i < 11; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.print("TWO");
        int k = 0;
        for (int b = 1; b < 100; b++) {
            k += b;
        }
        System.out.println(k);

        System.out.println("THRE");
        int a;
        for (a = 50; a > 0; a--) {
            System.out.print(a + " ");
        }
        System.out.println();
        ;
        System.out.println("FOUR");
        int c;
        for (c = 1; c < 20; c += 2) {
            System.out.print(c + " ");
        }
        System.out.println();

        System.out.println("FIVE");
        int S;
        for (S = 2; S < 101; S += 2) {
            System.out.print(S + " ");
        }
        System.out.println();
    }
}

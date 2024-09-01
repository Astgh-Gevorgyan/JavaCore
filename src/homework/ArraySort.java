package homework;

public class ArraySort {
    public static void main(String[] args) {

        int[] array = {1, 9, 3, 56, 7, 12, 49, 24, 4,35};

        for (int x : array) {
            System.out.print(x + " ");
        }
        System.out.println();

        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j < array.length - i; j++) {
                if (array[j] < array[j - 1]) {
                    int a = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = a;
                }

            }

        }
        for (int x : array) {
            System.out.print(x + " ");
        }

    }
}


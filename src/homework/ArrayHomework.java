package homework;

public class ArrayHomework {
    public static void main(String[] args) {
        int[] array = {12, 45, 6, 35, 3, 10, 3, 7, 23, 9, 6, 64, 11,};

        int count = 0;
        int n = 6;
        for (int x : array) {
            if (x == n) {
                count++;
            }
        }
        System.out.println("count :" + " " + count);

        for (int x : array) {
            System.out.print(x + " ");
        }
        System.out.println();
        int[] reversedArray = new int[array.length];
        int j = 0;
        for (int i = array.length - 1; i >= 0; i--) {
            reversedArray[j++] = array[i];
        }
        for (int y : reversedArray) {
            System.out.print(y + " ");
        }

        System.out.println();


        int a = 0;
        for (int i = 0; i < array.length; i++) {
            if (i == array[i]) {
                a++;

            }

        }
        System.out.println("Repeat :" + " " + a);


        char[] chars = {'բ', 'ա', 'ր', 'և', 'ա', 'շ', 'խ', 'ա', 'ր', 'հ'};
        char[] vowels = {'ա', 'ի', 'ե', 'է', 'օ', 'ո', 'ը'};

        int vowelsCount = 0;
        for (int c : chars) {
            for (int v : vowels) {
                if (c == v) {
                    vowelsCount++;
                    break;

                }

            }
        }
        System.out.println("Vowels Count : " + vowelsCount);


    }


}


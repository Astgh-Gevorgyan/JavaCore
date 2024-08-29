package homework;

public class ArrayUtil {
    public static void main(String[] args) {
        int[] numbers = {1, 6, 3, 9, 15, 52, -3, 5, 11};
        System.out.print("length : " + " ");
        System.out.print(numbers.length);
        System.out.println();
        System.out.print("The first number :" + " ");
        System.out.print(numbers[0]);
        System.out.println();
        System.out.print("In the sequence :" + " ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
        System.out.print("the last number : ");
        System.out.print(numbers[numbers.length - 1]);
        System.out.println();
        int min = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }
        System.out.println("MIN :" + " " + min);


        int max = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }

        System.out.println("MAX :" + " " + max);


        if (numbers.length <= 2) {
            System.out.println("CAN`t print middle value");
        } else {
            if (numbers.length % 2 == 0) {
                System.out.print("Middle value" + numbers[numbers.length / 2] + " ");
                System.out.println(numbers[(numbers.length / 2) + 1] + " ");
            } else {
                System.out.println("Middle Value :" + " " + numbers[numbers.length / 2]);
            }
        }
        int a = 0;
        for (int i = 0; i < numbers.length; i++) {
            a += numbers[i];
        }
        System.out.println("SUM :" + " " + a);


        int b = 0;
        for (int i = 0; i < numbers.length; i++) {
            b += numbers[i];
        }
        System.out.println("Arithmetic mean :" + " " + b / numbers.length);


        int c = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                c = numbers[i];
                System.out.print("Couple :" + c + " ");
                System.out.println();
            }
        }
        int s = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 1) {
                s = numbers[i];
                System.out.print(" " + s);
            }
        }
    }

}







  
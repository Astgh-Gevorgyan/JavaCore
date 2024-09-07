package homework.homework7;

public class DynamicArrays {




    private int[] array = new int[10];

    private int size = 0;


    public void add(int value) {
        if (array.length == size) {
            extend();
        } else {
            array[size++] = value;
        }

    }


    public void extend() {
        int[] newArray = new int[array.length + 10];
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];

        }
        array = newArray;
    }


    public int getByIndex(int index) {
        if (index < 0 || index > size) {
            return -1;
        }
        return array[index];
    }



    public void print() {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i] + " ");

        }
    }

}


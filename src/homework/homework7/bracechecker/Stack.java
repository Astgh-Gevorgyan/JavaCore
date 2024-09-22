package homework.homework7.bracechecker;

import classwork.classwork8.extendsAandB.B;

public class Stack {

    private Brace[] array = new Brace[10];
    private int tos;


    public Stack() {

        tos = -1;
    }

    public void push(Brace item) {
        if (tos == 9)
            System.out.println("տեղ չկա");
        else {
            array[++tos] = item;
        }
    }

    public Brace pop() {
        if (tos < 0) {
            return null;
        } else {
            return array[tos--];
        }
    }

    public boolean isEmpty() {
        return tos == -1;
    }
}

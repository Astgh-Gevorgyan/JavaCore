package homework.homework7.bracechecker;

import classwork.classwork4.Stack;

public class BraceChecker {

    private String text;


    public BraceChecker(String text) {
        this.text = text;


    }


    public void check() {
        Stack myStack = new Stack();
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            char last;
            int pop;
            switch (c) {
                case '{':
                case '(':
                case '[':
                    myStack.push(c);
                    break;
                case '}':
                    pop = myStack.pop();
                    if (pop == 0) {

                        System.out.println("Error: Closed " + c + " but not opened at " + i);
                    } else {
                        last = (char) pop;
                        if (last != '{') {
                            System.out.println("Error: Closed " + c + " but opened " + last + " at" + i);
                        }
                    }
                    break;
                case ']':
                    pop = myStack.pop();
                    if (pop == 0) {

                        System.out.println("Error: Closed " + c + " but not opened at " + i);
                    } else {
                        last = (char) pop;
                        if (last != '[') {
                            System.out.println("Error: Closed " + c + " but opened " + last + " at" + i);
                        }
                    }
                    break;
                case ')':
                    pop = myStack.pop();
                    if (pop == 0) {

                        System.out.println("Error: Closed " + c + " but not opened at " + i);
                    } else {
                        last = (char) pop;
                        if (last != '(') {
                            System.out.println("Error: Closed " + c + " but opened " + last + " at" + i);
                        }
                    }
                    break;
            }
        }
        while (!myStack.isEmpty()) {
            System.out.println("Error: Opened " + (char) myStack.pop() + " but not closed. ");
        }
/*
        int last;
        while ((last = myStack.pop()) != 0) {

            System.out.println("Error: Opened " + (char) last + " but not closed. ");
        }
*/


    }
}

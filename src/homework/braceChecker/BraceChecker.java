package homework.braceChecker;

import example.stack.Stack;

public class BraceChecker {

    private String text;


    public BraceChecker(String text) {
        this.text = text;
    }

    public void check() {

        Stack stack = new Stack();
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            char last;
            switch (ch) {
                case '(':
                case '{':
                case '[':
                    stack.push(ch);
                    break;
                case ')':
                    last = stack.pop();
                    if (last == 0) {
                        System.out.println("Error: Closed ) but not opened ");
                    } else if (last != '(') {
                        System.out.println("Error: opened " + last + " but closed ) at " + i);
                    }
                    break;
                case '}':
                    last = stack.pop();
                    if (last == 0) {
                        System.out.println("Error: Closed } but not opened ");
                    } else if (last != '{') {
                        System.out.println("Error: opened " + last + " but closed } at " + i);
                    }
                    break;
                case ']':
                    last = stack.pop();
                    if (last == 0){
                        System.out.println("Error: Closed but ] not opened ");
                    } else if (last != '[') {
                        System.out.println("Error: opened " + last + " but closed ] at " + i);
                    }
                    break;

            }
        }
        char last;
        while ((last = stack.pop()) != 0){
            System.err.println("Error: opened "+ last+" without closing");
        }

    }
}


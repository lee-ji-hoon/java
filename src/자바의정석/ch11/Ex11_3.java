package 자바의정석.ch11;

import java.util.*;

public class Ex11_3 {
    public static void main(String[] args) {
        args = new String[1];
        args[0] = "((2+3)*1)+3";

        Stack st = new Stack();
        String expression = args[0];

        System.out.println("expression:" + expression);

        try {
            for (int i = 0; i < expression.length(); i++) {
                char ch = expression.charAt(i);

                if (ch == '(') {
                    st.push(ch + "");
                } else if (ch == ')') {
                    st.pop();
                }
            }

            if (st.isEmpty()) {
                System.out.println("괄호가 일치합니다.");
            } else {
                System.out.println("괄호가 일치하지 않습니다.");
            }
        } catch (EmptyStackException e) {
            System.out.println("괄호가 일치하지 않습니다.");
        } // try
    }
}

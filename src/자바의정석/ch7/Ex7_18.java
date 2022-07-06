package 자바의정석.ch7;

import java.awt.*;
import java.awt.event.*;

public class Ex7_18 {
    public static void main(String[] args) {
        Button b = new Button("Start");
        b.addActionListener(new EventHandler());
    }
}
// 1회성이기에 익명클래스로 처리하는 경우가 있다.
class EventHandler implements ActionListener {
    public void actionPerformed(ActionEvent e) {
        System.out.println("ActionEvent occurred!!!");
    }
}
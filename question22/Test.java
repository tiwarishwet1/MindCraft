package question22;

import javax.swing.JFrame;

public class Test {

    public static void main(String[] args) {

        JFrame f = new JFrame();

        CirclePanel p = new CirclePanel();

        f.add(p);

        f.setSize(600, 300);
        f.setVisible(true);

        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
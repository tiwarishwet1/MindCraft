package question23;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Test extends JPanel {

    Circle red;
    Circle blue;
    Circle green;

    Test() {

        red = new Circle(50, 8, Color.RED);
        blue = new Circle(120, 5, Color.BLUE);
        green = new Circle(190, 3, Color.GREEN);

        red.start();
        blue.start();
        green.start();

        Thread t = new Thread() {

            public void run() {

                while (true) {

                    if (green.x >= 550) {

                        red.x = 0;
                        blue.x = 0;
                        green.x = 0;
                    }

                    repaint();

                    try {
                        Thread.sleep(50);
                    } catch (Exception e) {
                    }
                }
            }
        };

        t.start();
    }

    public void paint(Graphics g) {

        super.paint(g);

        red.draw(g);
        blue.draw(g);
        green.draw(g);
    }

    public static void main(String[] args) {

        JFrame f = new JFrame();

        Test t = new Test();

        f.add(t);

        f.setSize(650, 300);
        f.setVisible(true);

        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
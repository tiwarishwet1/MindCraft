package question22;

import java.awt.Graphics;
import javax.swing.JPanel;

public class CirclePanel extends JPanel implements Runnable {

    int x = 50;
    int y = 100;
    int speed = 5;

    boolean right = true;

    Thread t;

    CirclePanel() {
        t = new Thread(this);
        t.start();
    }

    public void paint(Graphics g) {

        super.paint(g);

        g.fillOval(x, y, 50, 50);
    }

    public void run() {

        while (true) {

            if (right) {
                x = x + speed;

                if (x >= getWidth() - 50) {
                    right = false;
                }

            } else {
                x = x - speed;

                if (x <= 0) {
                    right = true;
                }
            }

            repaint();

            try {
                Thread.sleep(50);
            } catch (Exception e) {
            }
        }
    }
}
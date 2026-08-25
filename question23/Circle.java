package question23;

import java.awt.Color;
import java.awt.Graphics;

public class Circle extends Thread {

    int x = 0;
    int y;
    int speed;
    Color color;

    Circle(int y, int speed, Color color) {
        this.y = y;
        this.speed = speed;
        this.color = color;
    }

    public void run() {

        while (true) {

            while (x < 550) {
                x = x + speed;

                try {
                    Thread.sleep(50);
                } catch (Exception e) {
                }
            }

            try {
                Thread.sleep(1000);
            } catch (Exception e) {
            }
        }
    }

    void draw(Graphics g) {
        g.setColor(color);
        g.fillOval(x, y, 50, 50);
    }
}
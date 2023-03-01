package com.centraleNantes.poei2.boris.designPatterns.template;

import java.awt.*;
import javax.swing.JFrame;

public class Drawing extends Canvas {

    public void createFrame() {
        JFrame frame = new JFrame("TITRE FENETRE");
        Canvas canvas = new Drawing();
        canvas.setSize(400, 400);
        frame.add(canvas);
        frame.pack();
        frame.setVisible(true);
    }

    @Override
    public final void paint(Graphics g) {
        g.drawString("TITRE ",150, 50);
        g.setColor(Color.BLACK);
        g.fillOval(100, 100, 200, 200);
        g.setColor(Color.RED);
        g.fillRect(20, 20, 50, 50);
        try {
            Thread.sleep(1000);
            g.fillRect(330, 20, 50, 50);
            Thread.sleep(1000);
            g.fillRect(330, 330, 50, 50);
            Thread.sleep(1000);
            g.fillRect(20, 330, 50, 50);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

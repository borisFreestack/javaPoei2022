package com.centraleNantes.poei2.boris.designPatterns.template;

import javax.swing.*;
import java.awt.*;

public abstract class DrawingTemplate extends Canvas {

    public abstract Canvas getCanvas();

    public abstract String getFrameTitle();

    public final void createFrame() {
        JFrame frame = new JFrame(getFrameTitle());
        Canvas canvas = getCanvas();
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

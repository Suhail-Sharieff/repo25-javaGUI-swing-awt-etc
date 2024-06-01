import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

class panel extends JPanel implements ActionListener {

    final int WIDTH = 500;
    final int HEIGHT = 500;
    Image space, cartoon;
    Timer timer;
    int xVelo = 10, yVelo = 10;
    int x = 0, y = 0;

    panel() {
        this.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        this.setBackground(Color.black);
        cartoon = new ImageIcon("cartoon.png").getImage();
        timer = new Timer(1000, this); // Register 'this' as ActionListener
        timer.start(); // Start the timer
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.drawImage(cartoon, x, y, null);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // Update the position of the image
       if (x>=WIDTH-cartoon.getWidth(null)||x<0) {
        xVelo=xVelo*-1;
       }
       x+=xVelo;
       if (y>=HEIGHT-cartoon.getHeight(null)||y<0) {
        yVelo=yVelo*-1;
       }
       y+=yVelo;
        // Repaint the panel to reflect the changes
        repaint();
    }
}

public class animations extends JFrame {

    panel p = new panel();

    animations() {
        this.add(p);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new animations();
    }
}

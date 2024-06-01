import java.awt.*;
import java.awt.event.*;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class keyListener extends JFrame implements KeyListener {

    JPanel panel;

    keyListener() {

        this.addKeyListener(this);// imp
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(600, 600);
        this.setLayout(null);

        panel = new JPanel();
        panel.setBounds(0, 0, 100, 100);
        panel.setBackground(Color.pink);
        panel.addKeyListener(this);


        this.requestFocus();
        this.add(panel);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new keyListener();
    }

    @Override
public void keyTyped(KeyEvent e) {
    // This function is invoked when a key is typed uses key character and outputs character pressed

   
}


    @Override
    public void keyPressed(KeyEvent e) {
        // This function is invoked when a physical key is pressed down it uses key code
        // and Outputs and integer

         // Let's move the panel using arrow keys
    int code = e.getKeyCode();
    switch (code) {
        case KeyEvent.VK_UP:
            panel.setLocation(panel.getX(), panel.getY() - 10);
            break;

        case KeyEvent.VK_DOWN:
            panel.setLocation(panel.getX(), panel.getY() + 10);
            break;

        case KeyEvent.VK_LEFT:
            panel.setLocation(panel.getX() - 10, panel.getY());
            break;

        case KeyEvent.VK_RIGHT:
            panel.setLocation(panel.getX() + 10, panel.getY());
            break;
    }

    }

    @Override
    public void keyReleased(KeyEvent e) {
        // whenever a button is released this function is called
        System.out.println("Released " + e.getKeyChar() + " code: " + e.getKeyCode());
    }

}

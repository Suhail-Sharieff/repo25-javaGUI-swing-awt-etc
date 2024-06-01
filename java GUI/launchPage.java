/**
 * launchPage
 */

import javax.swing.*;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.*;

/**
 * Launch
 */
class NewWindow{
    JFrame frame=new JFrame("NewWindow");
    JLabel l=new JLabel("HI SUHAIL");
    
    
    NewWindow(){
        l.setBounds(10,10,500,260);
        l.setFont(new Font("MV Boli", 20, 40));

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600,600);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.add(l);


    }
}
 class Launch implements ActionListener{
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==btn) {
            frame.dispose();//allows only once
            new NewWindow();
        }
    }

    JFrame frame=new JFrame("Apllet");
    JButton btn=new JButton("CLICK TO OPEN NEW WINDOW");
    Launch(){
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600,600);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.add(btn);

        btn.setBounds(100,160,300,120);
        btn.setBackground(Color.green);
        btn.setForeground(Color.red);
        btn.setFocusable(false);
        btn.addActionListener(this);

    }
    
    
}
public class launchPage {
    //how to open new window 
    public static void main(String[] args) {
        new Launch();
    }
}
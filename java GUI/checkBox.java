import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class checkBox extends JFrame implements ActionListener
{
    JCheckBox ch=new JCheckBox("I'm not ROBOT");
    JButton btn=new JButton("SUBMIT");
    ImageIcon correct=new ImageIcon("correct.png");
    ImageIcon wrong=new ImageIcon("wrong.png");


    checkBox(){
        ch.setFocusable(false);
        ch.setFont(new Font("MV Boli", 20, 35));
        ch.setForeground(Color.green);
        ch.setBackground(Color.black);
        ch.setIcon(wrong);
        ch.setSelectedIcon(correct);

        this.add(ch);this.add(btn);
        btn.addActionListener(this);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(600, 600);
        this.setLayout(new FlowLayout());
        this.pack();
        this.setVisible(true);
        
    }
    public static void main(String[] args) {
        new checkBox();
    }
    @Override
    public void actionPerformed(ActionEvent e) {
       if (e.getSource()==btn) {
        System.out.println(ch.isSelected());
       }
    }
}

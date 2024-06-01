import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class colorChooser extends JFrame implements ActionListener{
    JButton btn=new JButton("Pick Color");
    JLabel label=new JLabel("SUhai;l");

    colorChooser(){

        this.add(label);
        this.add(btn);

        label.setBackground(Color.white);
        label.setOpaque(true);//to display white
        label.setText("Some txt");
        label.setFont(new Font("MV Boli", 20, 40));
        label.setForeground(Color.red);

        btn.addActionListener(this);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());
        this.setSize(600,600);
        this.setVisible(true);
        this.pack();
    }

    public static void main(String[] args) {
        new colorChooser();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==btn) {
            // JColorChooser jc=new JColorChooser();//no nned 
            Color choosed=JColorChooser.showDialog(null, "Pick a color",Color.black);
            System.out.println(choosed);
            label.setForeground(choosed);//sets text color to choosed color
        }
    }
}

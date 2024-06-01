import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.LayoutManager;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class gui2 {
    public static void main(String[] args) {
        JFrame frame=new JFrame("Applet");
        // frame.setLayout(new BorderLayout(10,10));
        // frame.setLayout(new GridLayout());
        frame.setLayout(new FlowLayout(FlowLayout.CENTER));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600,600);
        frame.setVisible(true);


        JPanel panel1=new JPanel();
        panel1.setBackground(Color.RED);
        panel1.setPreferredSize(new Dimension(100, 100));

        JPanel panel2=new JPanel();
        panel2.setBackground(Color.green);
        panel2.setPreferredSize(new Dimension(100, 100));

        JPanel panel3=new JPanel();
        panel3.setBackground(Color.blue);
        panel3.setPreferredSize(new Dimension(100, 100));

        JPanel panel4=new JPanel();
        panel4.setBackground(Color.gray);
        panel4.setPreferredSize(new Dimension(100, 100));
        



        frame.add(panel1,BorderLayout.NORTH);
        frame.add(panel2,BorderLayout.SOUTH);
        frame.add(panel3,BorderLayout.CENTER);
        frame.add(panel4,BorderLayout.WEST);
       
    }
}

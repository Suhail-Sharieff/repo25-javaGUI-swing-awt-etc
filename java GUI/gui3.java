import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;//creates 3d

public class gui3 {
    public static void main(String[] args) {
        JFrame frame=new JFrame("Applet");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600,600);;
        frame.setVisible(true);

         JLabel label1=new JLabel();
         label1.setOpaque(true);
         label1.setBackground(Color.red);
         label1.setBounds(50, 50, 200, 200);;

         JLabel label2=new JLabel();
         label2.setOpaque(true);
         label2.setBackground(Color.GREEN);
         label2.setBounds(100, 100, 200, 200);;

         JLabel label3=new JLabel();
         label3.setOpaque(true);
         label3.setBackground(Color.blue);
         label3.setBounds(150, 150, 200, 200);;


        JLayeredPane lp=new JLayeredPane();
        lp.setBounds(0,0,500,500);
        //want in what index is Integer.valueOf()
        lp.add(label1,Integer.valueOf(0));
        lp.add(label2,Integer.valueOf(1));
        lp.add(label3,Integer.valueOf(2));

        frame.add(lp);
    }
}

/**
 * SuhailSharieff
 */
import java.awt.*;
import java.util.*;
import javax.swing.*;
import javax.swing.border.*;
public class gui {

  public static void main(String[] args) {
    //declaration
    JFrame frame=new JFrame("Applet");
    JLabel label=new JLabel("Label");
    ImageIcon img=new ImageIcon("code.jpg");
    Border border=BorderFactory.createTitledBorder("BORDER");
    //label
    label.setIcon(img);
    label.setText("Can u code?");
    label.setHorizontalTextPosition(JLabel.CENTER);
    label.setVerticalTextPosition(JLabel.TOP);
    label.setFont(new Font("MV Boli", Font.BOLD, 20));
    label.setForeground(Color.GREEN);
    label.setIconTextGap(25);
    label.setOpaque(false);
    label.setHorizontalAlignment(JLabel.CENTER);
    label.setBorder(border);
    //contentPanel
    frame.getContentPane().setBackground(new Color(124,65,67));
    //frame
    frame.setIconImage(img.getImage());
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(600,600);
    frame.setResizable(true);
    frame.setVisible(true);
    frame.add(label);
   
  }
}
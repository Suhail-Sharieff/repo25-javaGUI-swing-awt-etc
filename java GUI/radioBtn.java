import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JRadioButton;

import java.awt.*;
import java.awt.event.*;

public class radioBtn extends JFrame implements ActionListener {
    // In case of radio buttons one or more buttons in a grouping may be present out
    // of which only one may be selected per group
    
    JRadioButton math=new JRadioButton("MATH");
    JRadioButton phy=new JRadioButton("PHYSICS");
    JRadioButton comp=new JRadioButton("CS");

    //to ensure only 1 optn is selected,create btn grp
    ButtonGroup grp=new ButtonGroup();
    


    radioBtn() {
        //to ensure only 1 optn is selected,create btn grp
        grp.add(comp);grp.add(math);grp.add(phy);

        this.add(comp);this.add(math);this.add(phy);
        this.setSize(500, 500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());
        this.pack();
        this.setVisible(true);

    }

    public static void main(String[] args) {
        new radioBtn();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}

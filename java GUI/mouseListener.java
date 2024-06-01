import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class mouseListener extends JFrame  implements MouseListener{
        
     JPanel panel =new JPanel();

    mouseListener(){


        panel.setBounds(0,0,100,100);
        panel.setBackground(Color.red);
        panel.setOpaque(true);


        this.add(panel);
        this.addMouseListener(this);//i hve applied to whole frame itself ,u can apply only to panel
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(600,600);
        this.setLayout(null);
        this.setVisible(true);

        
    }



    public static void main(String[] args) {
        new mouseListener();
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        //Dates invoked whenever user clicks on some component of screen
        System.out.println("u clicked mouse");
    }

    @Override
    public void mousePressed(MouseEvent e) {
        System.out.println("U pressed mouse");
    }

    @Override
    public void mouseReleased(MouseEvent e) {
       System.out.println("U relesed mouse");
    }

    @Override
    public void mouseEntered(MouseEvent e) {
       //Let's say invoke the whenever you're going to move your mouse towards some component in this case it is panel when you place the cursor on a panel  it gets invoked
      System.out.println("U entered frame");
    }

    @Override
    public void mouseExited(MouseEvent e) {
        System.out.println("U exited frame");
    }
}

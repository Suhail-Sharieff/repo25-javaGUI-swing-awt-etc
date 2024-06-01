import java.awt.Color;
import java.awt.event.*;
import javax.swing.*;

class Game{


    JFrame frame=new JFrame("Aplet");
    JPanel panel;
    Action upAction,downAction,leftAction,rightAction;



    Game(){

        panel=new JPanel();
        panel.setBounds(100, 100, 100, 100);
        panel.setBackground(Color.red);
        panel.setOpaque(true);

        upAction=new UpAction();
        downAction=new DownAction();
        leftAction=new LeftAction();
        rightAction=new RightAction();

        
        // for UP arrow
        panel.getInputMap().put(KeyStroke.getKeyStroke("UP"), "upAction");
        panel.getActionMap().put("upAction", upAction);
        // for DOWN arrow
        panel.getInputMap().put(KeyStroke.getKeyStroke("DOWN"), "downAction");
        panel.getActionMap().put("downAction", downAction);
        // for LEFT arrow
        panel.getInputMap().put(KeyStroke.getKeyStroke("LEFT"), "leftAction");
        panel.getActionMap().put("leftAction", leftAction);
        // for RIGHT arrow
        panel.getInputMap().put(KeyStroke.getKeyStroke("RIGHT"), "rightAction");
        panel.getActionMap().put("rightAction", rightAction);



        frame.add(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600,600);
        frame.setLayout(null);
        frame.setVisible(true);
    }

    public class UpAction extends AbstractAction{

        @Override
        public void actionPerformed(ActionEvent e) {
            panel.setLocation(panel.getX(), panel.getY()-10);
        }
        
    }
    public class DownAction extends AbstractAction{

        @Override
        public void actionPerformed(ActionEvent e) {
            panel.setLocation(panel.getX(), panel.getY()+10);

        }
        
    }
    public class LeftAction extends AbstractAction{

        @Override
        public void actionPerformed(ActionEvent e) {
            panel.setLocation(panel.getX()-10, panel.getY());

        }
        
    }
    public class RightAction extends AbstractAction{

        @Override
        public void actionPerformed(ActionEvent e) {
            panel.setLocation(panel.getX()+10, panel.getY());

        }
        
    }

}



public class keyBindings {




    //Key bindings are similar to key listeners but they are more easy to use and almost all spring components are going to use this key bindings itself for example consider two players playing in a single computer so you can assign different keys to each player to play on the same computer so this cannot be done by using the key listeners but the only problem with Key bindings is that they are difficult to set up
    public static void main(String[] args) {
        new Game();
    }
}

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * menuBar
 */
public class menuBar extends JFrame implements ActionListener{
    JMenuBar menu=new JMenuBar();
    JMenu FILE=new JMenu("FILE");
    JMenu EDIT=new JMenu("EDIT");
    JMenu HELP=new JMenu("HELP");
    menuBar(){


       //add main menu
        menu.add(FILE);menu.add(EDIT);menu.add(HELP);
        

        //add menuItms 
        //to add Mneumonics underline shortcut
        // {JmenuItemname}.setMnemonic(KeyEvent.VK_{shortcut key u wnt});
        FILE.add(new JMenuItem("Clear"));
        FILE.add(new JMenuItem("Save"));
        FILE.add(new JMenuItem("Rename"));
        EDIT.add(new JMenuItem("Font settings"));
        EDIT.add(new JMenuItem("Font size"));
        HELP.add(new JMenuItem("Get help from Suhail"));


        this.setJMenuBar(menu);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(600,600);
        this.setLayout(new FlowLayout());
        this.setVisible(true);
    }
    public static void main(String[] args) {
        new menuBar();
    }
    @Override
    public void actionPerformed(ActionEvent e) {
      
    }
}
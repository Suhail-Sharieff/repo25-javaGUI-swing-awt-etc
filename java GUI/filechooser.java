import java.awt.*;
import java.awt.event.*;
import java.io.File;

import javax.swing.*;

public class filechooser extends JFrame implements ActionListener{
    // J file chooser is a gui mechanism that lets a user choose a file helpful for opening saving and deleting a file
    
    JButton btn=new JButton("Choose file to open");
    


    filechooser(){


        btn.addActionListener(this);

        this.add(btn);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());
        this.setSize(600,600);
        this.setVisible(true);
        this.pack();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==btn) {
            //when btn is clicked a dialog box of all files in cmputer will dispaly
            JFileChooser fc=new JFileChooser();
            //to open dialog box to choose:
            int open=fc.showOpenDialog(null);//select file to open,this returns  1 if some file is choosed,0 if cancelled or exited

            //suppose we want to create and save also:
            int save=fc.showSaveDialog(null);
            
            // Suppose we want to print the path of the file that we have opened
            //then one way is to write if(respose==0){},another way is:
            if (open==JFileChooser.APPROVE_OPTION) {
               System.out.println(fc.getSelectedFile().getAbsolutePath());
            }
            if (save==JFileChooser.APPROVE_OPTION) {
               System.out.println(fc.getSelectedFile().getAbsolutePath());
            }
        }
    }
    public static void main(String[] args) {
        new filechooser();
    }
}

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class comboBox extends JFrame implements ActionListener{
    //j combo box is a component that combines a button or an editable field and a **drop down list**

    String arr[]={"India","Canada","China","Saudi"};
    JComboBox<String> listBox=new JComboBox<>(arr);
    //this has methods similar as ArrayList



    comboBox(){

        //to select an item not presnt in list:
        //listBox.setEditable(true);

        listBox.addActionListener(this);

        this.add(listBox);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(600, 600);
        this.setLayout(new FlowLayout());
        this.pack();
        this.setVisible(true);
    }


    public static void main(String[] args) {
        new comboBox(); 
    }


    @Override
    public void actionPerformed(ActionEvent e) {
       if (e.getSource()==listBox) {
       System.out.println(arr[listBox.getSelectedIndex()]);
       }
    }
}

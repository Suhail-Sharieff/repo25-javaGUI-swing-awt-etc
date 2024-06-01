import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

//textfield is used to write something
public class textField extends JFrame implements ActionListener {
    JButton btn = new JButton("SUBMIT");
    JButton clearbtn = new JButton("CLEAR");
    JTextField textField=new JTextField();
    String input;

    textField() {

        textField.setPreferredSize(new Dimension(250,40));
        textField.setFont(new Font("MV Boli", 20, 35));
        textField.setBackground(Color.black);
        textField.setForeground(Color.yellow);

        btn.setBackground(Color.green);
        btn.setForeground(Color.red);
        this.add(btn);this.add(clearbtn);
        btn.addActionListener(this);clearbtn.addActionListener(this);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(600, 600);
        this.setLayout(new FlowLayout());
        this.add(textField);
        this.pack();
        this.setVisible(true);
    }
    public void clearAll(){
        textField.setText("");;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btn) {
            input=textField.getText();
            System.out.println(input);
            this.dispose();
            
        }
        if (e.getSource() == clearbtn) {
           clearAll();
            
        }
    }

    public static void main(String[] args) {
        new textField();
    }
}

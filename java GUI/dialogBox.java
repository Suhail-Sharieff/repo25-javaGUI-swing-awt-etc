import javax.swing.JOptionPane;

public class dialogBox {
    //JOptionPane Is up standard dialog box that prompts user for a value or informs them of something
    public static void main(String[] args) {
        //displays some msg
        JOptionPane.showMessageDialog(null, "This is plain msg","This is title",JOptionPane.PLAIN_MESSAGE);
        JOptionPane.showMessageDialog(null, "This iserror msg","This is title",JOptionPane.ERROR_MESSAGE);
        JOptionPane.showMessageDialog(null, "This is info msg","This is title",JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, "This is warning msg","This is title",JOptionPane.WARNING_MESSAGE);
        JOptionPane.showMessageDialog(null, "This is qstn msg","This is title",JOptionPane.QUESTION_MESSAGE);
       
        //prompt user to chose some option
        //X returns -1, YES returns 0, NO returns 1, OK returns 2
        //so we can also store it
        JOptionPane.showConfirmDialog(null, "Are u ok?", "title", JOptionPane.YES_NO_CANCEL_OPTION);


        //input
        String input=JOptionPane.showInputDialog("Your name pls");
        //using optionDialogue u can create own option
        
    }
}

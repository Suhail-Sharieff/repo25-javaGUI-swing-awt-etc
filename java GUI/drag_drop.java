import java.awt.*;
import javax.swing.*;
import java.awt.event.*;


/**
 * drag_drop
 */
//we will need mouse adapter class
class dragPanel extends JPanel{

    ImageIcon img=new ImageIcon("wrong.png");

    final int WIDTH=img.getIconWidth();
    final int HEIGHT=img.getIconHeight();
    //create a point
    Point imgPoint;
    Point prevPoint;

    dragPanel(){
        //set nitial pos of img at (0,0)
        imgPoint=new Point(0,0);
        clickListener cl=new clickListener();
        dragListener dl=new dragListener();
        this.addMouseListener(cl);
        this.addMouseMotionListener(dl);
    }

    public void paintComponent(Graphics g){
        //repaint Image after we update the new position
        super.paintComponent(g);
        img.paintIcon(this, g, (int)imgPoint.getX(), (int)imgPoint.getY());
    }

    //creating innerclass 
    private class clickListener extends MouseAdapter{
        
        public void mousePressed(MouseEvent e){
            prevPoint=e.getPoint();//update prev point
        }
    }
    private class dragListener extends MouseMotionAdapter{

        public void mouseDragged(MouseEvent e){
            Point currPoint=e.getPoint();

            imgPoint.translate(
                (int)(currPoint.getX()-prevPoint.getX()),
                (int)(currPoint.getY()-prevPoint.getY())
            );
            prevPoint=currPoint;
            repaint();
        }
    }


}
public class drag_drop extends JFrame{
    
    dragPanel dp=new dragPanel();

    drag_drop(){



        this.add(dp);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(600,600);
        this.setLayout(null);
        this.setVisible(true);

    }
    public static void main(String[] args) {
        new drag_drop();
    }
}
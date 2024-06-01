import java.awt.*;
import javax.swing.*;


//creating panel class to draw line in it
class panel extends JPanel{


    panel(){
        this.setPreferredSize(new Dimension(600, 600));
    }
    @Override
    public void paint(Graphics g){
        //cast g to 2D coz it has more options
        Graphics2D g2d=(Graphics2D)g;

        g2d.setPaint(Color.red);
        g2d.setStroke(new BasicStroke(7));//width
        // g2d.drawLine(0, 0, 600, 600);
        // g2d.drawString("suhail",100,100);

        //g2d.drawRect(20, 20, 100, 200);
        // g2d.fillRect(20, 20, 100, 200);

        // g2d.drawOval(10, 10, 30, 30);

        // g2d.drawArc(10, 10, 100, 100, 0, 180);

        int x[]={150,350,250,578,123,456},y[]={300,150,300,345,222,333};
        g2d.drawPolygon(x, y, 6);
    }
}

public class graphics2D extends JFrame{


    panel p=new panel();

    graphics2D(){

        this.setSize(600,600);
        this.add(p);
        this.pack();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setVisible(true);
    }
    
    public static void main(String[] args) {
        new graphics2D();
    }
}

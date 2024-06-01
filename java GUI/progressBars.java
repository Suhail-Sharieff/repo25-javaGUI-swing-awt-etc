import java.awt.*;

import javax.swing.*;

public class progressBars {
    // This can be used to show the loading or the percentage of how much data has been loaded if the server is slow
    JFrame frame=new JFrame("Progres bar");
    JProgressBar bar=new JProgressBar(0,100);
    progressBars(){
        bar.setValue(0);//set initial value
        bar.setBounds(0, 0, 420, 50);
        bar.setStringPainted(true);//adds percentage of bar filled
        bar.setFont(new Font("MV Boli",20,40));
        bar.setBackground(Color.yellow);
        bar.setForeground(Color.green);//filler color

        frame.add(bar);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600,600);
        frame.setLayout(null);
        frame.setVisible(true);

        //NOTE: add this after setting frame visible
         // lets fill the bar slowly uto 100
       try {
        fill();
       } catch (Exception e) {
        System.out.println("Filling failed");
       }
    }
    public void fill() {
        int start=0;
        while (start<=100) {
            bar.setValue(start+=1);
            //give somwe gap between each fill
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println("Failed");
            }
        }
        bar.setString("DONE !");
    }
    public static void main(String[] args) {
        new progressBars();
    }
}

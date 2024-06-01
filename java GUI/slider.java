import java.awt.Dimension;
import java.awt.Font;

import javax.swing.*;
import javax.swing.event.*;

class sliderDemo implements ChangeListener{

    JFrame frame;JPanel panel;JLabel label;JSlider slider;


    sliderDemo(){
        frame=new JFrame("Slider demp");
        panel=new JPanel();
        label=new JLabel();
        slider=new JSlider(0,100,36);//add range into slider

        
        slider.setPreferredSize(new Dimension(300,700));

        //paint small markings
        slider.setPaintTicks(true);
        slider.setMinorTickSpacing(1);//minor spacings
        //paint darker markings
        slider.setPaintTrack(true);
        slider.setMajorTickSpacing(10);//major space
        //paint values
        slider.setPaintLabels(true);

        slider.setFont(new Font("MV Boli", 20, 10));
        //to make it vertical
        slider.setOrientation(SwingConstants.VERTICAL);


        //to display value slider is pointing to:
        slider.addChangeListener(this);
        label.setText("Tempertaure: "+slider.getValue());
        label.setFont(new Font("MV Boli",20,40));

        panel.add(slider);panel.add(label);frame.add(panel);
        
        

        //dont set layout to null
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

    }

    @Override
    public void stateChanged(ChangeEvent e) {
       //so that upn moving slider the temperature value changes
        //to display value slider is pointing to:
        label.setText("Tempertaure: "+slider.getValue());
    }
     //Jay Slider is a gui component that lets user enter a value by using an adjustable sliding knob on the track for example you can consider increase in and decrease in volume of volume slider..it can store changes 


}



public class slider {
   
    public static void main(String[] args) {
        new sliderDemo();
    }
}

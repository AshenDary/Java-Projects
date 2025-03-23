import javax.swing.*;
import java.awt.*;
import javax.swing.event.*;


public class SliderDemo implements ChangeListener  {

    JFrame frame;
    JPanel panel;
    JLabel label;
    JSlider slider;

    SliderDemo() {

        frame = new JFrame("Slider");
        panel = new JPanel();
        label = new JLabel();
        slider = new JSlider(0,100,50);

        slider.setPreferredSize(new Dimension(400,200));

        slider.setPaintTicks(true);
        slider.setMinorTickSpacing(10);

        slider.setPaintTrack(true);
        slider.setMajorTickSpacing(25);

        slider.setPaintLabels(true);
        slider.setFont(new Font("Times New Roman",Font.BOLD, 15));

        slider.setOrientation(SwingConstants.VERTICAL);
        slider.addChangeListener(this);

        label.setText("°C = " + slider.getValue());
        label.setFont(new Font("Times New Roman",Font.BOLD, 25));

        panel.add(slider);
        panel.add(label);
        frame.add(panel);
        frame.setSize(450,400);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);


    }



    @Override
    public void stateChanged(ChangeEvent e) {
        label.setText("°C = " + slider.getValue());

    }
}

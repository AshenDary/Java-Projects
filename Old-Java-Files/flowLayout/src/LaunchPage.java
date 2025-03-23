import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class LaunchPage implements ActionListener {

    JFrame frame = new JFrame();
    JButton button = new JButton("NEW WINDOW");

    LaunchPage() {

        button.setBounds(100,150,200,50);
        button.setFocusable(false);
        button.addActionListener(this);
        button.setBackground(Color.blue);
        frame.add(button);

        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        frame.setLayout(null);
        frame.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button) {
            frame.dispose();
            NewWindow myWindow = new NewWindow();
        }

    }
}

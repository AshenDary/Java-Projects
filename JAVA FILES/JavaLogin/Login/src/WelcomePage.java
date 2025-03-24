import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class WelcomePage {

    JFrame frame = new JFrame();
    JLabel welcomeLabel = new JLabel("HELLO");

    WelcomePage(String userID) {

        welcomeLabel.setBounds(350, 100, 400, 50);
        welcomeLabel.setFont(new Font(null, Font.BOLD, 25));
        welcomeLabel.setText("Welcome " + userID + "!");

        frame.add(welcomeLabel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1000,1000);
        frame.setLayout(null);
        frame.setVisible(true);
        

        


    }
}

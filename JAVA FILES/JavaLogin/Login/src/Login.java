import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import javax.swing.*;

public class Login implements ActionListener {

    JFrame frame = new JFrame();
    JButton loginbutton = new JButton("Login");
    JButton resetButton = new JButton("Reset");
    JTextField userIDField = new JTextField();
    JPasswordField passwordField = new JPasswordField();
    JLabel userIDLabel = new JLabel("userID:");
    JLabel passwordLabel = new JLabel("password:");
    JLabel messageLabel = new JLabel("");

    HashMap<String, String> loginInfo;

    public Login(HashMap<String, String> loginInfoOriginal) {
        this.loginInfo = loginInfoOriginal;

        userIDLabel.setBounds(50, 100, 75, 25);
        passwordLabel.setBounds(50, 150, 75, 25);

        messageLabel.setBounds(125, 250, 250, 35);
        messageLabel.setFont(new Font(null, Font.ITALIC, 20));

        userIDField.setBounds(125, 100, 200, 25);
        passwordField.setBounds(125, 150, 200, 25);

        loginbutton.setBounds(125, 200, 100, 25);
        loginbutton.setFocusable(false);
        loginbutton.addActionListener(this);

        resetButton.setBounds(225, 200, 100, 25);
        resetButton.setFocusable(false);
        resetButton.addActionListener(this);


        frame.add(messageLabel);
        frame.add(userIDLabel);
        frame.add(passwordLabel);
        frame.add(userIDField);
        frame.add(passwordField);
        frame.add(loginbutton);
        frame.add(resetButton);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420, 420);
        frame.setLayout(null);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == resetButton) {
            userIDField.setText("");
            passwordField.setText("");
            messageLabel.setText("");
        }

        if (e.getSource() == loginbutton) {
            String userID = userIDField.getText();
            String password = String.valueOf(passwordField.getPassword());

            if (loginInfo.containsKey(userID)) {
                if (loginInfo.get(userID).equals(password)) {
                    messageLabel.setForeground(Color.green);
                    messageLabel.setText("Login successful ✅");
                    frame.dispose();
                    WelcomePage welcomePage = new WelcomePage(userID);

                } else {
                    messageLabel.setForeground(Color.red);
                    messageLabel.setText("Wrong password ❌");
                }
            } else {
                messageLabel.setForeground(Color.red);
                messageLabel.setText("User not found ❌");
            }
        }
    }
}

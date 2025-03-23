import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {

        JFrame frame = new JFrame();
        JLabel label = new JLabel("BOBO KA BA?");

        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        frame.setLayout(new BorderLayout(10,10));
        frame.setVisible(true);
        frame.setTitle("BORDER LAYOUT");

        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();
        JPanel panel3 = new JPanel();
        JPanel panel4 = new JPanel();
        JPanel panel5 = new JPanel();

        panel1.setBackground(Color.red);
        panel2.setBackground(Color.blue);
        panel3.setBackground(Color.green);
        panel4.setBackground(Color.yellow);
        panel5.setBackground(Color.magenta);

        panel1.setPreferredSize(new Dimension(150,150));
        panel2.setPreferredSize(new Dimension(150,150));
        panel3.setPreferredSize(new Dimension(150,150));
        panel4.setPreferredSize(new Dimension(150,150));
        panel5.setPreferredSize(new Dimension(150,150));

        //SUB PANELS

        JPanel panel6 = new JPanel();
        JPanel panel7 = new JPanel();
        JPanel panel8 = new JPanel();
        JPanel panel9 = new JPanel();
        JPanel panel10 = new JPanel();

        panel6.setBackground(Color.black);
        panel7.setBackground(Color.white);
        panel8.setBackground(Color.darkGray);
        panel9.setBackground(Color.gray);
        panel10.setBackground(Color.lightGray);

        panel6.setPreferredSize(new Dimension(50,50));
        panel7.setPreferredSize(new Dimension(50,50));
        panel8.setPreferredSize(new Dimension(50,50));
        panel9.setPreferredSize(new Dimension(50,50));
        panel10.setPreferredSize(new Dimension(50,50));

        panel5.add(panel6,BorderLayout.NORTH);
        panel4.add(panel7,BorderLayout.WEST);
        panel3.add(panel8,BorderLayout.EAST);
        panel2.add(panel9,BorderLayout.SOUTH);
        panel1.add(panel10,BorderLayout.CENTER);
        panel1.add(label);

        frame.add(panel1, BorderLayout.NORTH);
        frame.add(panel2, BorderLayout.WEST);
        frame.add(panel3, BorderLayout.EAST);
        frame.add(panel4, BorderLayout.SOUTH);
        frame.add(panel5, BorderLayout.CENTER);

        frame.add(panel6, BorderLayout.NORTH);
        frame.add(panel7, BorderLayout.WEST);
        frame.add(panel8, BorderLayout.EAST);
        frame.add(panel9, BorderLayout.SOUTH);
        frame.add(panel10, BorderLayout.CENTER);

    }
}
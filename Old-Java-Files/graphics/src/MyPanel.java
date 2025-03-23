import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyPanel extends JPanel implements ActionListener {

    final int PANEL_WIDTH = 500;
    final int PANEL_HEIGHT = 500;
    Image ship;
    Image spaceBackground;
    Timer timer;
    int xVelocity = 1;
    int yVelocity = 0;
    int x =0;
    int y =0;

    MyPanel() {

        spaceBackground = new ImageIcon("E:\\JAVA\\graphics\\src\\space.jpg").getImage();
        ship = new ImageIcon("E:\\JAVA\\graphics\\src\\ship.png").getImage();
        timer = new Timer(50,this);

        this.setPreferredSize(new Dimension(PANEL_WIDTH, PANEL_HEIGHT));
        this.setBackground(Color.BLACK);
        timer.start();


    }

    public void paint(Graphics g) {

        super.paint(g);

        Graphics2D g2D = (Graphics2D) g;

        g.drawImage(spaceBackground, 0, 0, getWidth(), getHeight(), this);

        g2D.drawImage(ship, x, y, this);


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (x >= PANEL_WIDTH - ship.getWidth(null) || x < 0) {
            xVelocity = -xVelocity;
        }

        x = x + xVelocity;
        repaint();

    }
}


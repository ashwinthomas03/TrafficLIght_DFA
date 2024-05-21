/*import java.awt.Button;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

class CircularButton extends JButton {
    private Color buttonColor;

    public CircularButton(Color color) {
        this.buttonColor = color;
        //setPreferredSize(new Dimension(20, 20));
        setContentAreaFilled(false);
        setBorderPainted(false);
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(buttonColor);
        g.fillOval(0, 0, 50, 50);
    }

    @Override
    public void setBackground(Color color) {
        super.setBackground(color);
        this.buttonColor = color;
        repaint(); // Trigger a repaint after updating the color
    }
}

class RectangleButton extends JButton {
    private Color buttonColor;

    public RectangleButton(Color color) {
        this.buttonColor = color;
        //setPreferredSize(new Dimension(20, 20));
        setContentAreaFilled(false);
        setBorderPainted(false);
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(buttonColor);
        g.fillRect(0,0 , 30, 30);
    }

    @Override
    public void setBackground(Color color) {
        super.setBackground(color);
        this.buttonColor = color;
        repaint(); // Trigger a repaint after updating the color
    }
}

public class Demo {
    static JFrame frame = new JFrame();
    

    static CircularButton button1 = new CircularButton(Color.RED);
    static CircularButton button2 = new CircularButton(Color.RED);
    static CircularButton button3 = new CircularButton(Color.GREEN);
    static CircularButton button4 = new CircularButton(Color.GREEN);

    static RectangleButton buttonp1 = new RectangleButton(Color.RED);
    static RectangleButton button5 = new RectangleButton(Color.GREEN);
    static RectangleButton buttonp2 = new RectangleButton(Color.RED);
    static RectangleButton button8 = new RectangleButton(Color.GREEN);
    static RectangleButton buttonp3 = new RectangleButton(Color.RED);
    static RectangleButton button6 = new RectangleButton(Color.GREEN);
    static RectangleButton buttonp4 = new RectangleButton(Color.RED);
    static RectangleButton button7 = new RectangleButton(Color.GREEN);


    public static void main(String[] args) {
        ImageIcon originalImg = new ImageIcon("Imhg.jpg"); // Corrected image path
        Image scaledImg = originalImg.getImage().getScaledInstance(800, 800, Image.SCALE_SMOOTH);
        ImageIcon img = new ImageIcon(scaledImg);

        //JPanel frame = new JPanel();
       // frame.setLayout(null);
        //frame.setBounds(0, 0, 800, 800);

        button1.setBounds(375, 150, 50, 50); // Set the position of the circular button At the Top Center
        frame.add(button1);

        button2.setBounds(375, 600, 50, 50); // Set the position of the second circular button Bottom Center
        frame.add(button2);

        //button3 = new CircularButton(Color.YELLOW);
        button3.setBounds(550,380, 50, 50); // Set the position of the third circular button Right Middle
        frame.add(button3);

        button4.setBounds(200,380, 50, 50); // Set the position of the fourth circular button Left Middle
        frame.add(button4);

        buttonp1.setBounds(260,480,50,50);//vertical left
        frame.add(buttonp1);

        button5.setBounds(290,510, 50, 50); // Set the Position for Bottom Corner Left horizontal
        frame.add(button5);

        buttonp3.setBounds(255,280,50,50);//left top vetticla
        frame.add(buttonp3);

        button6.setBounds(285,240, 50, 50); // Left Top Corner horizontal
        frame.add(button6);

        buttonp4.setBounds(520,270,50,50);//right top vertical
        frame.add(buttonp4);

        button7.setBounds(490,240, 50, 50); // right top horizontal
        frame.add(button7);

        buttonp2.setBounds(520,490,50,50);//bottom right vertical
        frame.add(buttonp2);

        button8.setBounds(490,515, 50, 50); // Set the Position for Right Bottom Corner
        frame.add(button8);

        JLabel label = new JLabel(originalImg);
        label.setBounds(0, 0, 800, 800);
        frame.add(label);

        

        frame.setTitle("Traffic Light");
        frame.setSize(800, 800);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setVisible(true);
        frame.setVisible(true);
    }
}*/
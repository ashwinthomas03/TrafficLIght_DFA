import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;

class CircularButton extends JButton {
    private Color buttonColor;

    public CircularButton(Color color) {
        this.buttonColor = color;
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
        repaint();
    }
}

class RectangleButton extends JButton {
    private Color buttonColor;

    public RectangleButton(Color color) {
        this.buttonColor = color;
        setContentAreaFilled(false);
        setBorderPainted(false);
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(buttonColor);
        g.fillRect(0, 0, 30, 30);
    }

    @Override
    public void setBackground(Color color) {
        super.setBackground(color);
        this.buttonColor = color;
        repaint();
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
        ImageIcon originalImg = new ImageIcon("Img.jpg");
        Image scaledImg = originalImg.getImage().getScaledInstance(800, 800, Image.SCALE_SMOOTH);
        ImageIcon img = new ImageIcon(scaledImg);

        JLayeredPane layeredPane = new JLayeredPane();
        frame.setContentPane(layeredPane);

        button1.setBounds(375, 150, 50, 50);
        layeredPane.add(button1, JLayeredPane.DEFAULT_LAYER);

        button2.setBounds(375, 600, 50, 50);
        layeredPane.add(button2, JLayeredPane.DEFAULT_LAYER);

        button3.setBounds(550, 380, 50, 50);
        layeredPane.add(button3, JLayeredPane.DEFAULT_LAYER);

        button4.setBounds(200, 380, 50, 50);
        layeredPane.add(button4, JLayeredPane.DEFAULT_LAYER);

        buttonp1.setBounds(190, 545, 50, 50);
        layeredPane.add(buttonp1, JLayeredPane.DEFAULT_LAYER);

        button5.setBounds(220, 580, 50, 50);
        layeredPane.add(button5, JLayeredPane.DEFAULT_LAYER);

        buttonp3.setBounds(255, 280, 50, 50);
        layeredPane.add(buttonp3, JLayeredPane.DEFAULT_LAYER);

        button6.setBounds(285, 240, 50, 50);
        layeredPane.add(button6, JLayeredPane.DEFAULT_LAYER);

        buttonp4.setBounds(520, 270, 50, 50);
        layeredPane.add(buttonp4, JLayeredPane.DEFAULT_LAYER);

        button7.setBounds(490, 240, 50, 50);
        layeredPane.add(button7, JLayeredPane.DEFAULT_LAYER);

        buttonp2.setBounds(520, 490, 50, 50);
        layeredPane.add(buttonp2, JLayeredPane.DEFAULT_LAYER);

        button8.setBounds(490, 515, 50, 50);
        layeredPane.add(button8, JLayeredPane.DEFAULT_LAYER);

        JLabel label = new JLabel(img);
        label.setBounds(0, 0, 800, 800);
        layeredPane.add(label, JLayeredPane.DEFAULT_LAYER);

        frame.setTitle("Traffic Light");
        frame.setSize(800, 800);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setVisible(true);
    }
}

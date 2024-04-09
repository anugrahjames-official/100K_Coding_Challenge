import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Calculator {
    JFrame jf;

    public Calculator() {
        jf = new JFrame("Calculator");
        jf.setLayout(null);
        jf.setSize(600, 600);
        jf.setLocation(500, 100);

        JLabel displayJLabel = new JLabel("Hai");
        displayJLabel.setBounds(10, 10, 500, 50);
        displayJLabel.setBackground(Color.ORANGE);
        displayJLabel.setOpaque(true);
        displayJLabel.setForeground(Color.BLUE);
        displayJLabel.setHorizontalAlignment(SwingConstants.RIGHT);
        jf.add(displayJLabel);

        JButton sevenJButton = new JButton("7");
        sevenJButton.setBounds(10, 70, 80, 80);
        jf.add(sevenJButton);

        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new Calculator();
    }
}
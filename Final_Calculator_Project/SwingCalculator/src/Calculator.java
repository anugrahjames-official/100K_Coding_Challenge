import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Calculator implements ActionListener {
    JFrame jf;
    JLabel displayJLabel;
    JButton sevenJButton;
    JButton eightJButton;
    JButton nineJButton;
    JButton fourJButton;
    JButton fiveButton;
    JButton sixJButton;
    JButton oneJButton;
    JButton twoJButton;
    JButton threeJButton;
    JButton zeroJButton;
    JButton dotJButton;
    JButton equalJButton;
    JButton plusJButton;
    JButton minusJButton;
    JButton multiplyJButton;
    JButton divideJButton;
    JButton clearJButton;
    JButton percentageJButton;
    JButton sqrtJButton;
    JButton sinJButton;
    JButton cosJButton;
    JButton tanJButton;
    JButton logJButton;
    JButton piJButton;
    JButton eJButton;
    JButton factorialJButton;

    public Calculator() {
        jf = new JFrame("Calculator");
        jf.setLayout(null);
        jf.setSize(650, 600);
        jf.setLocation(500, 100);

        displayJLabel = new JLabel("Hai");
        displayJLabel.setBounds(10, 10, 500, 50);
        displayJLabel.setBackground(Color.ORANGE);
        displayJLabel.setOpaque(true);
        displayJLabel.setForeground(Color.BLUE);
        displayJLabel.setHorizontalAlignment(SwingConstants.RIGHT);
        jf.add(displayJLabel);

        sevenJButton = new JButton("7");
        sevenJButton.setBounds(10, 70, 80, 80);
        sevenJButton.addActionListener(this);
        jf.add(sevenJButton);


        JButton eightJButton = new JButton("8");
        eightJButton.setBounds(100, 70, 80, 80);
        eightJButton.addActionListener(this);
        jf.add(eightJButton);

        JButton nineJButton = new JButton("9");
        nineJButton.setBounds(190, 70, 80, 80);
        nineJButton.addActionListener(this);
        jf.add(nineJButton);

        JButton fourJButton = new JButton("4");
        fourJButton.setBounds(10, 160, 80, 80);
        fourJButton.addActionListener(this);
        jf.add(fourJButton);

        JButton fiveJButton = new JButton("5");
        fiveJButton.setBounds(100, 160, 80, 80);
        fiveJButton.addActionListener(this);
        jf.add(fiveJButton);

        JButton sixJButton = new JButton("6");
        sixJButton.setBounds(190, 160, 80, 80);
        sixJButton.addActionListener(this);
        jf.add(sixJButton);

        JButton oneJButton = new JButton("1");
        oneJButton.setBounds(10, 250, 80, 80);
        oneJButton.addActionListener(this);
        jf.add(oneJButton);

        JButton twoJButton = new JButton("2");
        twoJButton.setBounds(100, 250, 80, 80);
        twoJButton.addActionListener(this);
        jf.add(twoJButton);

        JButton threeJButton = new JButton("3");
        threeJButton.setBounds(190, 250, 80, 80);
        threeJButton.addActionListener(this);
        jf.add(threeJButton);

        JButton zeroJButton = new JButton("0");
        zeroJButton.setBounds(10, 340, 80, 80);
        zeroJButton.addActionListener(this);
        jf.add(zeroJButton);

        JButton dotJButton = new JButton(".");
        dotJButton.setBounds(100, 340, 80, 80);
        dotJButton.addActionListener(this);
        jf.add(dotJButton);

        JButton equalJButton = new JButton("=");
        equalJButton.setBounds(190, 340, 80, 80);
        eightJButton.addActionListener(this);
        jf.add(equalJButton);

        JButton  plusJButton = new JButton("+");
        plusJButton.setBounds(280, 70, 80, 80);
        plusJButton.addActionListener(this);
        jf.add(plusJButton);

        JButton minusJButton = new JButton("-");
        minusJButton.setBounds(280, 160, 80, 80);
        minusJButton.addActionListener(this);
        jf.add(minusJButton);

        JButton multiplyJButton = new JButton("*");
        multiplyJButton.setBounds(280, 250, 80, 80);
        multiplyJButton.addActionListener(this);
        jf.add(multiplyJButton);

        JButton divideJButton = new JButton("/");
        divideJButton.setBounds(280, 340, 80, 80);
        divideJButton.addActionListener(this);
        jf.add(divideJButton);

        JButton clearJButton = new JButton("C");
        clearJButton.setBounds(10, 430, 80, 80);
        clearJButton.addActionListener(this);
        jf.add(clearJButton);

        JButton deleteJButton = new JButton("Del");
        deleteJButton.setBounds(100, 430, 80, 80);
        deleteJButton.addActionListener(this);
        jf.add(deleteJButton);

        JButton percentageJButton = new JButton("%");
        percentageJButton.setBounds(190, 430, 80, 80);
        percentageJButton.addActionListener(this);
        jf.add(percentageJButton);

        JButton sqrtJButton = new JButton("√");
        sqrtJButton.setBounds(280, 430, 80, 80);
        sqrtJButton.addActionListener(this);
        jf.add(sqrtJButton);

        JButton sinJButton = new JButton("sin");
        sinJButton.setBounds(370, 70, 80, 80);
        sinJButton.addActionListener(this);
        jf.add(sinJButton);

        JButton cosJButton = new JButton("cos");
        cosJButton.setBounds(370, 160, 80, 80);
        cosJButton.addActionListener(this);
        jf.add(cosJButton);

        JButton tanJButton = new JButton("tan");
        tanJButton.setBounds(370, 250, 80, 80);
        tanJButton.addActionListener(this);
        jf.add(tanJButton);

        JButton logJButton = new JButton("log");
        logJButton.setBounds(370, 340, 80, 80);
        logJButton.addActionListener(this);
        jf.add(logJButton);

        JButton piJButton = new JButton("π");
        piJButton.setBounds(370, 430, 80, 80);
        piJButton.addActionListener(this);
        jf.add(piJButton);

        JButton eJButton = new JButton("e");
        eJButton.setBounds(460, 70, 80, 80);
        eJButton.addActionListener(this);
        jf.add(eJButton);

        JButton factorialJButton = new JButton("x!");
        factorialJButton.setBounds(460, 160, 80, 80);
        factorialJButton.addActionListener(this);
        jf.add(factorialJButton);

        JButton lnJButton = new JButton("ln");
        lnJButton.setBounds(460, 250, 80, 80);
        lnJButton.addActionListener(this);
        jf.add(lnJButton);

        JButton powJButton = new JButton("x^y");
        powJButton.setBounds(460, 340, 80, 80);
        powJButton.addActionListener(this);
        jf.add(powJButton);

        JButton leftbracketJButton = new JButton("(");
        leftbracketJButton.setBounds(460, 430, 80, 80);
        leftbracketJButton.addActionListener(this);
        jf.add(leftbracketJButton);

        JButton rightbracketJButton = new JButton(")");
        rightbracketJButton.setBounds(550, 70, 80, 80);
        rightbracketJButton.addActionListener(this);
        jf.add(rightbracketJButton);

        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new Calculator();
    }
    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
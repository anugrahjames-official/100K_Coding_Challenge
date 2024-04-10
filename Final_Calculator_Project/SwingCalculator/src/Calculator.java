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
    Boolean isOperatorClicked = false;
    JLabel displayJLabel;
    JButton sevenJButton;
    JButton eightJButton;
    JButton nineJButton;
    JButton fourJButton;
    JButton fiveJButton;
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
    JButton deleteJButton;
    JButton percentageJButton;
    JButton sqrtJButton;
    JButton sinJButton;
    JButton cosJButton;
    JButton tanJButton;
    JButton logJButton;
    JButton piJButton;
    JButton eJButton;
    JButton factorialJButton;
    JButton lnJButton;
    JButton powJButton;
    JButton leftbracketJButton;
    JButton rightbracketJButton;

    public Calculator() {
        jf = new JFrame("Calculator");
        jf.setLayout(null);
        jf.setSize(650, 600);
        jf.setLocation(500, 100);

        displayJLabel = new JLabel();
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


        eightJButton = new JButton("8");
        eightJButton.setBounds(100, 70, 80, 80);
        eightJButton.addActionListener(this);
        jf.add(eightJButton);

        nineJButton = new JButton("9");
        nineJButton.setBounds(190, 70, 80, 80);
        nineJButton.addActionListener(this);
        jf.add(nineJButton);

        fourJButton = new JButton("4");
        fourJButton.setBounds(10, 160, 80, 80);
        fourJButton.addActionListener(this);
        jf.add(fourJButton);

        fiveJButton = new JButton("5");
        fiveJButton.setBounds(100, 160, 80, 80);
        fiveJButton.addActionListener(this);
        jf.add(fiveJButton);

        sixJButton = new JButton("6");
        sixJButton.setBounds(190, 160, 80, 80);
        sixJButton.addActionListener(this);
        jf.add(sixJButton);

        oneJButton = new JButton("1");
        oneJButton.setBounds(10, 250, 80, 80);
        oneJButton.addActionListener(this);
        jf.add(oneJButton);

        twoJButton = new JButton("2");
        twoJButton.setBounds(100, 250, 80, 80);
        twoJButton.addActionListener(this);
        jf.add(twoJButton);

        threeJButton = new JButton("3");
        threeJButton.setBounds(190, 250, 80, 80);
        threeJButton.addActionListener(this);
        jf.add(threeJButton);

        zeroJButton = new JButton("0");
        zeroJButton.setBounds(10, 340, 80, 80);
        zeroJButton.addActionListener(this);
        jf.add(zeroJButton);

        dotJButton = new JButton(".");
        dotJButton.setBounds(100, 340, 80, 80);
        dotJButton.addActionListener(this);
        jf.add(dotJButton);

        equalJButton = new JButton("=");
        equalJButton.setBounds(190, 340, 80, 80);
        equalJButton.addActionListener(this);
        jf.add(equalJButton);

        plusJButton = new JButton("+");
        plusJButton.setBounds(280, 70, 80, 80);
        plusJButton.addActionListener(this);
        jf.add(plusJButton);

        minusJButton = new JButton("-");
        minusJButton.setBounds(280, 160, 80, 80);
        minusJButton.addActionListener(this);
        jf.add(minusJButton);

        multiplyJButton = new JButton("*");
        multiplyJButton.setBounds(280, 250, 80, 80);
        multiplyJButton.addActionListener(this);
        jf.add(multiplyJButton);

        divideJButton = new JButton("/");
        divideJButton.setBounds(280, 340, 80, 80);
        divideJButton.addActionListener(this);
        jf.add(divideJButton);

        clearJButton = new JButton("C");
        clearJButton.setBounds(10, 430, 80, 80);
        clearJButton.addActionListener(this);
        jf.add(clearJButton);

        deleteJButton = new JButton("Del");
        deleteJButton.setBounds(100, 430, 80, 80);
        deleteJButton.addActionListener(this);
        jf.add(deleteJButton);

        percentageJButton = new JButton("%");
        percentageJButton.setBounds(190, 430, 80, 80);
        percentageJButton.addActionListener(this);
        jf.add(percentageJButton);

        sqrtJButton = new JButton("√");
        sqrtJButton.setBounds(280, 430, 80, 80);
        sqrtJButton.addActionListener(this);
        jf.add(sqrtJButton);

        sinJButton = new JButton("sin");
        sinJButton.setBounds(370, 70, 80, 80);
        sinJButton.addActionListener(this);
        jf.add(sinJButton);

        cosJButton = new JButton("cos");
        cosJButton.setBounds(370, 160, 80, 80);
        cosJButton.addActionListener(this);
        jf.add(cosJButton);

        tanJButton = new JButton("tan");
        tanJButton.setBounds(370, 250, 80, 80);
        tanJButton.addActionListener(this);
        jf.add(tanJButton);

        logJButton = new JButton("log");
        logJButton.setBounds(370, 340, 80, 80);
        logJButton.addActionListener(this);
        jf.add(logJButton);

        piJButton = new JButton("π");
        piJButton.setBounds(370, 430, 80, 80);
        piJButton.addActionListener(this);
        jf.add(piJButton);

        eJButton = new JButton("e");
        eJButton.setBounds(460, 70, 80, 80);
        eJButton.addActionListener(this);
        jf.add(eJButton);
        
        factorialJButton = new JButton("!");
        factorialJButton.setBounds(460, 160, 80, 80);
        factorialJButton.addActionListener(this);
        jf.add(factorialJButton);

        lnJButton = new JButton("ln");
        lnJButton.setBounds(460, 250, 80, 80);
        lnJButton.addActionListener(this);
        jf.add(lnJButton);

        powJButton = new JButton("x^y");
        powJButton.setBounds(460, 340, 80, 80);
        powJButton.addActionListener(this);
        jf.add(powJButton);

        leftbracketJButton = new JButton("(");
        leftbracketJButton.setBounds(460, 430, 80, 80);
        leftbracketJButton.addActionListener(this);
        jf.add(leftbracketJButton);

        rightbracketJButton = new JButton(")");
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
        if (e.getSource() == sevenJButton) {
            if (isOperatorClicked == true) {
                displayJLabel.setText("7");
                isOperatorClicked = false;
            } else {
                displayJLabel.setText(displayJLabel.getText() + "7");
            }
    } else if (e.getSource() == eightJButton) {
        if (isOperatorClicked) {
            displayJLabel.setText("8");}
            
        else {
            displayJLabel.setText(displayJLabel.getText()+"8");
        }
    } else if (e.getSource() == nineJButton) {
        displayJLabel.setText(displayJLabel.getText()+"9");
    } else if (e.getSource() == fourJButton) {
        displayJLabel.setText(displayJLabel.getText()+"4");
    } else if (e.getSource() == fiveJButton) {
        displayJLabel.setText(displayJLabel.getText()+"5");
    } else if (e.getSource() == sixJButton) {
        displayJLabel.setText(displayJLabel.getText()+"6");
    } else if (e.getSource() == oneJButton) {
        displayJLabel.setText(displayJLabel.getText()+"1");
    } else if (e.getSource() == twoJButton) {
        displayJLabel.setText(displayJLabel.getText()+"2");
    } else if (e.getSource() == threeJButton) {
        displayJLabel.setText(displayJLabel.getText()+"3");
    } else if (e.getSource() == zeroJButton) {
        displayJLabel.setText(displayJLabel.getText()+"0");
    } else if (e.getSource() == dotJButton) {
        displayJLabel.setText(displayJLabel.getText()+".");
    } else if (e.getSource() == equalJButton) {
        displayJLabel.setText(displayJLabel.getText()+"=");
    } else if (e.getSource() == plusJButton) {
        isOperatorClicked = true;
        displayJLabel.setText(displayJLabel.getText()+"+");
    } else if (e.getSource() == minusJButton) {
        displayJLabel.setText(displayJLabel.getText()+"-");
    } else if (e.getSource() == multiplyJButton) {
        displayJLabel.setText(displayJLabel.getText()+"*");
    } else if (e.getSource() == divideJButton) {
        displayJLabel.setText(displayJLabel.getText()+"/");
    } else if (e.getSource() == clearJButton) {
        displayJLabel.setText("");
    } else if (e.getSource() == deleteJButton) {
        displayJLabel.setText(displayJLabel.getText()+"");
    } else if (e.getSource() == percentageJButton) {
        displayJLabel.setText(displayJLabel.getText()+"%");
    } else if (e.getSource() == sqrtJButton) {
        displayJLabel.setText(displayJLabel.getText()+"√");
    } else if (e.getSource() == sinJButton) {
        displayJLabel.setText(displayJLabel.getText()+"sin");
    } else if (e.getSource() == cosJButton) {
        displayJLabel.setText(displayJLabel.getText()+"cos");
    } else if (e.getSource() == tanJButton) {
        displayJLabel.setText(displayJLabel.getText()+"tan");
    } else if (e.getSource() == logJButton) {
        displayJLabel.setText(displayJLabel.getText()+"lg(");
    } else if (e.getSource() == piJButton) {
        displayJLabel.setText(displayJLabel.getText()+"π");
    } else if (e.getSource() == eJButton) {
        displayJLabel.setText(displayJLabel.getText()+"e");
    } else if (e.getSource() == factorialJButton) {
        displayJLabel.setText(displayJLabel.getText()+"!");
    } else if (e.getSource() == lnJButton) {
        displayJLabel.setText(displayJLabel.getText()+"ln(");
    } else if (e.getSource() == powJButton) {
        displayJLabel.setText(displayJLabel.getText()+"^y");
    } else if (e.getSource() == leftbracketJButton) {
        displayJLabel.setText(displayJLabel.getText()+"(");
    } else if (e.getSource() == rightbracketJButton) {
        displayJLabel.setText(displayJLabel.getText()+")");
    }
    }
}
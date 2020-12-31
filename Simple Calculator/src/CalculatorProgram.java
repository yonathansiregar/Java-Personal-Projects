import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorProgram {
    private double total1 = 0.0;
    private double total2 = 0.0;
    private String mathOperator;

    private JPanel MyCalculatorProgram;
    private JTextField typeNumbers;
    private JButton buttonOne;
    private JButton buttonTwo;
    private JButton buttonThree;
    private JButton additionButton;
    private JButton subtractButton;
    private JButton buttonFour;
    private JButton buttonFive;
    private JButton buttonSix;
    private JButton multiplicationButton;
    private JButton divisionButton;
    private JButton buttonSeven;
    private JButton buttonEight;
    private JButton buttonNine;
    private JButton equalsButton;
    private JButton buttonZero;
    private JButton pointButton;
    private JButton clearButton;
    private JButton modButton;
    private JButton percentageButton;

    private void getOperator (String buttonText) {
        mathOperator = buttonText;
        total1 = total1 + Double.parseDouble(typeNumbers.getText());
        typeNumbers.setText("");
    }

    public CalculatorProgram() {
        buttonOne.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String buttonOneText = typeNumbers.getText() + buttonOne.getText();
                typeNumbers.setText(buttonOneText);
            }
        });
        buttonTwo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String buttonTwoText = typeNumbers.getText() + buttonTwo.getText();
                typeNumbers.setText(buttonTwoText);
            }
        });
        buttonThree.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String buttonThreeText = typeNumbers.getText() + buttonThree.getText();
                typeNumbers.setText(buttonThreeText);
            }
        });
        buttonFour.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String Button4Text = typeNumbers.getText() + buttonFour.getText();
                typeNumbers.setText(Button4Text);
            }
        });
        buttonFive.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String Button5Text = typeNumbers.getText() + buttonFive.getText();
                typeNumbers.setText(Button5Text);
            }
        });
        buttonSix.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String Button6Text = typeNumbers.getText() + buttonSix.getText();
                typeNumbers.setText(Button6Text);
            }
        });
        buttonSeven.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String Button7Text = typeNumbers.getText() + buttonSeven.getText();
                typeNumbers.setText(Button7Text);
            }
        });
        buttonEight.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String Button8Text = typeNumbers.getText() + buttonEight.getText();
                typeNumbers.setText(Button8Text);
            }
        });
        buttonNine.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String Button9Text = typeNumbers.getText() + buttonNine.getText();
                typeNumbers.setText(Button9Text);
            }
        });
        buttonZero.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String Button0Text = typeNumbers.getText() + buttonZero.getText();
                typeNumbers.setText(Button0Text);
            }
        });
        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                total2 = 0;
                typeNumbers.setText("");
            }
        });
        pointButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (typeNumbers.getText().equals("")) {
                    typeNumbers.setText("0. ");
                } else if (typeNumbers.getText().contains(".")) {
                    pointButton.setEnabled(false);
                } else {
                    String PointButtonText = typeNumbers.getText() + pointButton.getText();
                    typeNumbers.setText(PointButtonText);
                }
                pointButton.setEnabled(true);
            }
        });
        additionButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String buttonText = additionButton.getText();
                getOperator(buttonText);
            }
        });

        // Subtraction Button
        subtractButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String buttonText = subtractButton.getText();
                getOperator(buttonText);
            }
        });

        // Multiplication Button
        multiplicationButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String multiplicationButtonText = multiplicationButton.getText();
                getOperator(multiplicationButtonText);
            }
        });

        // Division Button
        divisionButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String divisionButtonText = divisionButton.getText();
                getOperator(divisionButtonText);
            }
        });

        //Equals Button
        equalsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                switch (mathOperator) {
                    case "+":
                        total2 = total1 + Double.parseDouble(typeNumbers.getText());
                        break;
                    case "-":
                        total2 = total1 - Double.parseDouble(typeNumbers.getText());
                        break;
                    case "*":
                        total2 = total1 * Double.parseDouble(typeNumbers.getText());
                        break;
                    case "/":
                        total2 = total1 / Double.parseDouble(typeNumbers.getText());
                        break;
                    case "MOD":
                        total2 = total1 % Double.parseDouble(typeNumbers.getText());
                        break;
                    case "/ 100":
                        total2 = total1 / 100.0;
                        break;
                }
                typeNumbers.setText(Double.toString(total2));
                total1 = 0;
            }
        });
        modButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String modButtonText = modButton.getText();
                getOperator(modButtonText);
            }
        });
        percentageButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String percentageButtonText = percentageButton.getText();
                getOperator(percentageButtonText);
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Calculator");
        frame.setContentPane(new CalculatorProgram().MyCalculatorProgram);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
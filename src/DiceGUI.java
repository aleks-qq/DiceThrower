/**
 *
 * @author ddrank
 */
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.*;
import javax.swing.*;

public class DiceGUI extends JFrame {

    private DiceController controller;
    private JPanel theJPanel;
    private JButton rollJButton;
    private JLabel rollsWantedLabel, resultLabel, totalLabel;
    private final JLabel totalJLabel, resultJlabel;
    private NumericTextField inputField;

    //The Dice-pictures path
    private final String picPath = "dicePictures/die_face_";

    public DiceGUI() { 
        this.resultJlabel = new JLabel("0");
        this.totalJLabel = new JLabel("0");
        initComponents();
    }

    public void registerController(DiceController cont) {
        this.controller = cont;
    }

    //initialization of GUI components
    private void initComponents() {
        setTitle("Let's roll dice");
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        rollsWantedLabel = new JLabel("Amount of wanted rolls:");
        resultLabel = new JLabel("Result of the rolled dice:");
        totalLabel = new JLabel("Total amount of rolls:");

        // Using custom subclass NumericTextField instead of 
        // the its parent JFormattedTextField, since 
        //JFormattedTextField doesn't handle numbers that well
        inputField = new NumericTextField();

        inputField.setText("1");
        inputField.setColumns(20);
        inputField.setMaximumSize(new Dimension(150, 20));

        theJPanel = new JPanel();
        theJPanel.setLayout(new BoxLayout(theJPanel, BoxLayout.PAGE_AXIS));

        rollJButton = new JButton("Roll dice");

        theJPanel.add(rollsWantedLabel);
        theJPanel.add(inputField);
        theJPanel.add(rollJButton);

        theJPanel.add(totalLabel);
        theJPanel.add(resultJlabel);

        theJPanel.add(resultLabel);
        theJPanel.add(totalJLabel);

        setContentPane(theJPanel);

        theJPanel.setBackground(Color.white);

        //Throw button
        rollJButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                //Integer.parseInt doesnt like ""
                //so here we test that inputField.getText()
                //isn't empty
                if (!inputField.getText().equals("")) {

                    //Making sure it's not larger than 1000000
                    if (Integer.parseInt(inputField.getText()) <= 1000000) {
                        controller.throwDice(Integer.parseInt(inputField.getText()));
                    } else {
                        JOptionPane.showMessageDialog(null, "Make sure the number is 1000000 or lower.");
                    }
                }else {
                        JOptionPane.showMessageDialog(null, "Enter a number.");
                    }
            }
        }
        );

        setSize(
                330, 470);
        setVisible(
                true);
    }

    //set the total amount of dice rolled
    public void setTotal(int silmäluku) {
        totalJLabel.setText(String.valueOf(silmäluku));
        initComponents();
    }

    //set the result of the dice rolled
    public void setResult(int silmäluku) {
        resultJlabel.setText(String.valueOf(silmäluku));
    }

    //change the picture of the dice rolled
    public void setDicePic(int luku) {
        ClassLoader cldr = this.getClass().getClassLoader();
        java.net.URL imageURL = cldr.getResource(picPath + luku + ".png");
        JLabel picLabel = new JLabel(new ImageIcon(imageURL));
        add(picLabel);
    }
}

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.awt.*;


public class GUI implements ActionListener {

    private static JLabel zipLabel;
    private static JButton submitButton;
    private static JButton clearButton;
    private static JTextField userText;
    private static JCheckBox isCelsius;
    
    public GUI()
    {
        JFrame frame = new JFrame();
        frame.setSize(350, 200);

        submitButton = new JButton("Submit");
        submitButton.setBounds(10, 80, 50, 25);
        submitButton.addActionListener(this);

        clearButton = new JButton("Clear");
        clearButton.setBounds(10, 100, 50, 25);

        isCelsius = new JCheckBox("Show Celsius", false);

        zipLabel = new JLabel("Enter Zip Code: ");
        zipLabel.setBounds(100, 20, 80, 25);

        userText = new JTextField(10);
        userText.setBounds(10, 20, 165, 25);


        JPanel panel = new JPanel();
        panel.add(userText);
        panel.add(zipLabel);
        panel.setBorder(BorderFactory.createEmptyBorder(50, 50, 10, 10));
        panel.setLayout(new GridLayout(0, 1));
        panel.add(submitButton);
        panel.add(clearButton);
        panel.add(isCelsius);


        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Weather app");
        frame.pack();
        frame.setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Button clicked");
    }


}

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Budget extends JFrame implements ActionListener {

    Budget(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Calculate your budget");
        this.setLayout(null);
        this.setSize(1000, 800);
        this.setLocationRelativeTo(null);

        JLabel operationType = new JLabel("Operation Type:");
        operationType.setFont(new Font("Verdana", Font.PLAIN, 18));


        JLabel amount = new JLabel("Amount:");
        amount.setFont(new Font("Verdana", Font.PLAIN, 18));


        JLabel description = new JLabel("Description:");
        description.setFont(new Font("Verdana", Font.PLAIN, 18));

        JLabel totalMoney = new JLabel("Total Money:");
        totalMoney.setFont(new Font("Verdana", Font.PLAIN, 18));

        JButton calculateButton = new JButton();
        calculateButton.setText("Calculate");
        calculateButton.setFont(new Font("Verdana", Font.PLAIN, 18));
        calculateButton.setFocusable(false);

        JButton historyButton = new JButton();
        historyButton.setText(" History  ");
        historyButton.setFont(new Font("Verdana", Font.PLAIN, 18));
        historyButton.setFocusable(false);


        JPanel mainPanel = new JPanel();
        mainPanel.setBackground(new Color(200, 201, 199));
        mainPanel.setBounds(10, 100, 170, 550);
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
        mainPanel.setAlignmentX(Component.LEFT_ALIGNMENT);

        mainPanel.add(Box.createVerticalStrut(50));
        mainPanel.add(operationType);
        mainPanel.add(Box.createVerticalStrut(60));
        mainPanel.add(amount);
        mainPanel.add(Box.createVerticalStrut(60));
        mainPanel.add(description);
        mainPanel.add(Box.createVerticalStrut(60));
        mainPanel.add(totalMoney);
        mainPanel.add(Box.createVerticalStrut(60));
        mainPanel.add(calculateButton);
        mainPanel.add(Box.createVerticalStrut(60));
        mainPanel.add(historyButton);


        String[] operationsArr = {"Income", "Expense"};
        JComboBox operationComboBox = new JComboBox(operationsArr);
        operationComboBox.setFont(new Font("Verdana", Font.PLAIN, 16));


        JPanel operationPanel = new JPanel();
        operationPanel.setBounds(180, 145, 100, 40);
        operationPanel.add(operationComboBox);


        JTextField amountInput = new JTextField();
        amountInput.setPreferredSize(new Dimension(97, 25));
        amountInput.setFont(new Font("Verdana", Font.PLAIN, 18));


        JPanel amountPanel = new JPanel();
        amountPanel.setBounds(180, 228, 103, 30);
        amountPanel.add(amountInput);


        JTextField descriptionInput = new JTextField();
        descriptionInput.setPreferredSize(new Dimension(97, 25));
        descriptionInput.setFont(new Font("Verdana", Font.PLAIN, 18));


        JPanel descriptionPanel = new JPanel();
        descriptionPanel.setBounds(180, 312, 103, 30);
        descriptionPanel.add(descriptionInput);


        JTextField totalOutput = new JTextField();
        totalOutput.setPreferredSize(new Dimension(97, 25));
        totalOutput.setFont(new Font("Verdana", Font.PLAIN, 18));


        JPanel totalPanel = new JPanel();
        totalPanel.setBounds(180, 395, 103, 30);
        totalPanel.add(totalOutput);


        this.add(mainPanel);
        this.add(operationPanel);
        this.add(amountPanel);
        this.add(descriptionPanel);
        this.add(totalPanel);
        this.setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent e) {

    }
}

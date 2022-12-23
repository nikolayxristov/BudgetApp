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

        JLabel operationType = new JLabel("Operation Type:");
        operationType.setFont(new Font("Verdana", Font.PLAIN, 18));


        JLabel amount = new JLabel("Amount:");
        amount.setFont(new Font("Verdana", Font.PLAIN, 18));


        JLabel description = new JLabel("Description:");
        description.setFont(new Font("Verdana", Font.PLAIN, 18));

        JLabel totalMoney = new JLabel("Total Money:");
        totalMoney.setFont(new Font("Verdana", Font.PLAIN, 18));


        JPanel mainPanel = new JPanel();
        mainPanel.setBackground(new Color(200, 201, 199));
        mainPanel.setBounds(10, 100, 170, 300);
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
        mainPanel.setAlignmentX(Component.LEFT_ALIGNMENT);

        mainPanel.add(Box.createVerticalStrut(50));
        mainPanel.add(operationType);
        mainPanel.add(Box.createVerticalStrut(15));
        mainPanel.add(amount);
        mainPanel.add(Box.createVerticalStrut(15));
        mainPanel.add(description);
        mainPanel.add(Box.createVerticalStrut(50));
        mainPanel.add(totalMoney);


        String[] operationsArr = {"Income", "Expense"};
        JComboBox operationComboBox = new JComboBox(operationsArr);
        operationComboBox.setFont(new Font("Verdana", Font.PLAIN, 16));


        JPanel operationPanel = new JPanel();
        operationPanel.setBounds(180, 145, 100, 50);
        operationPanel.add(operationComboBox);

        this.add(mainPanel);
        this.add(operationPanel);
        this.setVisible(true);
    }



    @Override
    public void actionPerformed(ActionEvent e) {

    }
}

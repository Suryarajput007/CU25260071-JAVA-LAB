import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Q10 extends JFrame implements ActionListener {
    JTextField tfAcc = new JTextField(12), tfName = new JTextField(12),
               tfBal = new JTextField("0.00", 12), tfAmt = new JTextField(12);
    JButton deposit = new JButton("Deposit"), withdraw = new JButton("Withdraw"),
            check = new JButton("Check Balance"), clear = new JButton("Clear");

    Q10() {
        super("Mini Banking Application");
        JPanel form = new JPanel(new GridLayout(4, 2, 5, 5));
        form.add(new JLabel("Account Number:"));  form.add(tfAcc);
        form.add(new JLabel("Customer Name:"));   form.add(tfName);
        form.add(new JLabel("Current Balance:")); form.add(tfBal);
        form.add(new JLabel("Amount:"));          form.add(tfAmt);
        JPanel south = new JPanel(new GridLayout(1, 4, 5, 5));
        for (JButton b : new JButton[]{deposit, withdraw, check, clear}) { south.add(b); b.addActionListener(this); }
        ((JPanel) getContentPane()).setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        add(form, BorderLayout.CENTER);
        add(south, BorderLayout.SOUTH);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        Object s = e.getSource();
        if (s == clear) {
            tfAcc.setText(""); tfName.setText(""); tfAmt.setText(""); tfBal.setText("0.00");
            return;
        }
        double bal;
        try {
            bal = Double.parseDouble(tfBal.getText().trim());                 // validate balance
            if (bal < 0) throw new NumberFormatException();
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Current balance must be a valid non-negative number.", "Invalid Input", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (s == check) {
            JOptionPane.showMessageDialog(this, String.format("Account %s (%s)%nBalance: %.2f", tfAcc.getText().trim(), tfName.getText().trim(), bal));
            return;
        }
        double amt;
        try {
            amt = Double.parseDouble(tfAmt.getText().trim());                 // validate amount
            if (amt <= 0) throw new NumberFormatException();
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Amount must be a number greater than 0.", "Invalid Input", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (s == deposit) {
            bal += amt;
            JOptionPane.showMessageDialog(this, String.format("Deposited %.2f%nNew balance: %.2f", amt, bal));
        } else if (amt > bal) {                                               // withdraw only if sufficient funds
            JOptionPane.showMessageDialog(this, "Insufficient balance!", "Withdrawal Failed", JOptionPane.ERROR_MESSAGE);
            return;
        } else {
            bal -= amt;
            JOptionPane.showMessageDialog(this, String.format("Withdrawn %.2f%nNew balance: %.2f", amt, bal));
        }
        tfBal.setText(String.format("%.2f", bal));
        tfAmt.setText("");
    }

    public static void main(String[] args) { SwingUtilities.invokeLater(Q10::new); }
}

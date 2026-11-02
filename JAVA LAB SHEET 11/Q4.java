import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Q4 extends JFrame implements ActionListener {
    String[] subjects = {"English", "Mathematics", "Java", "DBMS", "Computer Networks"};
    JTextField[] tf = new JTextField[5];
    JButton calc = new JButton("Calculate Result");
    JTextArea result = new JTextArea(5, 25);

    Q4() {
        super("Student Marksheet");
        JPanel form = new JPanel(new GridLayout(5, 2, 5, 5));
        for (int i = 0; i < 5; i++) {
            tf[i] = new JTextField(8);
            form.add(new JLabel(subjects[i] + " (0-100):"));
            form.add(tf[i]);
        }
        result.setEditable(false);
        JPanel south = new JPanel(); south.add(calc);
        ((JPanel) getContentPane()).setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        add(form, BorderLayout.NORTH);
        add(new JScrollPane(result), BorderLayout.CENTER);
        add(south, BorderLayout.SOUTH);
        calc.addActionListener(this);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        int total = 0;
        boolean pass = true;
        try {
            for (JTextField f : tf) {
                int m = Integer.parseInt(f.getText().trim());         // may throw NumberFormatException
                if (m < 0 || m > 100) throw new NumberFormatException();
                total += m;
                if (m < 40) pass = false;                             // fail if any subject is below 40
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Enter whole-number marks between 0 and 100 in every field.",
                    "Invalid Input", JOptionPane.ERROR_MESSAGE);
            return;
        }
        double pct = total / 5.0;
        String grade = !pass ? "F" : pct >= 90 ? "O" : pct >= 80 ? "A" : pct >= 70 ? "B" : pct >= 60 ? "C" : pct >= 50 ? "D" : "E";
        result.setText(String.format("Total      : %d / 500%nPercentage : %.2f%%%nGrade      : %s%nStatus     : %s",
                total, pct, grade, pass ? "PASS" : "FAIL"));
    }

    public static void main(String[] args) { SwingUtilities.invokeLater(Q4::new); }
}

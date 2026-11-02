import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Q9 extends JFrame implements ActionListener {
    JTextField tfName = new JTextField(15), tfRoll = new JTextField(15), tfCourse = new JTextField(15);
    String[] levels = {"Excellent", "Very Good", "Good", "Average", "Poor"};
    JRadioButton[] rating = new JRadioButton[5];
    ButtonGroup bg = new ButtonGroup();
    JCheckBox[] areas = {new JCheckBox("Teaching"), new JCheckBox("Laboratory"),
                         new JCheckBox("Course Material"), new JCheckBox("Assignments")};
    JTextArea comments = new JTextArea(4, 25);
    JButton submit = new JButton("Submit"), reset = new JButton("Reset");

    Q9() {
        super("Student Feedback Form");
        JPanel info = new JPanel(new GridLayout(3, 2, 5, 5));
        info.add(new JLabel("Student Name:")); info.add(tfName);
        info.add(new JLabel("Roll Number:"));  info.add(tfRoll);
        info.add(new JLabel("Course:"));       info.add(tfCourse);
        JPanel rp = new JPanel(new FlowLayout(FlowLayout.LEFT));
        rp.setBorder(BorderFactory.createTitledBorder("Overall Rating"));
        for (int i = 0; i < 5; i++) { rating[i] = new JRadioButton(levels[i]); bg.add(rating[i]); rp.add(rating[i]); }
        JPanel cp = new JPanel(new FlowLayout(FlowLayout.LEFT));
        cp.setBorder(BorderFactory.createTitledBorder("Feedback About"));
        for (JCheckBox c : areas) cp.add(c);
        JPanel top = new JPanel(new GridLayout(3, 1, 5, 5));
        top.add(info); top.add(rp); top.add(cp);
        JScrollPane sp = new JScrollPane(comments);
        sp.setBorder(BorderFactory.createTitledBorder("Comments"));
        JPanel south = new JPanel(); south.add(submit); south.add(reset);
        ((JPanel) getContentPane()).setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        add(top, BorderLayout.NORTH);
        add(sp, BorderLayout.CENTER);
        add(south, BorderLayout.SOUTH);
        submit.addActionListener(this);
        reset.addActionListener(this);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == submit) {
            String r = "";
            for (JRadioButton b : rating) if (b.isSelected()) r = b.getText();
            if (tfName.getText().trim().isEmpty() || r.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Please enter the name and choose a rating.", "Missing Data", JOptionPane.WARNING_MESSAGE);
                return;
            }
            StringBuilder sb = new StringBuilder();
            for (JCheckBox c : areas) if (c.isSelected()) sb.append(c.getText()).append(", ");
            String about = sb.length() == 0 ? "None" : sb.substring(0, sb.length() - 2);
            JOptionPane.showMessageDialog(this, "Name     : " + tfName.getText().trim() + "\nRoll No  : " + tfRoll.getText().trim()
                    + "\nCourse   : " + tfCourse.getText().trim() + "\nRating   : " + r + "\nFeedback : " + about
                    + "\nComments : " + comments.getText().trim());
        } else {
            tfName.setText(""); tfRoll.setText(""); tfCourse.setText(""); comments.setText("");
            bg.clearSelection();
            for (JCheckBox c : areas) c.setSelected(false);
        }
    }

    public static void main(String[] args) { SwingUtilities.invokeLater(Q9::new); }
}

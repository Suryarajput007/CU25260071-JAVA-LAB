import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Q5 extends JFrame implements ActionListener {
    JTextField tfName = new JTextField(15);
    JComboBox<String> cbCourse = new JComboBox<>(new String[]{"BCA", "BBA", "B.Tech", "MCA"});
    JRadioButton male = new JRadioButton("Male"), female = new JRadioButton("Female"), other = new JRadioButton("Other");
    ButtonGroup bg = new ButtonGroup();                               // allows only one radio button
    JCheckBox[] subs = {new JCheckBox("Java"), new JCheckBox("Python"), new JCheckBox("DBMS"), new JCheckBox("Networks")};
    JButton submit = new JButton("Submit"), reset = new JButton("Reset");

    Q5() {
        super("Course Selection Form");
        bg.add(male); bg.add(female); bg.add(other);
        JPanel gp = new JPanel(new FlowLayout(FlowLayout.LEFT)); gp.add(male); gp.add(female); gp.add(other);
        JPanel sp = new JPanel(new FlowLayout(FlowLayout.LEFT)); for (JCheckBox c : subs) sp.add(c);
        JPanel form = new JPanel(new GridLayout(4, 2, 5, 5));
        form.add(new JLabel("Student Name:")); form.add(tfName);
        form.add(new JLabel("Course:"));       form.add(cbCourse);
        form.add(new JLabel("Gender:"));       form.add(gp);
        form.add(new JLabel("Subjects:"));     form.add(sp);
        JPanel south = new JPanel(); south.add(submit); south.add(reset);
        ((JPanel) getContentPane()).setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        add(form, BorderLayout.CENTER);
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
            String gender = male.isSelected() ? "Male" : female.isSelected() ? "Female" : other.isSelected() ? "Other" : "";
            if (tfName.getText().trim().isEmpty() || gender.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Please enter the name and select a gender.", "Missing Data", JOptionPane.WARNING_MESSAGE);
                return;
            }
            StringBuilder sb = new StringBuilder();
            for (JCheckBox c : subs) if (c.isSelected()) sb.append(c.getText()).append(" ");
            JOptionPane.showMessageDialog(this, "Name    : " + tfName.getText().trim() + "\nCourse  : " + cbCourse.getSelectedItem()
                    + "\nGender  : " + gender + "\nSubjects: " + (sb.length() == 0 ? "None" : sb.toString().trim()));
        } else {
            tfName.setText("");
            cbCourse.setSelectedIndex(0);
            bg.clearSelection();
            for (JCheckBox c : subs) c.setSelected(false);
        }
    }

    public static void main(String[] args) { SwingUtilities.invokeLater(Q5::new); }
}

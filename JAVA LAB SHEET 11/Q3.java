import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Q3 extends JFrame implements ActionListener {
    JTextField tfUser = new JTextField(15);
    JPasswordField pfPass = new JPasswordField(15);                   // hides typed characters
    JButton login = new JButton("Login"), reset = new JButton("Reset");

    Q3() {
        super("Student Login");
        setLayout(new GridLayout(3, 2, 8, 8));
        ((JPanel) getContentPane()).setBorder(BorderFactory.createEmptyBorder(12, 12, 12, 12));
        add(new JLabel("Username:")); add(tfUser);
        add(new JLabel("Password:")); add(pfPass);
        add(login); add(reset);
        login.addActionListener(this);
        reset.addActionListener(this);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == login) {
            String user = tfUser.getText().trim();
            String pass = new String(pfPass.getPassword());
            if (user.equals("admin") && pass.equals("1234"))          // predefined credentials
                JOptionPane.showMessageDialog(this, "Login successful! Welcome, " + user);
            else
                JOptionPane.showMessageDialog(this, "Invalid username or password", "Login Failed", JOptionPane.ERROR_MESSAGE);
        } else {
            tfUser.setText("");
            pfPass.setText("");
        }
    }

    public static void main(String[] args) { SwingUtilities.invokeLater(Q3::new); }
}

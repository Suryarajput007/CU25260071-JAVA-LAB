import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Q7 extends JFrame implements ActionListener {
    JTextField tfTemp = new JTextField(10);
    JRadioButton c2f = new JRadioButton("Celsius to Fahrenheit", true), f2c = new JRadioButton("Fahrenheit to Celsius");
    ButtonGroup bg = new ButtonGroup();
    JButton convert = new JButton("Convert"), clear = new JButton("Clear");
    JLabel result = new JLabel("Result: ");

    Q7() {
        super("Temperature Converter");
        bg.add(c2f); bg.add(f2c);
        JPanel top = new JPanel(new GridLayout(4, 1, 5, 5));
        JPanel row = new JPanel(new FlowLayout(FlowLayout.LEFT)); row.add(new JLabel("Temperature:")); row.add(tfTemp);
        top.add(row); top.add(c2f); top.add(f2c); top.add(result);
        JPanel south = new JPanel(); south.add(convert); south.add(clear);
        ((JPanel) getContentPane()).setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        add(top, BorderLayout.CENTER);
        add(south, BorderLayout.SOUTH);
        convert.addActionListener(this);
        clear.addActionListener(this);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == convert) {
            try {
                double t = Double.parseDouble(tfTemp.getText().trim());           // validate input
                if (c2f.isSelected()) result.setText(String.format("Result: %.2f °F", (t * 9 / 5) + 32));
                else result.setText(String.format("Result: %.2f °C", (t - 32) * 5 / 9));
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "Please enter a valid number.", "Invalid Input", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            tfTemp.setText("");
            result.setText("Result: ");
            c2f.setSelected(true);
        }
    }

    public static void main(String[] args) { SwingUtilities.invokeLater(Q7::new); }
}

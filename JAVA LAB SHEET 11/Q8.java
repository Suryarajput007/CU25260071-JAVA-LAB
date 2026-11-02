import javax.swing.*;
import java.awt.event.*;
import java.io.IOException;
import java.nio.file.Files;

public class Q8 extends JFrame implements ActionListener {
    JTextArea area = new JTextArea(20, 50);
    JMenuItem miNew = new JMenuItem("New"), miOpen = new JMenuItem("Open"),
              miSave = new JMenuItem("Save"), miExit = new JMenuItem("Exit");

    Q8() {
        super("Simple Notepad");
        JMenu file = new JMenu("File");
        for (JMenuItem m : new JMenuItem[]{miNew, miOpen, miSave, miExit}) { file.add(m); m.addActionListener(this); }
        JMenuBar bar = new JMenuBar();
        bar.add(file);
        setJMenuBar(bar);                                             // attach menu bar
        add(new JScrollPane(area));                                   // scrollable text area
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        Object s = e.getSource();
        JFileChooser fc = new JFileChooser();
        try {
            if (s == miNew) area.setText("");
            else if (s == miOpen && fc.showOpenDialog(this) == JFileChooser.APPROVE_OPTION)
                area.setText(Files.readString(fc.getSelectedFile().toPath()));
            else if (s == miSave && fc.showSaveDialog(this) == JFileChooser.APPROVE_OPTION)
                Files.writeString(fc.getSelectedFile().toPath(), area.getText());
            else if (s == miExit) System.exit(0);
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(this, "File error: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) { SwingUtilities.invokeLater(Q8::new); }
}

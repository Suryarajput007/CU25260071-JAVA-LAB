import java.awt.*;
import java.awt.event.*;

public class Q2 extends Frame implements ActionListener {
    TextField tf1 = new TextField(), tf2 = new TextField(), result = new TextField();
    Button add = new Button("+"), sub = new Button("-"), mul = new Button("*"), div = new Button("/");

    Q2() {
        super("Simple Calculator");
        result.setEditable(false);                                    // result is display only
        Panel top = new Panel(new GridLayout(3, 2, 5, 5));
        top.add(new Label("First number:"));  top.add(tf1);
        top.add(new Label("Second number:")); top.add(tf2);
        top.add(new Label("Result:"));        top.add(result);
        Panel buttons = new Panel(new GridLayout(1, 4, 5, 5));
        for (Button b : new Button[]{add, sub, mul, div}) { buttons.add(b); b.addActionListener(this); }
        add(top, BorderLayout.NORTH);
        add(buttons, BorderLayout.CENTER);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) { dispose(); System.exit(0); }
        });
        setSize(350, 180);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        try {
            double a = Double.parseDouble(tf1.getText().trim());      // may throw NumberFormatException
            double b = Double.parseDouble(tf2.getText().trim());
            double r;
            Object s = e.getSource();
            if (s == add) r = a + b;
            else if (s == sub) r = a - b;
            else if (s == mul) r = a * b;
            else {
                if (b == 0) { result.setText("Cannot divide by zero"); return; }   // division by zero check
                r = a / b;
            }
            result.setText(r == (long) r ? String.valueOf((long) r) : String.valueOf(r));
        } catch (NumberFormatException ex) {
            result.setText("Invalid input");
        }
    }

    public static void main(String[] args) { new Q2(); }
}

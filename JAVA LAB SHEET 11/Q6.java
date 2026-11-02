import java.awt.*;
import java.awt.event.*;

public class Q6 extends Frame implements ActionListener {
    TextField tfId = new TextField(), tfName = new TextField(), tfDesig = new TextField(), tfSalary = new TextField();
    Choice dept = new Choice();
    CheckboxGroup gender = new CheckboxGroup();
    Checkbox male = new Checkbox("Male", gender, false), female = new Checkbox("Female", gender, false);
    Button submit = new Button("Submit"), clear = new Button("Clear");
    TextArea out = new TextArea(7, 30);

    Q6() {
        super("Employee Registration Form");
        for (String d : new String[]{"HR", "IT", "Finance", "Marketing", "Operations"}) dept.add(d);
        Panel form = new Panel(new GridLayout(8, 2, 5, 5));
        form.add(new Label("Employee ID:")); form.add(tfId);
        form.add(new Label("Name:"));        form.add(tfName);
        form.add(new Label("Department:"));  form.add(dept);
        form.add(new Label("Designation:")); form.add(tfDesig);
        form.add(new Label("Salary:"));      form.add(tfSalary);
        form.add(new Label("Gender:"));
        Panel g = new Panel(); g.add(male); g.add(female); form.add(g);
        form.add(submit); form.add(clear);
        add(form, BorderLayout.NORTH);
        add(out, BorderLayout.CENTER);
        submit.addActionListener(this);
        clear.addActionListener(this);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) { dispose(); System.exit(0); }
        });
        setSize(430, 500);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == submit) {
            try {
                double sal = Double.parseDouble(tfSalary.getText().trim());   // validate salary
                Checkbox g = gender.getSelectedCheckbox();
                out.setText("Employee ID : " + tfId.getText() + "\nName        : " + tfName.getText()
                        + "\nDepartment  : " + dept.getSelectedItem() + "\nDesignation : " + tfDesig.getText()
                        + "\nSalary      : " + sal + "\nGender      : " + (g == null ? "Not selected" : g.getLabel()));
            } catch (NumberFormatException ex) {
                out.setText("Error: Salary must be a number.");
            }
        } else {                                                              // Clear button
            tfId.setText(""); tfName.setText(""); tfDesig.setText(""); tfSalary.setText("");
            dept.select(0);
            gender.setSelectedCheckbox(null);
            out.setText("");
        }
    }

    public static void main(String[] args) { new Q6(); }
}

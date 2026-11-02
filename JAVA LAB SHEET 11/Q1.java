import java.awt.*;
import java.awt.event.*;

public class Q1 extends Frame implements ActionListener {
    TextField tfName = new TextField(), tfRoll = new TextField(), tfCourse = new TextField();
    CheckboxGroup gender = new CheckboxGroup();                       // only one gender can be selected
    Checkbox male = new Checkbox("Male", gender, false), female = new Checkbox("Female", gender, false);
    Choice sem = new Choice();                                        // drop-down list
    Button submit = new Button("Submit"), reset = new Button("Reset");
    TextArea out = new TextArea(6, 30);                               // shows submitted data

    Q1() {
        super("Student Registration Form");
        for (int i = 1; i <= 8; i++) sem.add("Semester " + i);
        Panel form = new Panel(new GridLayout(7, 2, 5, 5));
        form.add(new Label("Student Name:")); form.add(tfName);
        form.add(new Label("Roll Number:"));  form.add(tfRoll);
        form.add(new Label("Course:"));       form.add(tfCourse);
        form.add(new Label("Gender:"));
        Panel g = new Panel(); g.add(male); g.add(female); form.add(g);
        form.add(new Label("Semester:"));     form.add(sem);
        form.add(submit); form.add(reset);
        add(form, BorderLayout.NORTH);
        add(out, BorderLayout.CENTER);
        submit.addActionListener(this);                               // register listeners
        reset.addActionListener(this);
        addWindowListener(new WindowAdapter() {                       // close button support
            public void windowClosing(WindowEvent e) { dispose(); System.exit(0); }
        });
        setSize(420, 400);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == submit) {
            Checkbox g = gender.getSelectedCheckbox();
            out.setText("Name    : " + tfName.getText() + "\nRoll No : " + tfRoll.getText()
                    + "\nCourse  : " + tfCourse.getText() + "\nGender  : " + (g == null ? "Not selected" : g.getLabel())
                    + "\nSemester: " + sem.getSelectedItem());
        } else {                                                      // Reset button
            tfName.setText(""); tfRoll.setText(""); tfCourse.setText("");
            gender.setSelectedCheckbox(null);
            sem.select(0);
            out.setText("");
        }
    }

    public static void main(String[] args) { new Q1(); }
}

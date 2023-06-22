import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class StudentRecordSystem extends JFrame implements ActionListener {
    // define the UI components
    JLabel titleLabel, nameLabel, contactLabel, addressLabel, admissionYearLabel, dobLabel;
    JTextField nameTextField, contactTextField, addressTextField, admissionYearTextField, dobTextField;
    JButton addButton, clearButton;

    public StudentRecordSystem() {
        // set up the JFrame
        setTitle("Student Record-Keeping Management System");
        setSize(400, 300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        // create the UI components
        titleLabel = new JLabel("Enter Student Information");
        nameLabel = new JLabel("Name:");
        contactLabel = new JLabel("Contact Information:");
        addressLabel = new JLabel("Address:");
        admissionYearLabel = new JLabel("Admission Year:");
        dobLabel = new JLabel("Date of Birth:");
        nameTextField = new JTextField(20);
        contactTextField = new JTextField(20);
        addressTextField = new JTextField(20);
        admissionYearTextField = new JTextField(20);
        dobTextField = new JTextField(20);
        addButton = new JButton("Add");
        clearButton = new JButton("Clear");

        // add the UI components to the JFrame
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.insets = new Insets(10, 10, 10, 10);
        add(titleLabel, gbc);
        gbc.gridy++;
        add(nameLabel, gbc);
        gbc.gridx++;
        add(nameTextField, gbc);
        gbc.gridx = 0;
        gbc.gridy++;
        add(contactLabel, gbc);
        gbc.gridx++;
        add(contactTextField, gbc);
        gbc.gridx = 0;
        gbc.gridy++;
        add(addressLabel, gbc);
        gbc.gridx++;
        add(addressTextField, gbc);
        gbc.gridx = 0;
        gbc.gridy++;
        add(admissionYearLabel, gbc);
        gbc.gridx++;
        add(admissionYearTextField, gbc);
        gbc.gridx = 0;
        gbc.gridy++;
        add(dobLabel, gbc);
        gbc.gridx++;
        add(dobTextField, gbc);
        gbc.gridx = 0;
        gbc.gridy++;
        add(addButton, gbc);
        gbc.gridx++;
        add(clearButton, gbc);

        // add action listeners to the buttons
        addButton.addActionListener(this);
        clearButton.addActionListener(this);

        // show the JFrame
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == addButton) {
            // add the student record to the database
            // this is where you would write the code to add the student record to a
            // database
            // or to a file, depending on your implementation
            JOptionPane.showMessageDialog(this, "Student record added successfully.");
        } else if (e.getSource() == clearButton) {
            // clear the text fields
            nameTextField.setText("");
            contactTextField.setText("");
            addressTextField.setText("");
            admissionYearTextField.setText("");
            dobTextField.setText("");
        }
    }

    public static void main(String[] args) {
        new StudentRecordSystem();
    }
}
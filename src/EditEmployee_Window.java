import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class EditEmployee_Window extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	JTextField txtId;
	JTextField txtNameSurname;
	JTextField txtWage;
	JPasswordField txtPw;
	JButton btnUpd;

	// LinkedList newList = Login.list;
	Employee currentEmployee;

	public EditEmployee_Window(Employee currentEmployee) {

		super("Cafe Managemnt System -Employee Management-");
		setSize(370, 280);
		setDefaultCloseOperation(HIDE_ON_CLOSE);
		setLocationRelativeTo(null);
		getContentPane().setLayout(null);

		JLabel lblId = new JLabel("Staff ID");
		lblId.setBounds(88, 66, 115, 13);
		getContentPane().add(lblId);

		JLabel lblStaffNamesurname = new JLabel("Staff Name-Surname");
		lblStaffNamesurname.setBounds(88, 89, 115, 13);
		getContentPane().add(lblStaffNamesurname);

		JLabel lblPassword = new JLabel("Password");
		lblPassword.setBounds(88, 112, 115, 13);
		getContentPane().add(lblPassword);

		JLabel lblWage = new JLabel("Wage");
		lblWage.setBounds(88, 135, 115, 13);
		getContentPane().add(lblWage);

		txtId = new JTextField();
		txtId.setBounds(189, 63, 96, 19);
		getContentPane().add(txtId);
		txtId.setColumns(10);
		txtId.setText(currentEmployee.id + "");

		txtNameSurname = new JTextField();
		txtNameSurname.setColumns(10);
		txtNameSurname.setBounds(189, 86, 96, 19);
		getContentPane().add(txtNameSurname);
		txtNameSurname.setText(currentEmployee.nameSurname + "");

		txtWage = new JTextField();
		txtWage.setColumns(10);
		txtWage.setBounds(189, 135, 96, 19);
		getContentPane().add(txtWage);
		txtWage.setText(currentEmployee.wage + "");

		txtPw = new JPasswordField();
		txtPw.setBounds(189, 112, 96, 19);
		getContentPane().add(txtPw);
		txtPw.setText(currentEmployee.password + "");

		btnUpd = new JButton("Update");
		btnUpd.setBounds(88, 187, 85, 21);
		getContentPane().add(btnUpd);

		btnUpd.addActionListener(this);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnUpd) {
			if (txtId.getText().equals("") || txtNameSurname.getText().equals("") || txtPw.getText().equals("")
					|| txtWage.getText().isEmpty()) { // Control if there is any empty field
				JOptionPane.showMessageDialog(this, "Please do not leave any empty fields."); //
			} else {
				Login.list.insert(new Employee(txtId.getText(), txtNameSurname.getText(), txtPw.getText(),
						Double.parseDouble(txtWage.getText()))); // By using LinkedList class's insert method
				this.setVisible(false); // add new element to the list
				new ManageEmployees_Window().setVisible(true); //
			}
		}

	}

}
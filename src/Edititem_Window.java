import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JList;
import javax.swing.DefaultListModel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class Edititem_Window extends JFrame implements ActionListener {
    JTextField txtItemId;
    JTextField txtItemName;
    JTextField txtPrice;
    JButton btnUpd;
    Menu_Item currentItem;
    int index;

    DefaultListModel dlmMenuEdit = Main_Frame.dlmMenu;
    JList listMenuEdit = new JList(dlmMenuEdit);

    public Edititem_Window(Menu_Item currentItem) {
        super("Cafe Managemnt System");
        setSize(370, 280);
        setDefaultCloseOperation(HIDE_ON_CLOSE);
        setLocationRelativeTo(null);
        getContentPane().setLayout(null);

        JLabel lblItemId = new JLabel("Item ID");
        lblItemId.setBounds(88, 39, 74, 13);
        getContentPane().add(lblItemId);

        JLabel lblItemPrice = new JLabel("Item Price");
        lblItemPrice.setBounds(88, 144, 74, 13);
        getContentPane().add(lblItemPrice);

        JLabel lblItemName = new JLabel("Item Name");
        lblItemName.setBounds(88, 88, 74, 13);
        getContentPane().add(lblItemName);

        txtItemId = new JTextField();
        txtItemId.setBounds(156, 36, 96, 19);
        getContentPane().add(txtItemId);
        txtItemId.setColumns(10);
        txtItemId.setText(currentItem.id + "");

        txtItemName = new JTextField();
        txtItemName.setColumns(10);
        txtItemName.setBounds(156, 85, 96, 19);
        getContentPane().add(txtItemName);
        txtItemName.setText(currentItem.name + "");

        txtPrice = new JTextField();
        txtPrice.setColumns(10);
        txtPrice.setBounds(156, 141, 96, 19);
        getContentPane().add(txtPrice);
        txtPrice.setText(currentItem.price + "");

        btnUpd = new JButton("Update");
        btnUpd.setBounds(88, 198, 85, 21);
        getContentPane().add(btnUpd);

        // btnClear = new JButton("Clear");
        // btnClear.setBounds(183, 198, 85, 21);
        // getContentPane().add(btnClear);

        btnUpd.addActionListener(this);
        // btnClear.addActionListener(this);
    }

    // static void showEditItem(int id, String name, double price) {
    // txtItemId.setText(Integer.toString(id));
    // txtItemName.setText(name);
    // txtPrice.setText(Double.toString(price));
    // }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnUpd) {
            currentItem = null;
            if (txtItemId.getText().equals("") || txtItemName.getText().equals("") || txtPrice.equals("")) {
                JOptionPane.showMessageDialog(this, "Please do not leave any empty fields."); //
            } else {
                Main_Frame.tree.insert(new Menu_Item(Integer.parseInt(txtItemId.getText()), txtItemName.getText(),Double.parseDouble(txtPrice.getText())));
                Main_Frame.dlmMenu.clear();
                Main_Frame.tree.inorder(Main_Frame.tree.root);
                this.setVisible(false);
                new ManageMenu_Window().setVisible(true);
            }
        }
    }
}

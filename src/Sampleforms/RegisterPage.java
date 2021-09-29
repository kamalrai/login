//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package Sampleforms;

import java.awt.Color;
import java.awt.Font;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class RegisterPage implements ActionListener {
    JFrame fr = new JFrame("Register Here!");
    JLabel lbl_heading;
    JLabel lbl_firstname;
    JLabel lbl_lastname;
    JLabel lbl_userid;
    JLabel lbl_pass;
    JLabel lbl_Email;
    JLabel lbl_Citizenshipno;
    JLabel lbl_dob;
    JLabel lbl_Address;
    JTextField txt_firstname;
    JTextField txt_lastname;
    JTextField txt_userid;
    JTextField txt_Citizenshipno;
    JTextField txt_dob;
    JTextField txt_Email;
    JTextField txt_Address;
    JPasswordField txt_pass;
    JButton btn_register;
    JButton btn_cancel;
    Font fon1;
    Font fon2;

    public RegisterPage() {
        this.fr.getContentPane().setBackground(Color.darkGray);
        this.fon1 = new Font("helvetica", 1, 22);
        this.fon2 = new Font("helvetica", 1, 18);
        this.lbl_heading = new JLabel("User Registration");
        this.lbl_heading.setFont(this.fon1);
        this.lbl_heading.setForeground(Color.magenta);
        this.lbl_heading.setBounds(120, 10, 250, 40);
        this.fr.add(this.lbl_heading);
        this.lbl_firstname = new JLabel("First name:");
        this.lbl_firstname.setForeground(Color.white);
        this.lbl_firstname.setFont(this.fon2);
        this.lbl_firstname.setBounds(20, 50, 120, 40);
        this.fr.add(this.lbl_firstname);
        this.txt_firstname = new JTextField();
        this.txt_firstname.setBounds(160, 50, 200, 40);
        this.fr.add(this.txt_firstname);
        this.lbl_lastname = new JLabel(" Last Name:");
        this.lbl_lastname.setBounds(20, 100, 120, 40);
        this.lbl_lastname.setForeground(Color.white);
        this.lbl_lastname.setFont(this.fon2);
        this.fr.add(this.lbl_lastname);
        this.txt_lastname = new JTextField();
        this.txt_lastname.setBounds(160, 100, 200, 40);
        this.fr.add(this.txt_lastname);
        this.lbl_dob = new JLabel("Date of Birth:");
        this.lbl_dob.setBounds(20, 150, 120, 40);
        this.lbl_dob.setForeground(Color.white);
        this.lbl_dob.setFont(this.fon2);
        this.fr.add(this.lbl_dob);
        this.txt_dob = new JTextField();
        this.txt_dob.setBounds(160, 150, 200, 40);
        this.fr.add(this.txt_dob);
        this.lbl_Citizenshipno = new JLabel("CitizenShip no:");
        this.lbl_Citizenshipno.setBounds(20, 200, 150, 40);
        this.lbl_Citizenshipno.setForeground(Color.white);
        this.lbl_Citizenshipno.setFont(this.fon2);
        this.fr.add(this.lbl_Citizenshipno);
        this.txt_Citizenshipno = new JTextField();
        this.txt_Citizenshipno.setBounds(160, 200, 200, 40);
        this.fr.add(this.txt_Citizenshipno);
        this.lbl_Address = new JLabel("Address:");
        this.lbl_Address.setBounds(20, 250, 120, 40);
        this.lbl_Address.setForeground(Color.white);
        this.lbl_Address.setFont(this.fon2);
        this.fr.add(this.lbl_Address);
        this.txt_Address = new JTextField();
        this.txt_Address.setBounds(160, 250, 200, 40);
        this.fr.add(this.txt_Address);
        this.lbl_Email = new JLabel("Email ID:");
        this.lbl_Email.setBounds(20, 300, 120, 40);
        this.lbl_Email.setForeground(Color.white);
        this.lbl_Email.setFont(this.fon2);
        this.fr.add(this.lbl_Email);
        this.txt_Email = new JTextField();
        this.txt_Email.setBounds(160, 300, 200, 40);
        this.fr.add(this.txt_Email);
        this.lbl_userid = new JLabel("UserID:");
        this.lbl_userid.setForeground(Color.white);
        this.lbl_userid.setFont(this.fon2);
        this.lbl_userid.setBounds(20, 350, 120, 40);
        this.fr.add(this.lbl_userid);
        this.txt_userid = new JTextField();
        this.txt_userid.setBounds(160, 350, 200, 40);
        this.fr.add(this.txt_userid);
        this.lbl_pass = new JLabel("Password:");
        this.lbl_pass.setForeground(Color.white);
        this.lbl_pass.setFont(this.fon2);
        this.lbl_pass.setBounds(20, 400, 120, 40);
        this.fr.add(this.lbl_pass);
        this.txt_pass = new JPasswordField();
        this.txt_pass.setBounds(160, 400, 200, 40);
        this.fr.add(this.txt_pass);
        this.btn_register = new JButton("Register");
        this.btn_register.setBounds(50, 450, 150, 40);
        this.btn_register.addActionListener(this);
        this.fr.add(this.btn_register);
        this.btn_cancel = new JButton("Cancel");
        this.btn_cancel.setBounds(230, 450, 150, 40);
        this.btn_cancel.addActionListener(this);
        this.fr.add(this.btn_cancel);
        this.fr.setSize(420, 550);
        this.fr.setLayout((LayoutManager)null);
        this.fr.setVisible(true);
    }

    public static void main(String[] args) {
        new RegisterPage();
    }

    public void actionPerformed(ActionEvent e) {
        String firstname = this.txt_firstname.getText();
        String lastname = this.txt_lastname.getText();
        String dob = this.txt_dob.getText();
        String Citizenshipno = this.txt_Citizenshipno.getText();
        String Address = this.txt_Address.getText();
        String Email = this.txt_Email.getText();
        String userid = this.txt_userid.getText();
        String pass = this.txt_pass.getText();
        System.out.println(firstname + " " + lastname + " " + dob + " " + Citizenshipno + "  " + Email + " " + userid + " " + pass);
        if (e.getSource() == this.btn_register) {
            database db = new database();
            String query = "insert into register_table(firstname,lastname,dob,Citizenshipno,Address,Email,id,pass) values ('" + firstname + "','" + lastname + "','" + dob + "','" + Citizenshipno + "','" + Address + "','" + Email + "','" + userid + "','" + pass + "')";
            int ans = db.insert(query);
            if (ans > 0) {
                JOptionPane.showMessageDialog(this.fr, "User created Sucessfully");
            } else {
                JOptionPane.showMessageDialog(this.fr, "Something Went Wrong");
            }
        }

    }
}

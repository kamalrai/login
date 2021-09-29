package Sampleforms;

import java.awt.Color;
import java.awt.Font;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LoginPage implements ActionListener {
    JFrame fr = new JFrame("Login Page");
    JLabel lbl_heading;
    JLabel lbl_userid;
    JLabel lbl_password;
    JTextField txt_username;
    JPasswordField txt_password;
    JButton btn_login;
    JButton btn_cancel;
    JButton btn_reg;
    Font fon1;
    Font fon2;

    public LoginPage() {
        this.fr.getContentPane().setBackground(Color.darkGray);
        this.fon1 = new Font("helvetica", 1, 28);
        this.fon2 = new Font("helvetica", 1, 20);
        this.lbl_heading = new JLabel("Login Here!");
        this.lbl_heading.setForeground(Color.GREEN);
        this.lbl_heading.setFont(this.fon2);
        this.lbl_heading.setBounds(150, 10, 250, 30);
        this.fr.add(this.lbl_heading);
        this.lbl_userid = new JLabel("User ID");
        this.lbl_userid.setForeground(Color.MAGENTA);
        this.lbl_userid.setFont(this.fon2);
        this.lbl_userid.setBounds(50, 50, 100, 40);
        this.fr.add(this.lbl_userid);
        this.txt_username = new JTextField();
        this.txt_username.setFont(this.fon2);
        this.txt_username.setBounds(155, 50, 220, 40);
        this.fr.add(this.txt_username);
        this.lbl_password = new JLabel("Password");
        this.lbl_password.setForeground(Color.RED);
        this.lbl_password.setFont(this.fon2);
        this.lbl_password.setBounds(50, 100, 100, 40);
        this.fr.add(this.lbl_password);
        this.txt_password = new JPasswordField();
        this.txt_password.setFont(this.fon2);
        this.txt_password.setBounds(155, 100, 220, 40);
        this.fr.add(this.txt_password);
        this.btn_login = new JButton("Login");
        this.btn_login.setFont(this.fon2);
        this.btn_login.setBounds(155, 150, 100, 40);
        this.fr.add(this.btn_login);
        this.btn_cancel = new JButton("Cancel");
        this.btn_cancel.setFont(this.fon2);
        this.btn_cancel.setBounds(270, 150, 100, 40);
        this.btn_cancel.addActionListener(this);
        this.fr.add(this.btn_cancel);
        this.btn_reg = new JButton("Register");
        this.btn_reg.setForeground(Color.red);
        this.btn_reg.setBounds(320, 200, 100, 30);
        this.btn_reg.addActionListener(this);
        this.fr.add(this.btn_reg);
        this.fr.setSize(450, 300);
        this.fr.setLayout((LayoutManager)null);
        this.fr.setVisible(true);
    }

    public static void main(String[] args) {
        new LoginPage();
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.btn_reg) {
            new RegisterPage();
        } else if (e.getSource() == this.btn_cancel) {
            this.fr.dispose();
        }

    }
}

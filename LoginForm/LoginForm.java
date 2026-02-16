import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

class MyFrame extends JFrame{
    String user = "surbhi";
    String pass = "1234";

    public MyFrame(){

        setLayout(null);
        getContentPane().setBackground(Color.GRAY);

        JLabel u_label = new JLabel("USERNAME");
        u_label.setBounds(40,30,100,40);
        add(u_label);

        JLabel p_label = new JLabel("PASSWORD");
        p_label.setBounds(40,100,100,40);
        add(p_label);

        JTextField username = new JTextField();
        username.setBounds(160,30,200,40);
        add(username);

        JPasswordField password = new JPasswordField();
        password.setBounds(160,100,200,40);
        add(password);

        JButton login_btn = new JButton("LOGIN");
        login_btn.setBounds(80,170,80,40);
        login_btn.setBackground(Color.BLACK);
        add(login_btn);

        JButton reset_btn = new JButton("RESET");
        reset_btn.setBounds(240,170,80,40);
        reset_btn.setBackground(Color.BLACK);
        add(reset_btn);

        login_btn.addActionListener((ActionEvent e) -> {
            String u_entered = username.getText();
            char[] p = password.getPassword();
            String p_entered = new String(p);
            Arrays.fill(p,' ');
            if(u_entered.equals(user) && p_entered.equals(pass)){
                getContentPane().setBackground(Color.GREEN);
                JLabel l =new JLabel("Login Successfull!");
                l.setBounds(150,70,200,100);
                add(l);
                u_label.setVisible(false);
                p_label.setVisible(false);
                username.setVisible(false);
                password.setVisible(false);
                login_btn.setVisible(false);
                reset_btn.setVisible(false);
            }else{
                getContentPane().setBackground(Color.RED);
                JLabel l =new JLabel("Incorrect Credentials!");
                l.setBounds(150,210,200,40);
                add(l);
            }
        });

        reset_btn.addActionListener((ActionEvent e) -> {
            getContentPane().setBackground(Color.GRAY);
            username.setText("");
            password.setText("");
        });
    }

    
}
public class LoginForm{
    public static void main(String[] args) {
    
        MyFrame frame = new MyFrame();
        frame.setBounds(400,300,400,300);
        frame.setTitle("Login Form");
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}

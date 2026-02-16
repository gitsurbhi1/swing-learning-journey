import java.awt.event.*;
import javax.swing.*;

class MyCalci extends JFrame{

    JLabel n1,n2,r,op;
    JTextField num1,num2,res;
    JButton add,sub,mul,div;

    public MyCalci(){
        setTitle("Calculator");
        setLayout(null);
        setBounds(550,200,220,430);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        n1 = new JLabel("Number1");
        n2 = new JLabel("Number2");
        r = new JLabel("Result");
        op = new JLabel("Choose Operator");
        num1 = new JTextField();
        num2 = new JTextField();
        res = new JTextField();
        add = new JButton("ADD");
        sub = new JButton("SUBTRACT");
        mul = new JButton("MULTIPLY");
        div = new JButton("DIVIDE");

        n1.setBounds(20,30,80,10);
        n2.setBounds(120,30,80,10);
        r.setBounds(70,110,80,10);
        op.setBounds(60,190,100,40);
        num1.setBounds(20,40,80,40);
        num2.setBounds(120,40,80,40);
        res.setBounds(70,120,80,40);
        add.setBounds(20,260,80,40);
        sub.setBounds(120,260,80,40);
        mul.setBounds(20,330,80,40);
        div.setBounds(120,330,80,40);
        
        add(n1);
        add(n2);
        add(r);
        add(op);
        add(num1);
        add(num2);
        add(res);
        add(add);
        add(sub);
        add(mul);
        add(div);

        res.setEditable(false);

        add.addActionListener((ActionEvent e) ->{
            double result = Double.parseDouble(num1.getText()) + Double.parseDouble(num2.getText());
            res.setText(String.valueOf(result)); 
        });
        sub.addActionListener((ActionEvent e) ->{
            double result = Double.parseDouble(num1.getText()) - Double.parseDouble(num2.getText());
            res.setText(String.valueOf(result)); 
        });
        mul.addActionListener((ActionEvent e) ->{
            double result = Double.parseDouble(num1.getText()) * Double.parseDouble(num2.getText());
            res.setText(String.valueOf(result));  
        });
        div.addActionListener((ActionEvent e) ->{
            double result = Double.parseDouble(num1.getText()) / Double.parseDouble(num2.getText());
            res.setText(String.valueOf(result));  
        });

        setVisible(true);
    }    
}
public class Calculator {
    public static void main(String[] args) {
        MyCalci m = new MyCalci();
    }
}

import java.awt.*;
import javax.swing.*;


class MyRegForm extends JFrame{

    JLabel n,e,p,g,s,c,a;
    JTextField name,email;
    JPasswordField pass;
    JRadioButton g_male,g_female,g_other;
    JCheckBox skill_java,skill_python,skill_html,skill_sql;
    JComboBox<String> country;
    JTextArea about;
    JButton submit,clear;

    public MyRegForm(){

        getContentPane().setBackground(Color.GRAY);

        setTitle("Student Registration Form");
        setSize(400,620);
        setLayout(null);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        n = new JLabel("Name:");
        n.setBounds(40,20,70,20);
        add(n);
        name =new JTextField();
        name.setBounds(140,20,200,20);
        add(name);

        e = new JLabel("E-mail:");
        e.setBounds(40,60,70,20);
        add(e);
        email =new JTextField();
        email.setBounds(140,60,200,20);
        add(email);

        p = new JLabel("Password:");
        p.setBounds(40,100,70,20);
        add(p);
        pass =new JPasswordField();
        pass.setBounds(140,100,200,20);
        add(pass);

        g = new JLabel("Gender:");
        g.setBounds(40,140,70,20);
        add(g);
        g_male = new JRadioButton("Male");
        g_male.setBounds(140,140,70,20);
        add(g_male);
        g_female = new JRadioButton("Female");
        g_female.setBounds(140,180,70,20);
        add(g_female);
        g_other = new JRadioButton("Other");
        g_other.setBounds(140,220,70,20);
        add(g_other);
        ButtonGroup bg = new ButtonGroup();
        bg.add(g_male);
        bg.add(g_female);
        bg.add(g_other);

        s = new JLabel("Skills:");
        s.setBounds(40,260,70,20);
        add(s);
        skill_java = new JCheckBox("Java");
        skill_java.setBounds(140,260,70,20);
        add(skill_java);
        skill_python = new JCheckBox("Python");
        skill_python.setBounds(140,300,70,20);
        add(skill_python);
        skill_html = new JCheckBox("HTML");
        skill_html.setBounds(140,340,70,20);
        add(skill_html);
        skill_sql = new JCheckBox("SQL");
        skill_sql.setBounds(140,380,70,20);
        add(skill_sql);

        c = new JLabel("Country:");
        c.setBounds(40,420,70,20);
        add(c);
        String[] items = {"Select Country","India","Pakistan","China","Japan"};
        country = new JComboBox<>(items);
        country.setBounds(140,420,120,20);
        country.setSelectedItem("Select Country");
        country.setEditable(true);
        add(country);

        a = new JLabel("About:");
        a.setBounds(40,460,70,20);
        add(a);
        about = new JTextArea();
        about.setLineWrap(true);
        JScrollPane sp = new JScrollPane(about);
        sp.setBounds(140,460,200,60);
        add(sp);
        
        submit = new JButton("Submit");
        submit.setBounds(90,540,90,20);
        add(submit);
        clear = new JButton("Clear");
        clear.setBounds(220,540,90,20);
        add(clear);

        submit.addActionListener( f-> {
            String skls = "", gender = "";
            if(skill_java.isSelected())
                skls += "Java ";
            if(skill_python.isSelected())
                skls += "Python ";
            if(skill_html.isSelected())
                skls += "HTML ";
            if(skill_sql.isSelected())
                skls += "SQL ";
            if(g_male.isSelected())
                gender = "Male";
            else if(g_female.isSelected())
                gender = "Female";
            else if(g_other.isSelected())
                gender = "Other";
            if(!name.getText().equals("") && !email.getText().equals("") && bg.getSelection()!=null && !skls.equals("") && !country.getSelectedItem().equals("Select Country")){
                StringBuilder sb = new StringBuilder();
                sb.append("Registration Successful!\n\n");
                sb.append("Name: ").append(name.getText()).append("\n");
                sb.append("Email: ").append(email.getText()).append("\n");
                sb.append("Gender: ").append(gender).append("\n");
                sb.append("Skills: ").append(skls).append("\n");
                sb.append("Country: ").append(country.getSelectedItem()).append("\n");
                sb.append("About: ").append(about.getText()).append("\n");
                JOptionPane.showMessageDialog(this, sb.toString());
            } else{
                JOptionPane.showMessageDialog(this, "Please Enter All Details!!");
            }
        } );

        clear.addActionListener( f -> {
            name.setText("");
            email.setText("");
            pass.setText("");
            about.setText("");
            bg.clearSelection();
            skill_java.setSelected(false);
            skill_python.setSelected(false);
            skill_html.setSelected(false);
            skill_sql.setSelected(false);
            country.setSelectedItem("Select Country");
        } );


        setVisible(true);
    }

}

public class RegistrationForm {
    public static void main(String[] args) {
        MyRegForm rf = new MyRegForm();
    }
}

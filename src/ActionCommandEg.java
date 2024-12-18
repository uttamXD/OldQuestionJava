import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ActionCommandEg extends JFrame implements ActionListener{
    JLabel l1;
    JButton b1;
    JTextField t1;

    public ActionCommandEg(){
        super("Handling Action Event");
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        l1 = new JLabel("Click on button to get the result.");
        t1 = new JTextField(20);
        b1 = new JButton("Click me!");
        b1.addActionListener(this);

        setLayout(new FlowLayout(FlowLayout.CENTER, 150, 10));
        add(l1);
        add(t1);
        add(b1);

        setSize(400,400);
        setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e){
        String str = e.getActionCommand();
        t1.setText("You clicked: " + str);
    }

    public static void main(String[] args) {
        new ActionCommandEg();
    }
}



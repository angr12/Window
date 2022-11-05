import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class ButtonPanel extends JPanel{
    JButton b1 = new JButton("Press me");
    JButton b2 = new JButton("Press to enter password");
//    JButton b3 = new JButton("Third Button");

    public ButtonPanel() {
        setLayout(new GridLayout(2,2)); // One row, one column
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Button Pressed");
            }
        });
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                System.out.println("Second button pressed");
            }
        });

//        b3.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                System.out.println("Third Button Pressed");
//            }
//        });
        add(b1);
        add(b2);
//        add(b3);

    }
}

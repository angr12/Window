// MainMenu is a JMenuBar that also implements the ActionListener interface by
// having a concrete actionPerformed method

import javax.swing.*;
import java.awt.event.*;

public class MainMenu extends JMenuBar implements ActionListener {
    JMenu menu;         // One menu
    JMenu submenu;
    JMenuItem item;     // Which has one item
    JMenuItem item2;
    JMenuItem item3;
    public MainMenu(){
        menu=new JMenu("The Menu");
        submenu = new JMenu("A submenu");

        item=new JMenuItem("Item 1");
        item2 = new JMenuItem("Item 2");
        item3 = new JMenuItem("Press to enter text");
        item.addActionListener(this);
        item2.addActionListener(this);
        item3.addActionListener(this);

        add(menu);                          // Add the JMenu to the JMenuBar
        menu.add(item);                     // Add the JMenuItem to the JMenu
        menu.addSeparator();
        menu.add(item2);
        menu.addSeparator();

        // configure submenu
        submenu.add(item3);
        menu.add(submenu);

        // Add actionlistener to item 2
        item2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Main Menu Item 2 Pressed");
            }
        });


        // Add actionlistener to item 3 to take in a typed input
        item3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
//                System.out.println("Testing"); // for debugging



            }
        });
    }

    @Override
    // If 'this' is set as the ActionListener to all menu items, this method will
    // be called whenever any menu item is selected, but the ActionEvent
    // command will be the text of the menu item selected
    public void actionPerformed(ActionEvent e) {
        System.out.println(e.getActionCommand());
    }
}




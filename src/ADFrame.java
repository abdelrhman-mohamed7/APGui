import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;

public class ADFrame extends JFrame {
    JButton addButton, delButton, updButton;
    ADFrame(){
        this.setVisible(true);

        this.setSize(500, 500);
        this.setTitle("Admin");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ImageIcon image = new ImageIcon("Admin.png");
        this.setIconImage(image.getImage());
        this.getContentPane().setBackground(new Color(255, 255, 255));
        this.setLayout(null);
        this.setExtendedState(JFrame.MAXIMIZED_BOTH); 

        addButton = new JButton("Add Account");
        // addButton.addActionListener(this);
        addButton.setSize(300, 100); 
        addButton.setFocusable(false);
        addButton.setFont(new Font("Comic Sans", Font.BOLD,25));

        delButton = new JButton("Delete Account");
        // delButton.addActionListener(this);
        delButton.setSize(300, 100);
        delButton.setFocusable(false); 
        delButton.setFont(new Font("Comic Sans", Font.BOLD,25));
        
        updButton = new JButton("Update Account");
        // updButton.addActionListener(this);
        updButton.setSize(300, 100);
        updButton.setFocusable(false); 
        updButton.setFont(new Font("Comic Sans", Font.BOLD,25));

        
        
        int frameWidth = this.getWidth();
        int addButtonWidth = addButton.getWidth();
        int delButtonWidth = delButton.getWidth();
        int updButtonWidth = delButton.getWidth();
        int position1 = (frameWidth - addButtonWidth) / 2;
        int position2 = (frameWidth - delButtonWidth) / 2;
        int position3 = (frameWidth - updButtonWidth) / 2;
        
        addButton.setLocation(position1, 375);
        delButton.setLocation(position2, 500);
        updButton.setLocation(position3, 625);
        this.add(addButton);
        this.add(delButton);
        this.add(updButton);
    }
}

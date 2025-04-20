import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;

public class USFrame extends JFrame {
    JButton depButton, witButton, cheButton;
    USFrame(){
        this.setVisible(true);

        this.setSize(500, 500);
        this.setTitle("User");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ImageIcon image = new ImageIcon("User.png");
        this.setIconImage(image.getImage());
        this.getContentPane().setBackground(new Color(255, 255, 255));
        this.setLayout(null);
        this.setExtendedState(JFrame.MAXIMIZED_BOTH); 

        depButton = new JButton("Deposit");
        // depButton.addActionListener(this);
        depButton.setSize(300, 100); 
        depButton.setFocusable(false);
        depButton.setFont(new Font("Comic Sans", Font.BOLD,25));

        witButton = new JButton("Withdrawal");
        // witButton.addActionListener(this);
        witButton.setSize(300, 100);
        witButton.setFocusable(false); 
        witButton.setFont(new Font("Comic Sans", Font.BOLD,25));
        
        cheButton = new JButton("Checking Balance");
        // cheButton.addActionListener(this);
        cheButton.setSize(300, 100);
        cheButton.setFocusable(false); 
        cheButton.setFont(new Font("Comic Sans", Font.BOLD,25));

        
        
        int frameWidth = this.getWidth();
        int depButtonWidth = depButton.getWidth();
        int witButtonWidth = witButton.getWidth();
        int cheButtonWidth = witButton.getWidth();
        int position1 = (frameWidth - depButtonWidth) / 2;
        int position2 = (frameWidth - witButtonWidth) / 2;
        int position3 = (frameWidth - cheButtonWidth) / 2;
        
        depButton.setLocation(position1, 375);
        witButton.setLocation(position2, 500);
        cheButton.setLocation(position3, 625);
        this.add(depButton);
        this.add(witButton);
        this.add(cheButton);
    }

}

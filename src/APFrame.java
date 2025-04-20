import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;

public class APFrame extends JFrame implements ActionListener {
    APLable APlable = new APLable(); 
    JButton adminButton, userButton; 
    APFrame(){
        ImageIcon icon1 = new ImageIcon("Admin.png");
        ImageIcon icon2 = new ImageIcon("User.png");
        
        this.setVisible(true);
        
        this.setSize(500, 500);
        this.setTitle("ATM Simulation System");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ImageIcon image = new ImageIcon("Nu.png");
        this.setIconImage(image.getImage());
        this.getContentPane().setBackground(new Color(255, 255, 255));
        this.setLayout(null);
        this.setExtendedState(JFrame.MAXIMIZED_BOTH); 
        
        
        adminButton = new JButton("Admin");
        adminButton.addActionListener(this);
        adminButton.setSize(300, 100); 
        adminButton.setFocusable(false);
        // adminButton.setIcon(icon1);
        // adminButton.setHorizontalTextPosition(JButton.CENTER);
        // adminButton.setVerticalTextPosition(JButton.BOTTOM);
        adminButton.setFont(new Font("Comic Sans", Font.BOLD,25));
        
        userButton = new JButton("User");
        userButton.addActionListener(this);
        userButton.setSize(300, 100);
        userButton.setFocusable(false); 
        // userButton.setIcon(icon2);
        // userButton.setHorizontalTextPosition(JButton.CENTER);
        // userButton.setVerticalTextPosition(JButton.BOTTOM);
        userButton.setFont(new Font("Comic Sans", Font.BOLD,25));
        
        
        int frameWidth = this.getWidth();
        int adminButtonWidth = adminButton.getWidth();
        int userButtonWidth = userButton.getWidth();
        int position1 = (frameWidth - adminButtonWidth) / 2;
        int position2 = (frameWidth - userButtonWidth) / 2;
        
        adminButton.setLocation(position1, 425);
        userButton.setLocation(position2, 550);
        this.add(adminButton);
        this.add(userButton);
        
        this.add(APlable);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == adminButton){
            // this.dispose();
            ADFrame adFrame = new ADFrame();
            
        }
        else if (e.getSource() == userButton){
            // this.dispose();
            USFrame usFrame = new USFrame();
            
        }
    }
}



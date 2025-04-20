import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.ImageIcon;

//for the frame.
public class APFrame extends JFrame {
    APLable APlable = new APLable(); 
    APFrame(){
        this.setVisible(true);
        this.setSize(600,600);
        this.setTitle("ATM Simulation System");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ImageIcon image = new ImageIcon("Nu.png");
        this.setIconImage(image.getImage());
        this.getContentPane().setBackground(new Color(255,255,255));
        this.setLayout(null);
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        this.add(APlable);
    }
}

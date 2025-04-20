import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class APLable extends JLabel {
    APLable(){
     ImageIcon image = new ImageIcon("Nu.png");
        this.setIcon(image);
        this.setBounds(0, 0, 300, 200);
    }
}

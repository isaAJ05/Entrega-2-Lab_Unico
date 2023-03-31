
package ImagenesBJK;

import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Natalia
 */
public class image extends JLabel{
    
    private int x,y;
    private final String path;
    
    public image(JPanel panel, String path){
        this.path=path;
        this.x=panel.getWidth();
        this.y=panel.getHeight();
        this.setSize(x,y);
        
    }
    
}


package comoquierapabon;

import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;



public class comoquieraeduar extends JFrame implements ActionListener {

    static JLabel tx=new JLabel();
    
    public comoquieraeduar(){
        setExtendedState(MAXIMIZED_BOTH);
        tx.setText("fhgdf");
        add(tx);
        
        setVisible(true);
    }

    
    
    @Override
    public void actionPerformed(ActionEvent e) {
       
    }
    
    
    
}

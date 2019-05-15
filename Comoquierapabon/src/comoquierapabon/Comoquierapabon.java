
package comoquierapabon;

import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class Comoquierapabon extends JFrame implements ActionListener{

    public static JButton BTON = new JButton("TOCAME ;v");
    
    public Comoquierapabon(){

        setExtendedState(MAXIMIZED_BOTH);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        BackgroundImage imagen=new BackgroundImage(image, BackgroundRepeat.SPACE, BackgroundRepeat.SPACE, BackgroundPosition.CENTER, BackgroundSize.DEFAULT)
        imagen.setBounds(50, 50, 50, 580);
        ImageIcon icono=new ImageIcon("pulpo.png");
        Background fonod;
        fonod = new Background()
        imagen.setIcon(icono);
        add(imagen);
        
        
        setVisible(true);
    }
    
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        new Comoquierapabon();
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand().equalsIgnoreCase(BTON.getText())){
            new comoquieraeduar().setVisible(true);
            dispose();
        }
        
    }
    
}

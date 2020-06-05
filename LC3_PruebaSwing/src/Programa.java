
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Zaragoza Angel Gabriel
 */
public class Programa {

    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Hola", "Changos", JOptionPane.INFORMATION_MESSAGE);
        
        JFrame ventana = new JFrame("Primera ventana");
        //ventana.setSize(200, 300);        
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setBounds(0, 0, 300, 200);
        ventana.setLocationRelativeTo(null);
        
        
        
        JButton boton1 = new JButton("Aceptar");
        ventana.add(boton1);
        ventana.setVisible(true);
    }

}

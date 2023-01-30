package graficos;
import java.awt.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class Grafico extends JFrame {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Grafico frame = new Grafico();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the frame.
     */
    public Grafico() {
    	
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);
        setBounds(0,0,800,600);
    }
    
    public void paint (Graphics g)
    {
        super.paint(g);

        g.setColor (Color.red);
        g.fillRect (50, 270, 50, 70);
        g.fillRoundRect (650, 270, 50, 70, 6, 6);
        g.fillOval (350, 470, 50, 70);
        
    }
    
}

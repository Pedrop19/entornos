package gui;

import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class fondo extends JPanel {

	/**
	 * Create the panel.
	 */
	public fondo() {

	}
	

    @Override
    public void paint(Graphics g){
        Dimension dimension = this.getSize();
        ImageIcon icon = new ImageIcon(getClass().getResource("/imagenes/fondo.jpg"));
        g.drawImage(icon.getImage(), 0, 0, dimension.width, dimension.height, null);
        setOpaque(false);
        super.paintChildren(g);
    }

}

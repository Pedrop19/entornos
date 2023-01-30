package graficos;

import javax.swing.JFrame;

public class CuatroVentanas {
	
	public static void main(String[] args) {
    	
		Ventana();
		Ventana1();
		Ventana2();
		Ventana3();
        Ventana4();
	}
	
	public static void Ventana() {
        JFrame frame = new JFrame("Centro");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400,200);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
	}
	public static void Ventana1(){
        JFrame frame = new JFrame("Arriba Izquierda");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400,200);
        frame.setLocation(0,0);
        frame.setVisible(true);
	}
	
	public static void Ventana2(){
        JFrame frame = new JFrame("Arriba Derecha");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400,200);
        frame.setLocation(1050,0);
        frame.setVisible(true);
	}
	
	public static void Ventana3(){
        JFrame frame = new JFrame("Abajo Izquierda");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400,200);
        frame.setLocation(0,900);
        frame.setVisible(true);
	}
	
	public static void Ventana4(){
        JFrame frame = new JFrame("Abajo Derecha");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400,200);
        frame.setLocation(1050 ,900);
        frame.setVisible(true);
	}
}

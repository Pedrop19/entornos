package Personal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {

	private static String CONTROLADOR = "com.mysql.cj.jdbc.Driver";
	private static String URL = "jdbc:mysql://localhost:3306/pacientes";
	private static String USUARIO = "root";
	private static String CLAVE = "";
	
	public Conexion (String URL) {
		this.CONTROLADOR = "com.mysql.cj.jdbc.Driver";
		this.URL = URL;
		this.USUARIO = "root";
		this.CLAVE = "";
	}
	
	static {
		try {
			Class.forName(CONTROLADOR);
		} catch (ClassNotFoundException e) {
			System.out.println("Error al cargar el controlador");
			e.printStackTrace();
		}
	}
	
	public Connection conectar() {
		Connection conexion = null;
		
		try {
			conexion = DriverManager.getConnection(URL, USUARIO, CLAVE);
			System.out.println("Conexión con la BBDD OK");

		} catch (SQLException e) {
			System.out.println("Error en la conexión");
			e.printStackTrace();
		}
		
		return conexion;
	}
	
}
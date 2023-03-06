package Personal;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestConexion {
	public static void main(String[] args) {
		
		Conexion conexion = new Conexion("jdbc:mysql://localhost:3306/pacientes");
		Conexion conexion2 = new Conexion("jdbc:mysql://localhost:3306/tratamientos");
		Conexion conexion3 = new Conexion("jdbc:mysql://localhost:3306/medicamentos");

		Connection cn = null;
		Connection cn2 = null;
		Connection cn3 = null;
		Statement stm = null;
		ResultSet rs = null;
		
		try {
			
			cn = conexion.conectar();
			cn2 = conexion2.conectar();
			cn3 = conexion3.conectar();
			
			stm = cn.createStatement();
			rs = stm.executeQuery("select apellido1, apellido2, nombre from alumno\r\n"
					+ "order by apellido1, apellido2, nombre desc;");
			
			System.out.println(rs.next());
			
			while (rs.next()) {
			String apellido1 = rs.getString(1);
			String apellido2 = rs.getString(2);
			String nombre = rs.getString(3);
				
				
			System.out.println(apellido1 + " - " + apellido2 + " - " + nombre);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
			
		} finally {
			try {
				if (rs!= null) {
					rs.close();
				}
				
				if (stm != null) {
					stm.close();
				}
				
				if (cn != null) {
					cn.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		
	}
}
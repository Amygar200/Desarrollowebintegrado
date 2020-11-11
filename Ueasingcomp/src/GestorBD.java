import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class GestorBD {
	private Connection conexion = null;
	private Statement stm = null;
	private ResultSet ueaResultSet;
	private Integer clave, trimestre;
	private String nombre, requisito, telefono,direccion,observacion;

	public ArrayList<Uea> leerUeas() {
		ArrayList<Uea> ueas = new ArrayList<Uea>();
		Uea ueaHallada;
		try {
			ConectaBD conectaBD = new ConectaBD();
			conexion = conectaBD.getConexion();
			stm = conexion.createStatement();
			ueaResultSet = stm.executeQuery("select * from utp");
			if (!ueaResultSet.next()) {
				System.out.println(" No se encontraron registros");
				conexion.close();
				return null;
			} else {
				do {
					clave = ueaResultSet.getInt("clave");
					nombre = ueaResultSet.getString("nombre");
					trimestre = ueaResultSet.getInt("trimestre");
					requisito = ueaResultSet.getString("requisito");
					telefono = ueaResultSet.getString("telefono");
					direccion = ueaResultSet.getString("direccion");
					observacion = ueaResultSet.getString("observacion");
					
					ueaHallada = new Uea(clave, nombre, trimestre, requisito, telefono,direccion,observacion);
					ueas.add(ueaHallada);
				} while (ueaResultSet.next());
				conexion.close();
				return ueas;
			}
		} catch (Exception e) {
			System.out.println("Error en la base de datos.");
			e.printStackTrace();
			return null;
		}
	}
}

package mx.uam.ayd.sgp.persistencia;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import mx.uam.ayd.sgp.modelo.Usuario;



public class DAOUsuario {
	
	/**
	 * Accede a la base de datos para identificar al usuario y la contraseņa
	 * @param usuario
	 * @param contraseņa
	 * @return
	 */
	
	public Usuario Autentifica(String usuario, String contraseņa) {
		System.out.println("holi");
		
		Usuario user = null;
		try {
			
			// Crea el statement
			Statement statement = ManejadorBD.dameConnection().createStatement();
			// Recibe los resutados
			ResultSet rs = statement.executeQuery(
					"SELECT * FROM Usuarios WHERE usuario='" + usuario + "'	AND contraseņa='" + contraseņa + "'");
			if (rs.next()) {
				
				// Crea una nueva instancia del objeto
				user = new Usuario(rs.getString("usuario"), rs.getString("contraseņa"), rs.getString("tipoCuenta"));
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return user;
	}
}

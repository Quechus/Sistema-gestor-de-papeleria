package mx.uam.ayd.sgp.persistencia;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import mx.uam.ayd.sgp.modelo.Usuario;



public class DAOUsuario {
	
	public Usuario Autentifica(String usuario, String contrase�a) {
		System.out.println("holi");
		
		Usuario user = null;
		try {
			
			// Crea el statement
			Statement statement = ManejadorBD.dameConnection().createStatement();
			// Recibe los resutados
			ResultSet rs = statement.executeQuery(
					"SELECT * FROM Usuarios WHERE usuario='" + usuario + "'	AND contrase�a='" + contrase�a + "'");
			if (rs.next()) {
				
				// Crea una nueva instancia del objeto
				user = new Usuario(rs.getString("usuario"), rs.getString("contrase�a"), rs.getString("tipoCuenta"));
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return user;
	}
}

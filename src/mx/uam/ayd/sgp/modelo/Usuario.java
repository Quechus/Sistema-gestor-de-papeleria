package mx.uam.ayd.sgp.modelo;

public class Usuario {
	private String usuario;
	private String contrase�a;
	private String tipoCuenta;
	
	public Usuario(String usuario, String contrase�a, String tipoCuenta){
		this.contrase�a = contrase�a;
		this.usuario = usuario;
		this.tipoCuenta = tipoCuenta;
		
	}
	
	public String getUsuario(){
		return usuario;
	}
	public String getContrase�a(){
		return contrase�a;
	}
	public String getTipoCuenta() {
		return tipoCuenta;
	}
	
	

}

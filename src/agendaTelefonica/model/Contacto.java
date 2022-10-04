package agendaTelefonica.model;

/**
 * esta clase representa los contactos
 * @author galvi
 *
 */
public class Contacto {

	private String direccion;
	private String telefono;
	private String nombre;
	private String alias;
	private String email;

	/**
	 * constructor de la clase contacto
	 * @param direccion
	 * @param telefono
	 * @param nombre
	 * @param alias
	 * @param email
	 */
	public Contacto(String direccion, String telefono, String nombre, String alias, String email) {
		super();
		this.direccion = direccion;
		this.telefono = telefono;
		this.nombre = nombre;
		this.alias = alias;
		this.email = email;
	}

	//get de direccion
	public String getDireccion() {
		return direccion;
	}
	//set de direccion
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	//get de telefono
	public String getTelefono() {
		return telefono;
	}
	//actualizar telefono
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	//obtener nombre
	public String getNombre() {
		return nombre;
	}
	//actualizar nombre
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	//obtener alias
	public String getAlias() {
		return alias;
	}
	//actualizar alias
	public void setAlias(String alias) {
		this.alias = alias;
	}
	//obtener email
	public String getEmail() {
		return email;
	}
	//actualizar Email
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * To string de contacto, para imprimir
	 */
	@Override
	public String toString() {
		return "Contacto [direccion=" + direccion + ", telefono=" + telefono + ", nombre=" + nombre + ", alias=" + alias
				+ ", email=" + email + "]";
	}
}

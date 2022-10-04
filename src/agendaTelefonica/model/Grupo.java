package agendaTelefonica.model;

/**
 * esta clase contiene el grupo
 * @author galvi
 *
 */
public class Grupo {

	private String nombre;
	private Categoria categoria;

	/**
	 * constructor de la clase grupo
	 *
	 * @param nombre
	 * @param categoria
	 */
	public Grupo(String nombre, Categoria categoria) {
		super();
		this.nombre = nombre;
		this.categoria = categoria;
	}

	// get de nombre
	public String getNombre() {
		return nombre;
	}

	// set de nombre
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	// get de categoria de grupo
	public Categoria getCategoria() {
		return categoria;
	}

	// set de categoria de grupo
	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	/**
	 * to string de la clase grupo
	 */
	@Override
	public String toString() {
		return "Grupo [nombre=" + nombre + ", categoria=" + categoria + "]";
	}

}

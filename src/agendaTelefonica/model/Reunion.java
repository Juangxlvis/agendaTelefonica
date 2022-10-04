package agendaTelefonica.model;

/**
 * Esta es la clase reunion
 * @author galvi
 *
 */
public class Reunion {

	private String descripcion;
	private String fecha;
	private String hora;

	/**
	 * constructor de la clase reunion
	 *
	 * @param descripcion
	 * @param fecha
	 * @param hora
	 */
	public Reunion(String descripcion, String fecha, String hora) {
		super();
		this.descripcion = descripcion;
		this.fecha = fecha;
		this.hora = hora;
	}

	// Get de descripcion
	public String getDescripcion() {
		return descripcion;
	}

	// set de descripcion
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	// get de fecha
	public String getFecha() {
		return fecha;
	}

	// set de fecha
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	// get de hora
	public String getHora() {
		return hora;
	}

	// set de hora
	public void setHora(String hora) {
		this.hora = hora;
	}

	/**
	 * to string de la clase reunion
	 */
	@Override
	public String toString() {
		return "Reunion [descripcion=" + descripcion + ", fecha=" + fecha + ", hora=" + hora + "]";
	}

}

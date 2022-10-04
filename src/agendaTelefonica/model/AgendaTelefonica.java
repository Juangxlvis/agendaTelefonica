package agendaTelefonica.model;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Clase que representa a la agenda telefonica
 * @author Juan Galvis
 *
 */
public class AgendaTelefonica {

	private Contacto [] listaContactos;
	private Reunion  [] listaReuniones;
	private Grupo    [] listaGrupos;

	/**
	 * Constructor de la clase agendaTelefonica
	 */
	public AgendaTelefonica() {
		super();
	}
	//get de la lista de grupos
	public Grupo[] getListaGrupos() {
		return listaGrupos;
	}
	//set de la lista de grupos
	public void setListaGrupos(Grupo[] listaGrupos) {
		this.listaGrupos = listaGrupos;
	}
	//get de la lista de reuniones
	public Reunion[] getListaReuniones() {
		return listaReuniones;
	}
	//set de la lista de reuniones
	public void setListaReuniones(Reunion[] listaReuniones) {
		this.listaReuniones = listaReuniones;
	}
	//get de la lista de contactos
	public Contacto[] getListaContactos() {
		return listaContactos;
	}
	//set de la lista de contactos
	public void setListaContactos(Contacto[] listaContactos) {
		this.listaContactos = listaContactos;
	}
	/**
	 * To string de la clase agendaTelefonica
	 */
	@Override
	public String toString() {
		return "AgendaTelefonica [listaContactos=" + Arrays.toString(listaContactos) + ", listaReuniones="
				+ Arrays.toString(listaReuniones) + ", listaGrupos=" + Arrays.toString(listaGrupos) + "]";
	}
	/**
	 * metodo para añadir un contacto a la agenda o lista de contactos
	 * @param nuevoContacto
	 * @return
	 */
	public String aniadirContacto(Contacto nuevoContacto){

		String mensaje = "";
		int posicionDisponible = -1;
		@SuppressWarnings("unused")
		Contacto contactoEncontrado = null;

		try {
			contactoEncontrado = verificarExisteContacto(nuevoContacto);
			posicionDisponible = obtenerPosicionDisponibleContacto();
			listaContactos[posicionDisponible] = nuevoContacto;
			mensaje = "El contacto fue añadido exitosamente";
		} catch (ContactoException e) {
			mensaje = e.getMessage();
		}
		return mensaje;
	}
	/**
	 * metodo para obtener una posicion disponible en la lista de contactos
	 * @return
	 * @throws ContactoException
	 */
	private int obtenerPosicionDisponibleContacto() throws ContactoException {

		int posicionDisponible = -1;

		for (int i = 0; i < listaContactos.length && posicionDisponible == -1; i++) {
			if(listaContactos[i] == null){
				posicionDisponible = i;
			}
		}
		if(posicionDisponible == -1){
			throw new ContactoException("La agenda esta llena");
		}
		return posicionDisponible;
	}
	/**
	 * metodo para verificar si existe un contacto
	 * @param telefono
	 * @return
	 * @throws ContactoException
	 */
	private Contacto verificarExisteContacto(Contacto contactoBuscado) throws ContactoException {

		Contacto contactoEncontrado = null;

		for(Contacto contacto : listaContactos){
			if(contacto.equals(contactoBuscado)){
				contactoEncontrado = contacto;
				throw new ContactoException("El contacto que vas a ingresar ya existe");
			}
		}
		return contactoEncontrado;
	}
	/**
	 * Este es un metodo para listar los contactos
	 * @return
	 * @throws ContactoException
	 */
	public ArrayList <Contacto> listarContactos() throws ContactoException{
		  ArrayList<Contacto> contacto = new ArrayList<Contacto>();
		  if(listaContactos != null){
			  for (int i = 0; i < listaContactos.length; i++) {
				contacto.add(listaContactos[i]);
			}
		  }
		 return contacto;
	}
	/**
	 * metodo apra verificar si existe un contacto
	 * @param contactoVerificado
	 * @return
	 * @throws ContactoException
	 */
	public String existeContacto(Contacto contactoVerificado) throws ContactoException{

		String mensaje = "El contacto no existe";

		for (Contacto contacto : listaContactos) {
			if(contacto.equals(contactoVerificado)){
				throw new ContactoException("El contacto ya existe");
			}
		}
		return mensaje;
	}
	/**
	 * metodo para buscar un contacto por su nombre
	 * @param nombre
	 * @return el numero de telefono del contacto buscado
	 * @throws ContactoException
	 */
	public String buscarContacto (String nombre) throws ContactoException{

		String numeroTel = "";

		for(Contacto contacto : listaContactos){
			if(contacto.getNombre().equals(nombre)){
				numeroTel = contacto.getTelefono();
			}
		}
		if(numeroTel == ""){
			throw new ContactoException("El contacto no ha sido encontrado");
		}
		return numeroTel;
	}
	/**
	 * metodo que elimina un contacto
	 * @param contactoEliminar
	 * @return
	 * @throws ContactoException
	 */
	public String eliminarContacto(Contacto contactoEliminar) throws ContactoException{

		String mensaje = "El contacto no se ha eliminado";
		int posicionContacto = obtenerPosicionContacto(contactoEliminar);

		for (Contacto contacto : listaContactos) {
			if(contacto.equals(contactoEliminar)){
				listaContactos[posicionContacto] = null;
				mensaje = "El contacto se ha eliminado exitosamente";
			}
		if(posicionContacto == -1){
			throw new ContactoException ("El contacto no se ha encontrado");
		}
		}
		return mensaje;
	}
	/**
	 * metodo que obtiene la posicion del contacto
	 * @param contactoEliminar
	 * @return
	 */
	private int obtenerPosicionContacto(Contacto contactoEliminar) {

		int posicion = -1;
		for (int i = 0; i < listaContactos.length; i++) {
			if(listaContactos[i] != null && listaContactos[i].equals(contactoEliminar)){
				return i;
			}
		}
		return posicion;
	}
	/**
	 *Metodo para verificar si la agenda esta llena o no
	 * @return
	 */
	public String verificarAgendaLLena(){

		String mensaje = "No hay cupo en la agenda";

		for (int i = 0; i < listaContactos.length; i++) {
			if(listaContactos[i] == null){
				mensaje = "Hay espacio disponible en la agenda";
			}
		}
		return mensaje;
	}
	/**
	 * este metodo nos indica cuantos huecos o espacios libres quedan en la agenda
	 * @return
	 */
	public int verificarCantHuecosLibres(){

		int contador =  0;
		for (int i = 0; i < listaContactos.length; i++) {
			if(listaContactos[i] == null){
				contador ++;
			}
		}
		return contador;
	}
}

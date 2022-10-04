package agendaTelefonica.aplication;

import agendaTelefonica.model.AgendaTelefonica;
import agendaTelefonica.model.Contacto;
import agendaTelefonica.model.ContactoException;
/**
 * Clase aplicacion de nuestro proyecto de agenda telefonica
 * @author galvi
 *
 */
public class Aplication {

	private static AgendaTelefonica agenda = new AgendaTelefonica();

	public static void main(String[] args) throws ContactoException {

		Contacto contacto = new Contacto("cra 19","3219648000","juan","jj","galvis");
		Contacto contacto2 = new Contacto("cra 80","3454245","Santiago","Santi","gmail.com");
		String aniadirCont = agenda.aniadirContacto(contacto);
		String aniadirContacto2 = agenda.aniadirContacto(contacto2);
		String buscarContacto = agenda.buscarContacto("juan");
		String eliminarContacto = agenda.eliminarContacto(contacto2);
		System.out.println(aniadirCont);
		System.out.println(aniadirContacto2);
		System.out.println(buscarContacto);
		System.out.println(eliminarContacto);
	}


}

/*
 * TRACCIA:
 * Creare una classe che contenga un metodo main ed un altro metodo chiamato “chiama”. 
 * Al metodo chiama dobbiamo passare un parametro di tipo String che rappresenta un numero di
 * telefono. Il metodo chiama deve stampare a schermo la frase: "Sto chiamando il numero: " seguita dal numero telefonico.
 */

package esercizio5___2026_03_03;

public class esercizio5___2026_03_03 {

	public static void main(String[] args) {

		String numeroDaChiamare = "0039 3141592653";
		chiama(numeroDaChiamare);
		
	}
	
	public static void chiama(String numeroTelefono) {
		
		System.out.println("Sto chiamando: " + numeroTelefono);
		
	}

}

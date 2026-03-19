/*
 * TRACCIA:
 * Creare una classe con un metodo main ed un altro metodo che, date tre stringhe come
 * parametri, stampi a schermo prima il terzo parametro, poi il secondo e poi il primo.
 * Dentro al metodo main richiamare l’altro metodo per fornire un esempio.
 */

package esercizio4___2026_03_03;

public class esercizio4___2026_03_03 {
	
	public static void main(String[] args) {

		String prima = "TOM";
		String seconda = "INSEGUE";
		String terza = "JERRY";
		
		System.out.println("Stringhe originali: " + prima + " " + seconda + " " + terza);
		
		System.out.println("---------------------------");

		System.out.println("Stringhe ribaltate: ");
		reverse(prima, seconda, terza);
		
	}
	
	public static void reverse(String uno, String due, String tre) {
		
		System.out.println(tre);
		System.out.println(due);
		System.out.println(uno);

	}



}

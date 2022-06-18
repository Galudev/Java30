package principal;

import secundario.HastaNunqui;
import secundario.HolaMundo;

public class Main {

	public static void main(String[] args) {
		/* Si hacemos el import manual de la clase HolaMundo 
		   funciona correctamente como se comprueba a continuación: */
		HolaMundo holaMundo = new HolaMundo();
		System.out.println(holaMundo.saludar());
		
		/* Mientras que si usamos la clase HastaNunqui sin importarla nos da error.
		   Lo podemos solucionar importando manualmente el paquete como en el caso
		   anterior, o bien podemos colocar el cursor sobre el tipo de variable
		   HastaNunqui y pulsar ctrl+space para importarla, eligiendo posteriormente
		   la clase que se encuentra en el paquete que deseamos importar.*/
		HastaNunqui hastaNunqui = new HastaNunqui();
		System.out.println(hastaNunqui.patada());
	}
}

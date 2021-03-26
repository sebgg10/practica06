package mx.com.softgame.poo1game.utils;
public class Utileria{
	public static int contadorID = 0;

/*Constructor privado. La clase no instancia bjetos
por lo tanto se pone el constructor privado para 
evitar errores*/
	
	private Utileria(){}

	public static int getID(){
		return contadorID++;
	}
}

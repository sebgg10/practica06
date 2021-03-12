package mx.com.softgame.poo1game.personajes.buenos;
import mx.com.softgame.poo1game.personajes.Personaje;

public class Planta extends Personaje {
	char escudo;
	
	public char getEscudo(){
		return escudo;
	}
	//Constructores
	
	public Planta(String nombre, int vida, char escudo){
		super(nombre, vida);
		this.escudo = escudo;
	}
	public Planta(String nombre, char escudo){
		this(nombre,3,escudo);
	}
	public Planta(String nombre, int vida){
		this(nombre,vida,'A');
	}
	public Planta(String nombre){
		this(nombre,3,'A');
	}
	
	//Metodos
	public String toString(){
		return super.toString()+" "+escudo;
	}
	public void decVida(){
		if(escudo == 'A'){
			super.decVida(2);
		} else {
			super.decVida();
		}
	}
	public void decVida(int decremento){
		if(escudo == 'A'){
			super.decVida(decremento*2);
		} else {
			super.decVida(decremento);
		}
	}
}
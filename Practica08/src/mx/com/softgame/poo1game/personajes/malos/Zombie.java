package mx.com.softgame.poo1game.personajes.malos;
import mx.com.softgame.poo1game.personajes.Personaje;

public class Zombie extends Personaje {
	boolean ataque;
	
	public boolean getAtaque(){
		return ataque;
	}
	
	//Constructores 
	public Zombie(String nombre, int vida, boolean ataque){
		super(nombre,vida);
		this.ataque = ataque;
	}
	public Zombie(String nombre, boolean ataque){
		this(nombre,3,ataque);
	}
	public Zombie(String nombre){
		this(nombre,3,false);
	}
	
	//Metodos
	public String getDetalle(){
		return super.getDetalle()+" "+ataque;
	}
	public void decVida(){
		if(ataque == false){
			super.decVida(3);
		} else {
			super.decVida(2);
		}
	}
}
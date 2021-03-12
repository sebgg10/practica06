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
	public String toString(){
		return super.toString()+" "+ataque;
	}
	public void decVida(){
		if(!ataque){
			super.decVida(3);
		} else {
			super.decVida(2);
		}
	}
	public void decVida(int decremento){
		if(!ataque){
			super.decVida(decremento*3);
		}else{
			super.decVida(decremento*2);
		}
	}
	
	public boolean equals(Object o){
		boolean result = super.equals(o);
		if (o != null && o instanceof Zombie){
			Zombie z = (Zombie) o;
			if ataque == z.getAtaque(){
				result=true
			}
		}
	}
}
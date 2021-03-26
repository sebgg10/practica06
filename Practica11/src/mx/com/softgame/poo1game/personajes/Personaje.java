package mx.com.softgame.poo1game.personajes;
import mx.com.softgame.poo1game.utils.Utileria;

public class abstract Personaje{
	protected String nombre;
	protected int vida;
	private final int ID;
	
	//Constructores
	public Personaje(String nombre, int vida, int ID){
		this.vida = vida;
		this.nombre = nombre;
		this.ID = Utileria.getID();
	}
	
	public Personaje(String nombre){
		this.vida = 3;
		this.nombre = nombre;
	}
	
	//Metodos
	public abstract void setNombre(String nombre){
		if(nombre.length()>3 && nombre.length()<10){
		this.nombre = nombre;
		}
	}
	public String getNombre(){
		return nombre;
	}

	public final int getVida(){
		return (ID + " " + vida);
	}
	public void setVida(int vida){
		if (vida >= 0 && vida <= 100){
			this.vida = vida;
		}
	}
	public String toString(){
		return ID + "\t" + nombre + "\t" + vida;
	}
	
	public void decVida(){
		decVida(1);
	}
	public void decVida(int decremento) {
		if (vida > 0){
			vida -= decremento;
		}
	}
	
	public abstract boolean equals(Object o){
		boolean result = false;
		if (o != null && o instanceof Personaje){
			Personaje p = (Personaje) o;
			if (nombre == p.getNombre() && vida == p.getVida()){
				result = true;
			}
		}
		return result;
	}
}
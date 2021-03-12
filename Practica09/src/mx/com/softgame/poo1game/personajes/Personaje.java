//Nombre: Sebastián Ortiz López
//Inicio: 8:40
//Fin: 

package mx.com.softgame.poo1game.personajes;
import java.lang.String;
public class Personaje{
	private String nombre;
	private int vida;
	
	//Constructores
	public Personaje(String nombre, int vida){
		this.vida = vida;
		this.nombre = nombre;
	}
	
	public Personaje(String nombre){
		this.vida = 3;
		this.nombre = nombre;
	}
	
	//Metodos
	public void setNombre(String nombre){
		if(nombre.length()>3 && nombre.length()<10){
		this.nombre = nombre;
		}
	}
	public String getNombre(){
		return nombre;
	}
	public void saludar(){
		System.out.println("Hola Alumno de POO " +nombre);
	}
 
	public int getVida(){
		return vida;
	}
	public void setVida(int vida){
		if (vida >= 0 && vida <= 100){
			this.vida = vida;
		}
	}
	public String getDetalle(){
		return nombre + "\t" + vida;
	}
	
	public void decVida(){
		decVida(1);
	}
	public void decVida(int decremento) {
		if (vida > 0){
			vida -= decremento;
		}
	}
}
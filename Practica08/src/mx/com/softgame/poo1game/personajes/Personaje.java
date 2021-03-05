//Nombre: Sebastián Ortiz López
//Inicio: 8:40
//Fin: 

package mx.com.softgame.poo1game.personajes;
import java.lang.String;
public class Personaje{
	//Atributos
	private String nombre;
	private int vida;
	//Constructores
	public Personaje(String nombre, int vida){
		vida = 0;
		this.nombre = nombre;
	}
	public Personaje(String nombre){
		vida = 3;
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
	public boolean setVida(int vida){
		if (vida >= 0 && vida <= 100){
			this.vida = vida;
			return true;
		} else {
			return false;
		}
	}
	public String getDetalle(){
		String detalle ="";
		detalle = ""+nombre + "	" + edad;
		return detalle;
	}
	public decVida(){
		if (vida > 0){
			this.vida -= 1;
			return true;
		} else {
			return false;
		}
	}
	public decVida(int vida)
}
package mx.com.softgame.poo1game.personajes;
import java.lang.String;
public class Personaje{
	//atributos
	private String nombre;
	private int edad;
	//constructor
	public Personaje(String nombre){
		edad = 0;
		this.nombre = nombre;
	}
	//metodos
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
 
	public int getEdad(){
		return edad;
	}
	public boolean setEdad(int edad){
		if (edad >= 0 && edad <= 120){
			this.edad = edad;
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
}
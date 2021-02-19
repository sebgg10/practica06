//Nombre: Sebastian Ortiz Lopez
//Inicio: 8:30am
//Fin: 10:15
package mx.com.softgame.poo1game.personajes;
public class Personaje{
	private String nombre;
	private int edad;
	
	public Personaje(String nombre, int edad){
		this.nombre = nombre;
		this.edad = edad;
	}
	public int getEdad(){
		return edad;
	}
	public String getNombre(){
		return nombre;
	}
	public String getDetalle() {
		return nombre + "\t" + edad;
	}
	public void setNombre(String nombre){
		if (nombre.length()>3 && nombre.length()<10){
			this.nombre = nombre;
		}
	}
	public boolean setEdad(int edad){
		if (edad > 0 && edad < 120){
			this.edad = edad;
			return true;
		}
		else
		{
			return false;
		}
	}
	public void saludar(){
		System.out.println("Hola Alumno de POO " + nombre);
	}
}
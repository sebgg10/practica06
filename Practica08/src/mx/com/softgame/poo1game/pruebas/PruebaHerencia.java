package max.com.softgame.poo1game.pruebas;
import mx.com.softgame.poo1game.personajes.Personaje;
import mx.com.softgame.poo1game.personajes.buenos.Planta;
import mx.com.softgame.poo1game.personajes.malos.Zombie;

public class PruebaHerencia {
	public static void main(String[] args){
		Personaje per01 = new Personaje("Valeria",99);
		Personaje per02 = new Personaje("Octavio");
		
		Planta plan01 = new Planta("Wendy",10,'B');
		Planta plan02 = new Planta("Ricardo",50);
		Planta plan03 = new Planta("Vania",'C');
		Planta plan04 = new Planta("Alan");
		
		Zombie zom01 = new Zombie("Karen",80,false);
		Zombie zom02 = new Zombie("Eduardo",true);
		Zombie zom03 = new Zombie("Esmeralda");
		
		Personaje[] personajes = 
		{per01,per02,plan01,plan02,plan03,plan04,zom01,zom02,zom03};
		
		for(Personaje i: personajes){
			System.out.println(i.getDetalle());
			
			if(i instanceof Planta){
				System.out.println("Soy planta");
			}
			if(i instanceof Zombie){
				System.out.println("Soy zombie");
			}
			int aleatorio = (int) (Math.random()*10);
			i.decVida(aleatorio);
			System.out.println(i.getDetalle());
		}
	}
}
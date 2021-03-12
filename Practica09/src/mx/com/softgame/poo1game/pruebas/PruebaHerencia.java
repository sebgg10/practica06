package mx.com.softgame.poo1game.pruebas;
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
		{ new Personaje("Omar",99),
		new Planta("Karen",50),
		new Zombie("Hanna",80,false),
		
		new Personaje("Omar",99),
		new Planta("Karen",50),
		new Zombie("Hanna",80,false)
		};
		
		int i = 0;
		while (i < personajes.length){
			for(Personaje p: personajes){
				if (personajes[i] == p){
					System.out.println("***"+personajes[i].toString() + " es identico a " + p.toString()+", son el mismo objeto"+"***");
					
				} else {
					System.out.println(personajes[i].toString()+" != "+p.toString());
				if (personajes[i].equals(p)){
					System.out.println("**"+personajes[i].toString() + " es igual a " + p.toString()+", son diferentes objetos"+"**");
				} else {
					System.out.println(personajes[i].toString()+" != "+p.toString());
				}
				i += 1;
			}
		}

	}
}
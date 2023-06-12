package oop_les1;

public class Application {

	public static void main(String[] args) {
		
		System.out.println("Het werkt");
		// aanroep bij 1 en 2
		Bee bij1 = new Bee();
		Bee bij2 = new Bee();

		// bij 1
		String Naam= bij1.doeIets("Derpy");
		System.out.println("Bij 1 Name is " + Naam);
		 
		boolean IsItRaining =bij1.doeIets2(false);
		if (IsItRaining== true) {
			System.out.println("Het regend!");
		}else {
			System.out.println("Het regend niet!");
		}
		int Snelheid = bij1.snelheid(100);
		System.out.println("De snelheid is " + Snelheid);

		// bij 2
		Naam= bij2.doeIets("Barry");
		System.out.println("Bij 2 Name is " + Naam);
		// bij 3
		Bee bij3 = new Bee(21, true, "Bob");
		
		// sub classes Animal
		
		//Animal animal1= new Animal();
		//animal1.setName("kim");
		Cat cat1 = new Cat();
		cat1.setName("daisy");
		cat1.makeSound();
		Leeuw leeuw1= new Leeuw();
		leeuw1.setName("Leo");
		Tijger tijger2 = new Tijger ();
		tijger2.setName("Tony");
		
		Pen pen=new Pen();
		pen.Price(2000000);
		Papier papier = new Papier ();
		papier.Price(11);
		Podlood podlood = new Podlood();
		podlood.Price(16);
		
	}

}

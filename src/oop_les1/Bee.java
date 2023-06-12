package oop_les1;

public class Bee {

	public boolean IsItRaining; 
	public String Naam;
	public int Speed;
	public int x;
	public int y; 

	public Bee() {
		System.out.println("in constructor");
	}
	
	public Bee(int Speed, boolean ISItRaining, String Naam) {
		this.Speed=Speed;
		System.out.println("de snelheid is " + Speed);
		this.IsItRaining=ISItRaining;
		System.out.println("regend het " + IsItRaining);
		this.Naam=Naam;
		System.out.println("De bij naam is " + Naam);
		
	}
	
	public String doeIets(String Name) {
		Naam=Name;
		return Naam;
	}
	
	public boolean doeIets2(boolean Regen) {
		IsItRaining= Regen;
		
		return IsItRaining;
		
	}
	
	public int snelheid(int Snelheid) {
		Speed= Snelheid;
		return Speed;
		
	}
	
}

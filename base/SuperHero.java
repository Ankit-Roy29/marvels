package base;
public abstract class SuperHero {

	private String Name;
	private int Health;
	private int Powerlvl;
	private String Team;
	private String Type;
public SuperHero(String Name , int Health , int Powerlvl, String Team , String Type){
this.Name=Name;
this.Health=Health;
this.Powerlvl=Powerlvl;
this.Team=Team;
this.Type=Type;
}
public void displayInfo() {
    System.out.println("Name : " + Name);
    System.out.println("Health : " + Health);
    System.out.println("Power Level : " + Powerlvl);
    System.out.println("Team : " + Team);
    System.out.println("Type : " + Type);
}


}
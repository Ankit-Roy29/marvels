package avengers;
import base.SuperHero;
import interfaces.WeaponUser;
import interfaces.Flyable;
import interfaces.Leader;
import interfaces.TechUser;

public class Spiderman extends SuperHero implements WeaponUser,Flyable,Leader,TechUser{
	private String suitVersion;
	private int webFluidLevel;
	private boolean spiderSense;
public Spiderman(String Name , int Health , int Powerlvl, String Team , String Type, String suitVersion , int webFluidLevel, boolean spiderSense){
	super(Name, Health, Powerlvl, Team, Type);
	this.suitVersion = suitVersion;
	this.webFluidLevel = webFluidLevel;
	this.spiderSense = spiderSense;
}
@Override
public void fly(){
System.out.println("I swing through the city using my webs.");
}
@Override
public void attack() {
    System.out.println("My webs are my weapons.");
}
@Override
public void lead(){
	System.out.println("I have my own team where i am leader but here all are seniors");
}
@Override
public void tech(){
	System.out.println("Mr. Stark gave me everything.");
}

public void dialogue() {
    System.out.println("Your friendly neighborhood Spider-Man!");
}
@Override
public void displayInfo(){
super.displayInfo();
	System.out.println("suitVersion : " + suitVersion);
        System.out.println("webFluidLevel : " + webFluidLevel);
        System.out.println("spiderSense : " + spiderSense);
}
}


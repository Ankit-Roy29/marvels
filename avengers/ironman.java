package avengers;
import base.SuperHero;
import interfaces.Flyable;
import interfaces.TechUser;
import interfaces.WeaponUser;
public class ironman extends SuperHero implements Flyable,TechUser,WeaponUser{
	private String suitVersion;
	private int arcReactorLevel;
	private int jarvisVersion;

public ironman(String Name , int Health , int Powerlvl, String Team , String Type, String suitVersion,  int arcReactorLevel, int jarvisVersion){
        super(Name, Health, Powerlvl, Team, Type);
        this.suitVersion= suitVersion;
	this.arcReactorLevel = arcReactorLevel;
	this.jarvisVersion = jarvisVersion;}

@Override
public void fly(){
System.out.println("I am flying using my suit i can fly only till atmosphere of earth");}
@Override
public void tech(){
System.out.println("I am using Stark Tech");
}
@Override
public void attack(){
System.out.println("I am attacking through my repulser");
}
public void dialoge() {
    System.out.println("Hi Jarvis!");
}
@Override
public void displayInfo(){
super.displayInfo();
	System.out.println("Suit Version : " + suitVersion);
        System.out.println("Arc Level : " + arcReactorLevel);
        System.out.println("Jarvis Verson : " + jarvisVersion);
}


}

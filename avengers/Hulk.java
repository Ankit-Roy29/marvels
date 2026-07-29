package avengers;
import base.SuperHero;
import interfaces.Flyable;
import interfaces.WeaponUser;
public class Hulk extends SuperHero implements Flyable,WeaponUser{
	private int rageLevel;
	private int strengthMultiplier;
	private boolean smartHulk;

public Hulk(String Name , int Health , int Powerlvl, String Team , String Type, int rageLevel,  int strengthMultiplier, boolean smartHulk){
        super(Name, Health, Powerlvl, Team, Type);
        this.rageLevel= rageLevel;
	this.strengthMultiplier = strengthMultiplier;
	this.smartHulk = smartHulk;
}

@Override
public void fly(){
System.out.println("I didn't fly i jump");}
@Override
public void attack(){
System.out.println("My Hands are my Weapons");
}
public void dialoge() {
    System.out.println("HULK SMASH");
}
@Override
public void displayInfo(){
super.displayInfo();
	System.out.println("Rage Level : " + rageLevel);
        System.out.println("Strength : " + strengthMultiplier);
        System.out.println("Control : " + smartHulk);
}



}

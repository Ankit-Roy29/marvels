package avengers;
import base.SuperHero;
import interfaces.Flyable;
import interfaces.WeaponUser;
public class Thor extends SuperHero implements Flyable,WeaponUser{
	 private String weaponName;
	 private int lightningLevel;
	private boolean canSummonBifrost;
public Thor(String Name , int Health , int Powerlvl, String Team , String Type, String weaponName,  int lightningLevel, boolean canSummonBifrost){
        super(Name, Health, Powerlvl, Team, Type);
        this.weaponName= weaponName;
	this.lightningLevel = lightningLevel;
	this.canSummonBifrost = canSummonBifrost;}

@Override
public void fly(){
System.out.println("I am flying using my Mjolnir i have no bonds");}
@Override
public void attack(){
System.out.println("I am attacking through my Mjolnir and by lightning");
}
public void dialoge() {
    System.out.println("For All Father's Odin");
}
@Override
public void displayInfo(){
super.displayInfo();
    System.out.println("Weapon : " + weaponName);
    System.out.println("Lightning Level : " + lightningLevel);
    System.out.println("Bifrost : " + canSummonBifrost);
}


}

package guardian;
import base.SuperHero;
import interfaces.Leader;
import interfaces.WeaponUser;
import interfaces.TechUser;
public class StarLord extends SuperHero implements Leader,WeaponUser,TechUser{
	private String helmetType;
	private boolean jetBoots;
	private boolean hasCelistialPower;

public StarLord(String Name , int Health , int Powerlvl, String Team , String Type, String helmetType, boolean jetBoots, boolean hasCelistialPower){
	super(Name,Health,Powerlvl,Team,Type);
	this.helmetType=helmetType;
	this.jetBoots = jetBoots;
	this.hasCelistialPower=hasCelistialPower;
}
@Override
public void lead(){
System.out.println("I i lead guardians");}
@Override
public void attack(){
System.out.println("I attack with the elemental gun"); }
@Override
public void tech(){
System.out.println("I am using my own Tech dont ask from where i got");}
public void dialoge() {
    System.out.println("I am Peter Quill, but my team doesn't respect me as their leader.");
}
@Override
public void displayInfo(){
super.displayInfo();
    System.out.println("Helmet Type : " + helmetType);
    System.out.println("Jet Boots : " + jetBoots);
    System.out.println("Celestial Power : " + hasCelistialPower);
}

}

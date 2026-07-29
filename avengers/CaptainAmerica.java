package avengers;
import base.SuperHero;
import interfaces.WeaponUser;
import interfaces.Leader;
public class CaptainAmerica extends SuperHero implements WeaponUser,Leader{
	 private String shieldMaterial;
	private int leadershipLevel;
	private boolean superSoldierSerum;
public CaptainAmerica(String Name , int Health , int Powerlvl, String Team , String Type, String shieldMaterial ,  int leadershipLevel, boolean superSoldierSerum){
        super(Name, Health, Powerlvl, Team, Type);
        this.shieldMaterial= shieldMaterial;
	this.leadershipLevel = leadershipLevel;
	this.superSoldierSerum = superSoldierSerum;}

@Override
public void attack(){
System.out.println("I am attacking through my shield");
}
@Override
public void lead(){
System.out.println("I lead avengers");
}

public void dialoge() {
    System.out.println("Avengers... Assemble!");
}
@Override
public void displayInfo(){
super.displayInfo();
	System.out.println("Shield : " + shieldMaterial);
        System.out.println("Leadership : " + leadershipLevel);
        System.out.println("Serum : " + superSoldierSerum);
}

}

package app;
import avengers.ironman;
import avengers.Hulk;
import avengers.CaptainAmerica;
import avengers.Thor;
import guardian.StarLord;
class Main{
public static void main(String[] args){

	ironman obj = new ironman("Tony Stark",
    100,
    95,
    "Avengers",
    "Human",
    "Mark-85",
    100,
    7);
obj.dialoge();
obj.displayInfo();
	Hulk obj2 = new Hulk("Bruce Banner",
    100,
    98,
    "Avengers",
    "Human",
    95,
    120,
    true);
obj2.dialoge();
obj2.displayInfo();

	Thor obj3 = new Thor("Thor Odinson",
    100,
    99,
    "Avengers",
    "Asgardian",
    "Mjolnir",
    100,
    true);
obj3.dialoge();
obj3.displayInfo();
	CaptainAmerica obj4 = new CaptainAmerica("Steve Rogers",
    100,
    92,
    "Avengers",
    "Human",
    "Vibranium",
    100,
    true);
obj4.dialoge();
obj4.displayInfo();

StarLord obj5 = new StarLord("Peter Quill",
	100,
	93,
	"Guardians Of Galaxy",
	"Human",
	"Elemental",
	true,
	false);
obj5.dialoge();
obj5.displayInfo();
	

}




}
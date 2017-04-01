package by.htp.smth;

import by.htp.equipment.Accessory;
import by.htp.equipment.Bike;
import by.htp.equipment.Category;
import by.htp.equipment.Gloves;
import by.htp.equipment.Helmet;
import by.htp.equipment.KneePad;
import by.htp.equipment.MainEquipment;
import by.htp.equipment.Rollers;
import by.htp.equipment.Skateboard;

public class Launcher {
	
	public static void main(String[] args){
		
		RentStation rentStation = new RentStation();
		
		Client maxim = new Client(1543, "Maxim");
		RentUnit maximRent = new RentUnit();
		Category summer = new Category("Summer");
		
		Bike bikeStels = new Bike(summer, "Bike Stels 420");
		Bike bikeMerida = new Bike(summer, "Bike Merida OP");
		Rollers rollersIDK = new Rollers(summer, "Bike Roller Blades");
		Skateboard skateAdio = new Skateboard(summer, "Bike Adio");
		
		Helmet giant = new Helmet(summer, "Helmet Giant");
		KneePad element = new KneePad(summer, "KneePad Element");
		Gloves quicksilver = new Gloves(summer, "Gloves Quicksilver");
		
		rentStation.setMainEquipment(new MainEquipment[]{bikeStels, bikeMerida, rollersIDK, skateAdio});
		rentStation.setAccessories(new Accessory[]{giant, element, quicksilver});
		
		System.out.println("Enter main unit to rent:");
		
		maximRent.rentMainUnit(skateAdio, rollersIDK);
		System.out.println("Enter number of elemement to add accessories:");
		int position = 0;
		maximRent.rentAccessories(position, giant, quicksilver);
		
		
		
		
		
		
	}

}

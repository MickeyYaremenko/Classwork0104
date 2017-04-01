package by.htp.smth;

import by.htp.equipment.Accessory;
import by.htp.equipment.Equipment;
import by.htp.equipment.MainEquipment;

public class RentUnit {
	private Equipment[] units;

	public RentUnit() {
		this.units = new MainEquipment[3];
	}

	public void rentMainUnit(MainEquipment... MainEquipment) {
		for (int i = 0; i < checkEmptyRoom(); i++){
			addUnit(MainEquipment[i]);
			showRentedUnit(MainEquipment[i]);
		}
	}
	
	public void rentAccessories(Accessory... accessories){
		MainEquipment.
	}
	
	private void showRentedUnit(Equipment equipment){
		System.out.println("You've rented:" + equipment);
	}

	private void addUnit(Equipment equipment){
		if (equipment == null){
			System.out.println("Incorrect equipment entered");
		} else if (checkEmptyRoom() > 0){
			int position = 0;
			while (units[position] != null){
				position++;
			}
			units[position] = equipment;
		}
		
	}

	private int checkEmptyRoom(){
		int emptyRoom = 0;
		for (Equipment unit : units){
			if (unit == null){
				emptyRoom++;
			}
		}
		return emptyRoom;
	}

}

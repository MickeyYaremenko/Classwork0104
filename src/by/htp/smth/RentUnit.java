package by.htp.smth;

import by.htp.equipment.Accessory;
import by.htp.equipment.Equipment;
import by.htp.equipment.MainEquipment;

public class RentUnit {
	private MainEquipment[] units;

	public RentUnit() {
		this.units = new MainEquipment[3];
	}

	public MainEquipment[] getUnits() {
		return units;
	}

	public void rentMainUnit(MainEquipment... mainEquipment) {
		for (int i = 0; i < checkEmptyRoom() && i < mainEquipment.length; i++) {
			addMainUnit(mainEquipment[i]);
			// showRentedUnit(MainEquipment[i]);
		}
	}

	public void rentAccessories(int position, Accessory... accessories) {
		units[position].setAccesories(accessories);
	}

	private void showRentedUnit(Equipment equipment) {
		System.out.println("You've rented:" + equipment);
	}

	private void addMainUnit(MainEquipment equipment) {
		if (equipment == null) {
			System.out.println("Incorrect equipment entered");
		} else if (checkEmptyRoom() > 0) {
			int position = 0;
			while (units[position] != null) {
				position++;
			}
			units[position] = equipment;
		} else {
			System.out.println("You can't rent more than 3 main items.");
		}

	}

	private int checkEmptyRoom() {
		int emptyRoom = 0;
		for (Equipment unit : units) {
			if (unit == null) {
				emptyRoom++;
			}
		}
		return emptyRoom;
	}

}

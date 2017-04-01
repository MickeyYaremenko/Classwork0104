package by.htp.smth;

import by.htp.equipment.Equipment;

public class RentUnit {
	private Equipment[] units;

	public RentUnit() {
		this.units = new Equipment[3];
	}

	public void rentUnit(Equipment... equipment) {
		for (int i = 0; i < checkEmptyRoom(); i++){
			addUnit(equipment[i]);
		}
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

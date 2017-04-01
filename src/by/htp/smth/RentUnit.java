package by.htp.smth;

import by.htp.equipment.Equipment;

public class RentUnit {
	private Equipment[] units;

	public RentUnit() {
		this.units = new Equipment[3];
	}

	public void rentUnit(Equipment... equipment) {
		for (int i = 0; i < equipment.length; i++) {
			addUnit(equipment[i]);
		}
	}

	private void addUnit(Equipment equipment){
		if (equipment == null){
			System.out.println("Incorrect argument");
		} else if (checkRoom() > 0){
			int position = 0;
			while (units[position] != null){
				position++;
			}
			units[position] = equipment;
		}
		
	}

	private int checkRoom(){
		int emptyRoom = 0;
		for (Equipment unit : units){
			if (unit == null){
				emptyRoom++;
			}
		}
		return emptyRoom;
	}

}

package by.htp.smth;

import java.io.InputStreamReader;
import java.util.Scanner;

import by.htp.equipment.Accessory;

public class Seller {

	private String name;
	private RentStation rentStation;

	public Seller(String name, RentStation rentStation) {
		this.name = name;
		this.rentStation = rentStation;
	}

	public void showAllMainEquip() {
		System.out.println("All available equip:");
		int position = 1;
		for (int i = 0; i < rentStation.getMainEquipment().length; i++) {
			System.out.println("" + position + ". " + rentStation.getMainEquipment()[i]);
			position++;
		}
	}

	public void showAllAccessories() {
		System.out.println("All available accessories:");
		int position = 1;
		for (int i = 0; i < rentStation.getAccessories().length; i++) {
			System.out.println("" + position + ". " + rentStation.getAccessories()[i]);
			position++;
		}
	}

	public void meetClient(Client client) {
		if (client == null) {
			System.out.println("Something went wrong, check entered data.");
		}

		// for (int i = 0; i < rentStation.getClientBase().length - 1; i++) {
		// if (rentStation.getClientBase()[i] != null) {
		// if (client.getPassportID() ==
		// rentStation.getClientBase()[i].getPassportID()) {
		// // rentStation.getClientBase()[i].getRentunit();
		if (checkClient(client)) {
			System.out.println("Your inventory:");
			showAlreadyRentedItems(rentStation.getClientBase()[getClientPosition(client)].getRentUnit());
			handleAnOrder(rentStation.getClientBase()[getClientPosition(client)].getRentUnit());
		} else {

			// }
			// } else {
			
			rentStation.newClient(client);
			handleAnOrder(rentStation.getClientBase()[rentStation.getClientCounter()-1].getRentUnit());
		}
		// }
		// }
		// return client.getRentunit();

	}

	private boolean checkClient(Client client) {
		for (int i = 0; i < rentStation.getClientBase().length - 1; i++) {
			if (rentStation.getClientBase()[i] != null) {
				if (client.getPassportID() == rentStation.getClientBase()[i].getPassportID()) {
					return true;
				}
			}
		}
		return false;
	}
	
	private int getClientPosition(Client client){
		int position = 0;
		for (int i = 0; i < rentStation.getClientBase().length - 1; i++) {
			if (rentStation.getClientBase()[i] != null) {
				if (client.getPassportID() == rentStation.getClientBase()[i].getPassportID()) {
					position = i;
					return position;
				}
			}
		}
		return position;
	}

	private void handleAnOrder(RentUnit rentUnit) {
		orderMainEquip(rentUnit);
		orderAccessory(rentUnit);
		// int
		// rentUnit.rentMainUnit(MainEquipment);
	}

	private void orderMainEquip(RentUnit rentUnit) {
		Scanner sc = new Scanner(new InputStreamReader(System.in));
		System.out.println("Enter position of desirable main equipment, enter 0 to finish:");
		int choice = sc.nextInt();
		if (choice != 0) {
			rentUnit.rentMainUnit(this.rentStation.getMainEquipment()[choice - 1]);
		}
	}

	private void orderAccessory(RentUnit rentUnit) {
		Scanner sc = new Scanner(new InputStreamReader(System.in));
		System.out.println("Enter positions of desirable accessories separated by spaces or enter 0 to get back:");
		String choice = sc.nextLine();
		String[] choiceArr = choice.split(" ");
		int[] choiceArrToInt = new int[choiceArr.length];
		for (int i = 0; i < choiceArr.length; i++) {
			choiceArrToInt[i] = Integer.parseInt(choiceArr[i]);
		}
		if (choiceArrToInt[0] != 0) {
			System.out.println("Enter # of main item to add chosen accessories:");
			int position = sc.nextInt() - 1;
			Accessory[] tempAccessories = new Accessory[choiceArrToInt.length];
			// do {
			for (int i = 0; i < choiceArrToInt.length; i++) {
				tempAccessories[i] = this.rentStation.getAccessories()[choiceArrToInt[i] - 1];
			}
			rentUnit.rentAccessories(position, tempAccessories);
			// System.out.println("Enter one more id or 0 to get back:");
			// choice = sc.nextInt();
			// } while (choice != 0);
		}
	}

	private void showAlreadyRentedItems(RentUnit rentUnit) {
		if (rentUnit != null) {
			for (int i = 0; i < rentUnit.getUnits().length - 1; i++) {
				System.out.println(rentUnit.getUnits()[i]);
//				for (int j = 0; j < rentUnit.getUnits()[i].getAccesories().length - 1; j++) {
//					System.out.println(rentUnit.getUnits()[i].getAccesories()[j]);
//				}
				
			}
		}
	}

}

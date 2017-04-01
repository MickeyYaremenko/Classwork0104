package by.htp.equipment;

public class MainEquipment extends Equipment{
	private Accessory[] accesories;
	
	public MainEquipment(Category category, String title, Accessory[] access) {
		super(category, title);
		accesories = access;
	}

}

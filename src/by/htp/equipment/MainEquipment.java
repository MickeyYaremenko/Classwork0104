package by.htp.equipment;

public class MainEquipment extends Equipment{
	private Accessory[] accesories;
	
	public MainEquipment(Category category, String title, Accessory[] access) {
		super(category, title);
		accesories = access;
	}
	
	public MainEquipment(Category category, String title) {
		super(category, title);
	}

	public Accessory[] getAccesories() {
		return accesories;
	}

	public void setAccesories(Accessory[] accesories) {
		this.accesories = accesories;
	}
	
	

}

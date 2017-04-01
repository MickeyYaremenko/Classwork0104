package by.htp.equipment;

public abstract class Equipment {
	private Category category;
	private String title;
	private static int counterForID;
	private final int id;
	
	{
		counterForID++;
	}
	
	public Equipment(Category category, String title){
		this.category = category;
		this.title = title;
		id = counterForID;
	}

	@Override
	public String toString() {
		return "Equipment [category=" + category + ", title=" + title + ", id=" + id + "]";
	}
	
	
	
}

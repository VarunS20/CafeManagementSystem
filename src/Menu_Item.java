/* 
	Author: SDMCET-2020-2021-B5
	Description: Class which saves the menu item description
*/
public class Menu_Item {

	public int id;
	public String name;
	public double price;
	// constructor
	public Menu_Item(int id, String name, double price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}

	@Override
	public String toString() {
		return "[id=" + id + ", name=" + name + ", price=" + price + "]";
	}

}
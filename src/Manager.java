/* 
	Author: SDMCET-2020-2021-B5
	Description: Class which implements Manager information
*/
public class Manager extends Employee {

	public boolean permission;
	// constructor
	public Manager(String id, String nameSurname, String password, double wage) {
		super(id, nameSurname, password, wage);
		permission = true;
	}

	@Override
	public String toString() {
		return "Manager [ID: " + id + ", Name Surname: " + nameSurname + ", Wage: " + wage + "]";
	}

}
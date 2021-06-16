/* 
	Author: SDMCET-2020-2021-B5
	Description: Class which implements individual nodes of the Linkedlist and methods pertaning to it
*/
public class Node {

	Employee employee;
	Node next;
	// returns employee details of the current node
	public Employee getEmployee() {
		return employee;
	}
	// sets the employee value
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	// returns next node
	public Node getNext() {
		return next;
	}
	// adds new node to the list
	public void setNext(Node next) {
		this.next = next;
	}
	//constructor
	public Node(Employee employee) {
		this.employee = employee;
		this.next = null;
	}
	// constructor
	public Node(Employee employee, Node next) {
		this.employee = employee;
		this.next = next;
	}

}
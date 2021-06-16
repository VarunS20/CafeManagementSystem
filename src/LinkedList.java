/* 
	Author: SDMCET-2020-2021-B5
	Description: Class which implements LinkedList and methods pertaning to it
*/
public class LinkedList {
	public Node head;
	public Node tail;
	// constructor
	public LinkedList() {
		head = null;
	}
	// checks wheather list is empty or not
	public boolean isEmpty() {
		return head == null;
	}
	// prints the entire list
	public void outputList() {
		Node current = head;

		while (current != null) {
			System.out.println(current.employee.toString());
			current = current.next;
		}
	}
	// insert new node to the list
	public void insert(Employee employee) {
		head = new Node(employee, head);
	}
	// removes the node from the list
	public void delete(String key) {
		Node current = head;
		Node prev = null;

		if (current != null && key.equals(current.employee.id)) {
			head = current.next;
			return;
		}

		while (current != null && (!key.equals(current.employee.id))) {
			prev = current;
			current = current.next;
		}

		if (current == null)
			return;

		prev.next = current.next;
	}

}
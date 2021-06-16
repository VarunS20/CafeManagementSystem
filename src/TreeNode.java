/* 
	Author: SDMCET-2020-2021-B5
	Description: Class which creats and adds nodes in BST
*/
public class TreeNode {

	Menu_Item item;
	TreeNode left;
	TreeNode right;
	// constructor of the TreeNode
	public TreeNode(Menu_Item item) {
		this.item = item;
		this.left = left;
		this.right = right;
	}
	// returns menu item from BST
	public Menu_Item getMenuItem() {
		return item;
	}
	// initilize the value of the item
	public void setMenuItem(Menu_Item item) {
		this.item = item;
	}
	// returns the left node of BST
	public TreeNode getLeft() {
		return left;
	}
	// sets the left side of the BST
	public void setLeft(TreeNode left) {
		this.left = left;
	}
	// returns the right  node of the BST
	public TreeNode getRight() {
		return right;
	}
	// sets the right side of the BST
	public void setRight(TreeNode right) {
		this.right = right;
	}

}
import java.util.ArrayList;
import java.util.List;

public class SearchTree<T extends Comparable<T>> extends BinaryTree<T>
{
	public SearchTree() {
		super();
	}
	
	public boolean insert(T o) 
	{
		if (o == null) {
			return false;
		} 
		
		if (isEmpty()) {
			root = new TreeNode<T>(o); //root from the class BinaryTree
			root.setLeft(null);
			root.setRight(null);
			return true;
		}
		
		return insert( new TreeNode<T>(o), getRoot() );
	}

	private boolean insert(TreeNode<T> treeNode, TreeNode<T> root) 
	{ 
		if (treeNode == null) {
			return false;
		}
		else if (treeNode.getKey().compareTo(root.getKey()) == 0) {
			return false;
		} 
		else if (treeNode.getKey().compareTo(root.getKey()) > 0) {
			if (root.getRight() == null) {
				root.setRight(treeNode);
				return true; 
			} 
			else {
				return insert(treeNode, root.getRight());
			}
		} 
		else if (treeNode.getKey().compareTo(root.getKey()) < 0) {
			if (root.getLeft() == null) {
				root.setLeft(treeNode);
				return true; 
			} 
			else {
				return insert(treeNode, root.getLeft());
			} 
		}
		
		return false;
	} 
	
	
//-------------------------------------------------------------------------------------------------------------	
	
/**
public void reorganize()
	{
		List<TreeNode<T>> list = new ArrayList<TreeNode<T>>();
		readInorder(getRoot(), list); //read the given binary tree inorder traversal into the array_list
		setRoot(null); //initialize the search tree
		
		reorganize(list, 0, list.size()-1);
		
	}
	
	//method to read in order and insert the node_values into a list
	public void readInorder(TreeNode<T> treeNode, List<TreeNode<T>> list) {
		if(treeNode == null)
			return;
		
		readInorder(treeNode.getLeft(), list);
		list.add(treeNode); 
		readInorder(treeNode.getRight(), list);
	}
	
	//element at middle as new root 
	public void reorganize(List<TreeNode<T>> list, int first, int last) 
	{
		if (first < 0 || last > 0)
			return ;

		int mid = Math.round((first + last)/2f) ; //the middle
		T middle_NodeValue = list.get(mid).getKey(); 
		insert( middle_NodeValue ); //insertion in a new search tree as a root
		
		
		//go left
		reorganize(list, first, mid-1); 
		//go right
		reorganize(list, mid+1, last); 
	}   
**/
	
} 
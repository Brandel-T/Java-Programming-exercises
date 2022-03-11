import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

public class TreeNode<T>
{
	private TreeNode<T> left;
	private TreeNode<T> right;
	private T key;


	public TreeNode(T key) {
		 this(key, null, null);
	}
	
	public TreeNode(T key, TreeNode<T> left, TreeNode<T> right) {
		this.key = key;
		this.left = left;
		this.right = right;
	}
	
	
	public T getKey() {
		return key;
	}
	public void setKey(T o) {
		key = o;
	}
	
	public TreeNode<T> getLeft() {
		return left;
	}
	public void setLeft(TreeNode<T> l) {
		left = l;
	}
	
	public TreeNode<T> getRight() {
		return right;
	}
	public void setRight(TreeNode<T> r) {
		right = r;
	}
	
	public String toString() {
		return this.key + " ";
	}
	
	public void inorder(TreeNode<T> node)
	{
		if (node == null) {
			return;
		} else {
			Stack<TreeNode<T>> stack = new Stack<TreeNode<T>>();
			TreeNode<T> h = node;
			
			while (h != null || !stack.isEmpty()) 
			{
				if ( h!=null ) {
					stack.push(h);
					h = h.left;
					
				} else {
					h = stack.pop();
					System.out.print(h.toString()); 
					h = h.right;
				}
			}
		}
	}
	
	public void preorder(TreeNode<T> node) 
	{
		if (node == null) { 
			return;
		} else {
			System.out.print(node.toString());
			preorder(node.left);
			preorder(node.right);
		}
	}
	
	public void postorder(TreeNode<T> node) 
	{
		if (node == null)
			return;

		postorder(node.left);
		postorder(node.right);
		System.out.print(node.toString());
	}
	
	public void levelorder(TreeNode<T> node) 
	{
		if (node == null) {
			return;
		} else {
			TreeNode<T> root = node;
			Deque<TreeNode<T>> queue = new ArrayDeque<>(); //we can also use LinkedList
			queue.add(root);
			
			while( !queue.isEmpty() ) 
			{
				root = queue.remove();
				System.out.print( root.toString() );
				
				if ( root.left != null ) {
					queue.offer(root.left);
				}  
				
				if ( root.right != null ) {
					queue.offer(root.right);
				}  			
			}			
		}
	}
	
	
	public int count(TreeNode<T> tn) {
		if (tn == null)
			return 0;
		return 1 + count(tn.left) + count(tn.right);
	}
	
	public int getHeight(TreeNode<T> tn) {
		int leftHeiht = 0;
		int rightHeight = 0;
		
		if (tn == null)
			return 0;
		
		leftHeiht = 1 + getHeight(tn.left);
		rightHeight = 1 + getHeight(tn.right);
		
		return Math.max(leftHeiht, rightHeight);
		
	}

	public int getLeaves(TreeNode<T> tn) {
		if ( tn == null ) 
			return 0;
		
		if ( tn.left == null && tn.right == null ) {
			return 1;
		} else {
			return getLeaves(tn.left) + getLeaves(tn.right);
		}
	}
	
}

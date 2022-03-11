package Generics;

public class Node<T>
{
	private T info;
	private Node<T> left;
	private Node<T> right;
	
	public Node(T info) {
		this(info, null, null);
	}

	public Node(T info, Node<T> left, Node<T> right) {
		this.info = info;
		this.left = left;
		this.right = right;
	}

	public T getInfo() {
		return info;
	}

	public void setInfo(T info) {
		this.info = info;
	}

	public Node<T> getLeft() {
		return left;
	}

	public void setLeft(Node<T> left) {
		this.left = left;
	}

	public Node<T> getRight() {
		return right;
	}

	public void setRight(Node<T> right) {
		this.right = right;
	}

	
	public static void main(String[] args) {
		Node<Integer> n7 = new Node<>(7);  
		Node<Integer> n5 = new Node<>(5);
		Node<Integer> n1 = new Node<>(1);
		Node<Integer> n3 = new Node<>(3);
		Node<Integer> n6 = new Node<>(6, n5, n7);
		Node<Integer> n2 = new Node<>(2, n1, n3);
		Node<Integer> n4 = new Node<>(4, n2, n6);
		
		Integer i = 12;
		Double d = 3.0;
		System.out.println(i+d);
		
	}
}

public class ShoppingListMain {

	public static void main(String[] args) {  
		 
			ShoppingList o = new ShoppingList();
			o.put("Äpfel");
			o.put("Tomatos");
			o.put("Bananen");
			o.put("Orangen");
			o.put("Kiwi");
			o.put("limonade");
			o.put("Ananas");
			o.put("Öl");		
			
			System.out.println(o.count());
			
			//System.out.println(o.show("Kiwi"));
			System.out.println(o.show("Kiwis"));
			
			o.print();
			
			System.out.println();
			System.out.println();
			o.sort();
			o.print();	 

	}

}

package Aufgabe_2;

import java.util.ArrayList; 

public class Zoo< T extends Animal>
{
	ArrayList<Animal> animals = new ArrayList<Animal>();
	/**
	 * VOIR LA VIDEO TU ****TEACHER DU NET**** SUR LE SUJET **********
	 * 
	 * @param animal
	 * --> on ne peut pas utiliser <?> (bivarianz) parce que l'ecriture et la lecture seront bloquées
	 * --> la covariance <? extends Animal>: ne fonctionne aussi pas car 
	 * 		l'ecriture n'est pas permise, seule la lecture est permise
	 * --> la contravariance <? super Animal> aussi ne fonctionnera aussi pas
	 * 
	 * 
	 */
	public void buyNewAnimal(Animal animal) {
		animals.add(animal);
	}
	
	public void buyNewAnimals( ArrayList<T extends Animal> animals ) {
	//public <T extends Animal> void buyNewAnimals( ArrayList<T> animals ) {  <--- une autre option
		
		for ( T animal : animals) {
			this.animals.add(animal);
		}
	}
	
	public void takeCareOfAnimals(Caretaker<Animal> ct) {
		for ( Animal animal : animals ) {
			ct.takeCareOf(animal);
		}
	}
	
	public static void main(String[] args)
	{
		Animal a = new Animal();
		Cat c1 = new Cat();
		Dog d1 = new Dog();
		
		a = c1;
		
		Zoo<Cat> c = new Zoo<>();
		Zoo<Dog> d = new Zoo<>();
		ArrayList<Cat> cats = new ArrayList<>();
		ArrayList<Animal> an = new ArrayList<Animal>(); 
		c.buyNewAnimals(cats); 
		
	}
	
}


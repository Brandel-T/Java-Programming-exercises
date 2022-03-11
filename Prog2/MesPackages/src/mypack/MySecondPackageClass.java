package mypack;

/**
 * 
 * @author tsagu
 * etant donné que cette class n'est pas déclaré en "public"
 * la class "MySecondPackageClass" ne sera disponible que dans 
 * le package "mypack" et non dans un packet externe.
 * 
 *(N.B.: cette classe n'est pas non plus privée, elle est public mais juste dispo 
 * dans le package dans lequel elle est contenue)
 * 
 */

class MySecondPackageClass
{
	public MySecondPackageClass()
	{
		System.out.println("this is my second package !");
	}
}

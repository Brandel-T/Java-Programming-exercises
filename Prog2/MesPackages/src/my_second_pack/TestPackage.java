
package my_second_pack;
/**
 * toujours ecire les noms des packages en **minuscule
 * en **anglais , en utilisant des **chiffres aussi 
 * afin d'�viter lesconflits de nom avec les noms des
 * classes.
 */


import mypack.*;

public class TestPackage 
{

	public static void main(String[] args)
	{
		MyPackageClass mp1 = new MyPackageClass(); 
		
		//il y a erreur parce que la classe "MySecondPackageClass" a �t� declar�
		//sans le modificateur d'acc�s "public", cette classe 'est donc dispo que 
		//dans son packet et non dans un packet extern **************************
		MySecondPackageClass mp2 = new MySecondPackageClass();
		
		MyThirdPackageClass mp3 = new MyThirdPackageClass();
	}

}

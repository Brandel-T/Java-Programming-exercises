package Blatt2;

public class Noten {

	public static void main(String[] args) { 
		
		//the maximum number of points to be achieved
		double maxPoint = Double.parseDouble(args[0]);
		
		/**
		 * on doit formatter de telle sorte que cela ressemble exactement
		 * à l'exemple que le prof a donné dans l'énonce de l'exercice:
		 * pour cela on doit VRAIMENT prêter attentions aux différents
		 * espacements entre les mots et caractères !!!!!!!!!!!!
		 */
		
		/***************** ATTENTION (WICHTIG) **************
		 *  la donnée de formatage >> %f <<, en plus d'être valable pour 
		 *  les nombres avec des parties decimale, elle permet aussi 
		 *  D'ARRONDIR AUTOMATIQUE DE HAUTEUR DE 1 (à remarquer dans la pratique)
		 */
		
		System.out.printf("1.0: %5.1f - %5.1f (100,0 - 95%%) %n", maxPoint, maxPoint*0.95);
		System.out.printf("1.3: %5.1f - %5.1f ( 94,9 - 90%%) %n", maxPoint*0.95 - 0.1, maxPoint*0.90);
		System.out.printf("1.7: %5.1f - %5.1f ( 89,9 - 85%%) %n", maxPoint*0.90 - 0.1, maxPoint*0.85);
		System.out.printf("2.0: %5.1f - %5.1f ( 84,9 - 80%%) %n", maxPoint*0.85 - 0.1, maxPoint*0.8);
		System.out.printf("2.3: %5.1f - %5.1f ( 79,9 - 75%%) %n", maxPoint*0.8 - 0.1 , maxPoint*0.75);
		System.out.printf("2.7: %5.1f - %5.1f ( 74,9 - 70%%) %n", maxPoint*0.75 - 0.1, maxPoint*0.7);
		System.out.printf("3.0: %5.1f - %5.1f ( 69,9 - 65%%) %n", maxPoint*0.7 - 0.1 , maxPoint*0.65);
		System.out.printf("3.3: %5.1f - %5.1f ( 64,9 - 60%%) %n", maxPoint*0.65 - 0.1, maxPoint*0.6);
		System.out.printf("3.7: %5.1f - %5.1f ( 59,9 - 55%%) %n", maxPoint*0.6 - 0.1 , maxPoint*0.55);
		System.out.printf("4.0: %5.1f - %5.1f ( 54,9 - 50%%) %n", maxPoint*0.55 - 0.1, maxPoint*0.5);
		System.out.printf("5.0: weniger als %.1f Punkte", maxPoint/2);		 
	} 
}

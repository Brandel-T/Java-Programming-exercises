import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.StringTokenizer;
import java.io.FileOutputStream;
import java.io.BufferedOutputStream;

public class BadWordFilter 
{
	
//	1. Method
	public String filter (String input, String[] badWords)
	{
		String trenner = ". ',"; //die_Trennzeichen
		StringTokenizer stoken = new StringTokenizer(input, trenner, false);
		
		for (String s : badWords)
		{
			while (stoken.hasMoreTokens())
			{
				String next = stoken.nextToken(); 
				if ( next.equals(s)) 
				{
					input = input.replace(s, "***");
				}
			}
			/**
			 * ceci me permet d'initialiser de nouveau le StringTokenizer
			 * vu que ce dernier parcours une chaine de caractère du début jusqu'à
			 * la fin sans toute fois recommencer le parcours, MÊME S'IL SE TROUVE 
			 * DANS UNE AUTRE BOUCLE; comme c'est le cas ici avec la boucle "-for"
			 * dans laquelle StringTokenier est imbriqué !!!!!!!!!!!!!!!!!!!!
			 */stoken = new StringTokenizer(input, trenner, false); 
		}
		
		return input ;
	}
	
//	2.Method
	public void filter ( File inputFile, String [] badWords)
	{
		BufferedWriter bw = null;
		BufferedReader br = null ;
		String tmp = "";
		try 
		{
			FileReader fr = new FileReader(inputFile);
			br = new BufferedReader(fr);
			String data = br.readLine();
			while ( data != null )
			{
				tmp += data + "\n";
				data = br.readLine();
			}
			
	//---we use the first Method to make the replacements---
			String filteredString = filter(tmp, badWords);  
			
			//----------we change the name-------------
//			String namePlusExtension = inputFile.getName();
//			int point = namePlusExtension.lastIndexOf('.');
//			StringBuilder sb = new StringBuilder(namePlusExtension);
//			String nameOnly = sb.insert(point, "filtered").toString(); 
			String nameOnly = inputFile.getName().replace(".txt", "filtered.txt");
			
			FileWriter fw = new FileWriter(new File(nameOnly));
			 bw = new BufferedWriter(fw);
			 bw.write(filteredString);			
		
		}
		catch (FileNotFoundException e) {
			System.out.printf("\nthe file %s wasn't found", inputFile.getName());
		} 
		catch (IOException e) {
			System.out.println(e.getMessage());
		}
		
		try {
			br.close();
			bw.close();
		} catch (IOException e) { 
			System.err.println("not possible to close the file");
		} catch (NullPointerException e) {
			System.err.println("not possible to open the file");
			//au cas oú le fichier n'a pas pu été ouvert, la valeur de br sera "null"
			//et c'est comme si on effectuait null.close, ce qui reverrait evidemment
			//NullPointerEception, qu'on doit aussi capturer
		}
	}
	
	 //---------- STRINGTOKENIZER ------
	//--<< en savoir mieux, RDV dans le livre JavaGrundkursProgrammierung, Page 426 >>----
	
//	public static void main(String[] args) {
//		String str = "Und diese Biene, die ich meine, nen'nt sich Maja,";
//		String trenner = " .,'";
//		StringTokenizer stoken = new StringTokenizer(str, trenner);
//		while (stoken.hasMoreTokens()) {
//			String next = stoken.nextToken();
//			System.out.print( next +" "); 
//			//Und diese Biene die ich meine nen nt sich Maja
//		}
//		System.out.println("\n\n"+str);
//	}
	
}

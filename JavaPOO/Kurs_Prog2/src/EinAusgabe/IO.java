
package EinAusgabe;

//import java.io.BufferedInputStream;
//import java.io.BufferedOutputStream;
//import java.io.FileInputStream;
//import java.io.FileOutputStream;
//import java.io.IOException;
//import java.io.InputStream;
//import java.io.OutputStream;
import java.io.StringWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


public class IO 
{
	public static void main(String[] args)
	{
//		InputStream  is;
//		OutputStream os;
//		
//		try {
//			is = new FileInputStream(args[0]);
//			os = new FileOutputStream(args[1]);
//			
//			is = new BufferedInputStream(is);
//			os = new BufferedOutputStream(os);
//			
//			int b = is.read();
//			while(b != -1)
//			{
//				os.write(b);
//				b = is.read();
//			}
//			
//			is.close();
//			os.close();
//			
//			
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
		
		
	//-------->Textquellen_ - READER/ WRITER <--------
		
		StringWriter sw = new StringWriter();
		sw.write("bonjour tout le monde, ");
		sw.write(' ');
		sw.write('Ô');
		sw.write(" je m'appelle Brandel !");
		sw.write("l " + " ol");
		//maintenant_on_peut conserver tt ce teste dans une chaine de caractères, comme suit
		String s = sw.toString();
		System.out.println(s);
		System.out.println();
		
	//---------> METAINFORMATIONEN <---------
		File file = new File("../perez.txt");
		System.out.println("filename: "+ file.getName());
		System.out.println("parentname: "+ file.getParent());
		System.out.println("Absolute path: "+ file.getAbsolutePath());
		System.out.println("Absolute filepath: "+ file.getAbsoluteFile());
		try {
			System.out.println("canonical path: "+ file.getCanonicalPath());
			System.out.println("canonical filepath: "+ file.getCanonicalFile());
		} 
		catch (IOException e) { 
			e.printStackTrace();
		}
		
		FileWriter fr;
		try {
			fr = new FileWriter("C:\\mein-Studium\\3.Semester\\IGRU 2\\foo.txt");
			fr.write("mon fichier d'essai");
			String strg = fr.toString();
			fr.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println();
	}
	
}

package EinAusgabe;

import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.File;
import java.io.Reader;
import java.io.FileReader;
import java.io.Writer;
import java.io.StringWriter;
import java.io.IOException;

public class EntreeSortie {

	public static void main(String[] args)
	{
		try {
//__________________ByteArrayInputStream_________________
			//byte[] tab = {67, 34, 97, 100, 93, 90};
//			String str = "Hello la famille je m'appelle Brandel";
//			
//			byte[] arr = str.getBytes();
//			
//			ByteArrayInputStream bt = new ByteArrayInputStream(arr);
//			int b = bt.read();
//			while(b != -1)
//			{
//				char ch = (char)b;
//				System.out.print("code ascii " + b + " ---> char : " + ch);
//				System.out.println("   encore " + bt.available() + " char dispo");
//				b = bt.read();
//			}
//		
//			bt.close();
			
//____________________FileInputStream___________________
			File file = new File("../hello.txt");
			file.createNewFile();
			System.out.println("il existe ? \""+ file.exists() + "\nle chemin simple est: "+ file.getPath()+ "\"\nle chemin absolut est: " + file.getAbsolutePath() + "\nle chemin canonique est: " + file.getCanonicalPath());
			//permet_juste de_spécifier le_nom (chemin_vers_le) du_fichier
			
//			if(file.createNewFile()) { //methode pour creer le fichier
//				System.out.println("we have a new File: "+ file.getName());
//			}else {
//				System.out.println(file.getCanonicalFile() +" already exists");
//			}
//			
			//file.delete(); pour supprimmer le fichier
			FileOutputStream fout = new FileOutputStream(file);
			String s = "Hello World !";
			byte[] byt = s.getBytes();
//			for(int i =0; i<s.length(); i++)
//			{											ALTERNATIVE !!!!
//				fout.write((byte)s.charAt(i));
//			}
			fout.write(byt);
			fout.close();
			
			FileInputStream fin = new FileInputStream(file);
			int k = fin.read();
			while(k != -1)
			{
				System.out.print((char)k );
				k = fin.read();
			}
			fin.close();
			
//________________Text-I/O_______________
			System.out.println("\n\n--------------Writer/reader---------------\n----------FileWriter/FileReader-----------");
			Writer wt = new FileWriter("hey.txt");
			wt.write(s);
			wt.write(" FileWriter");
			wt.close();
			
			//lisons mtn le content avec FileReader
			System.out.println();
			Reader rdr = new FileReader("hey.txt");
			int x = rdr.read();
			while(x != -1)
			{
				System.out.print((char)x+" ");
				x = rdr.read();
			}
			rdr.close();
			
			System.out.println("\n\n" + file.canRead()+ "\n"+ file.canWrite()+"\n"+ file.lastModified());
			System.out.println("parent: " + file.getParent());
			System.out.println("file name: "+ file.getName());
			System.out.println("absolut path: " + file.getAbsolutePath());
			System.out.println("canonic path: " + file.getCanonicalPath());
			
			
			System.out.println("\n\n\n---------------------StringWriter------------------");
			StringWriter sw = new StringWriter();
			sw.write(s);
			sw.write(" new !");
			String str = sw.toString();
			System.out.println(str);
			
			
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

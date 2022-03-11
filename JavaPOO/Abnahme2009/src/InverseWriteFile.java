import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class InverseWriteFile 
{
	//method to reverse a string
	public static String inverseString(String string) {
		String resultString = ""; 
		for (int i=string.length()-1; i>=0; i--) 
			resultString += string.charAt(i);  
		
		return resultString;	
	}
	
	public void inFile(File fromFile, File toFile)
	{	
		
		//read the first file
		BufferedReader br = null ;
		String line ="";
		String content ="";
		

		BufferedWriter bw = null;
		try 
		{
			FileReader fr = new FileReader(fromFile);
			FileWriter fw = new FileWriter(toFile);
			br = new BufferedReader(fr);
			bw = new BufferedWriter(fw);
			while ( (line = br.readLine()) != null ) {
				content += inverseString(line) ;
				//write in second file
				bw.write(content);
				bw.newLine();
			}
		} catch (FileNotFoundException e) {
			System.err.println("we can't find the file" + fromFile.getName());
		}catch (IOException e) {
			System.err.println("we can't read the file" + fromFile.getName());
		}

//		try {
//			bw.close();
//			br.close();
//		} catch (IOException e) { 
//			e.printStackTrace();
//		}
		try {
			br.close();
			bw.close();
		} catch (NullPointerException e) {
			e.printStackTrace();
		} catch (IOException e) { 
			e.printStackTrace();
		}
		 		
	}
	
	public static void main(String[] args)
	{ 
		InverseWriteFile obj = new InverseWriteFile();  
		obj.inFile(new File("fromFile.txt"), new File("toMaja.txt")); 		
	}

}

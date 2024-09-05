package practice_package;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Filehandling {
	
	public void readData() throws IOException
	{	
		File f = new File("../Practice/test.txt");
		FileReader fr = new FileReader(f);
		int a;
		while((a=fr.read())!=-1)
		{
			System.out.println((char)a);
		}
		fr.close();
	}
	
	public static void main(String[] args) throws IOException 
	{
		Filehandling f = new Filehandling();
		f.readData();
	}
}
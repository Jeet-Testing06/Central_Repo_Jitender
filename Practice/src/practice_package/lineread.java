package practice_package;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class lineread {
	
	public void readData() throws IOException
	{	
		File f = new File("../Practice/test.txt");
		FileReader fr = new FileReader(f);
		BufferedReader b = new BufferedReader(fr);
		String s;
		while((s=b.readLine())!=null)
		{
			System.out.println(s);
		}
		b.close();
	}
	
	public static void main(String[] args) throws IOException 
	{
		lineread lr = new lineread();
		lr.readData();
	}
}
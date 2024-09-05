package practice_package;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class linewrite {
	
	public void writeData() throws IOException
	{	
		File f = new File("../Practice/test1.txt");
		FileWriter fw = new FileWriter(f);
		fw.write("First line");
		fw.close();
	}
	
	public static void main(String[] args) throws IOException 
	{
		linewrite lr = new linewrite();
		lr.writeData();
	}
}
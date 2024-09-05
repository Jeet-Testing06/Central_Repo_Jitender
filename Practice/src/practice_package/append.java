package practice_package;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class append {
	
	public void writeData() throws IOException
	{	
		File f = new File("../Practice/test2.txt");
		FileWriter fw = new FileWriter(f, true);
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write("append line");
		bw.close();
	}
	
	public static void main(String[] args) throws IOException 
	{
		append lr = new append();
		lr.writeData();
	}
}
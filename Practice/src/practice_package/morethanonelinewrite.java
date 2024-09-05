package practice_package;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class morethanonelinewrite {
	
	public void writeData() throws IOException
	{	
		File f = new File("../Practice/test2.txt");
		FileWriter fw = new FileWriter(f);
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write("First line");
		bw.newLine();
		bw.write("Second line");
		bw.newLine();
		for (int i=3;i<=10;i++)
		{
			bw.write("third to tenth line using for loop");
			bw.newLine();
		}
		
		bw.close();
	}
	
	public static void main(String[] args) throws IOException 
	{
		morethanonelinewrite lr = new morethanonelinewrite();
		lr.writeData();
	}
}
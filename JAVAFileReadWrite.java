/*
@Author: Pranta Sarker
*/

import java.util.*;
import java.io.*;

class code
{
	public static void main(String [] args)
	{
		try
		{
			File flin = new File("input_file.txt");
			File flout = new File("output_file.txt");
			FileWriter fwriter = new FileWriter(flout);
			FileReader freader = new FileReader(flin);
			BufferedReader br = new BufferedReader(freader);
			String str = "";
			str = br.readLine();
			fwriter.write(str);
			br.close();
			fwriter.close();
			
		}catch(IOException ex)
		{
			System.out.println("File not found !");
		}
	}
}

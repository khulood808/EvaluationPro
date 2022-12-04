package evaluation;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;



public class Ev2 {
	
	public static void main(String[] args) throws IOException {
		File f= new File ("eval.txt");
		String[] wd= null;
		FileReader fr = new FileReader(f);
		BufferedReader br= new BufferedReader(fr);
		String s;
		String input="Java";
		int count=0;
		while((s=br.readLine())!=null)
		{
			
			wd=s.split(" ");
			for(String words: wd) 
					{
				if(words.equals(input))
				{
					count++;
				}
					}
		}
		if (count!=0) 
		{
			System.out.println("Present" +count+ "Times in file");
		}
		else 
		{
			System.out.println("Not Present");
		}
		fr.close();
	}
}
= new FileReader(sc1);
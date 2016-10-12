
import java.util.*;
import java.io.*;
import java.lang.*;

class HashSyn{

public static void main(String[] args) throws IOException
	{
		System.out.println("Enter word: ");
		Scanner scanner = new Scanner(System.in);
		String inWord = scanner.nextLine();

		Scanner inFile = new Scanner(new File("Dictionary.txt"));
		HashMap<String,String>	rec = new HashMap<String,String>();
		boolean flag = false;
		
		while(inFile.hasNextLine())
		{
			String line =  inFile.nextLine();
			String[] words = line.split(" ");
			rec.put(words[0], line);
			
			Scanner buff = new Scanner(line);
			while(buff.hasNext())
			{
				if(buff.next().contains(inWord))
				{
					System.out.println("Synonym of "
					+rec.get(words[0]));
					flag=true;
					break;
				}
			}
		}
		if(!flag)
		{
			System.out.println(inWord+" not in Dictionary" );
			
		}
		
	}

}
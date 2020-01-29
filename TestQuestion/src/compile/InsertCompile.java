package compile;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import tools.InsertFile;

public class InsertCompile
{
	//Reading the q1Compile.java file
	public static ArrayList<String> questionFile = new ArrayList<String>();

	public static void run(String filePath) throws IOException
	{ 	
		try
		{
			File file=new File(filePath);    //creates a new file instance  
			FileReader fr=new FileReader(file);   //reads the file  
			
			BufferedReader br=new BufferedReader(fr);  //creates a buffering character input stream 
			
			String line; 
			
			while((line=br.readLine())!=null)  
			{  

				questionFile.add(line);      //appends line to string buffer
			} 
			
			fr.close();    //closes the stream and release the resources
		}
		catch(IOException e) 
		{  
			e.printStackTrace();  
		}
	
		//exception handling and 
		//setting userInput String to Compile file
		if(commentLineIndex() == 666)
		{
			System.out.println("error not proceeding");
		}
		else
		{
			questionFile.set(commentLineIndex(), InsertFile.outputString);
			FileWriter writer = new FileWriter("q1Compile.java");             
			for(String str: questionFile)                                                                      
			{
				writer.write(str + System.lineSeparator());
			}
			writer.close();
			System.out.println("Writing Complete");
		}

		//questionFile ArrayList
		for(int i = 0; i < questionFile.size(); i++)
		{
			System.out.println("ArrayNumber: " + i + ":" + questionFile.get(i));
		}			
	}
	
	private static int commentLineIndex()	
	{
		int lineNumber = 666;
		
		for(int i = 0; i < questionFile.size(); i++)
		{
			if(questionFile.get(i).contains("/*"))
			{
				lineNumber = i;
			}
		}
		return lineNumber;
	}
}
package tools;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class ReadFile {
	//ArrayList of file content
	public static ArrayList<String> ar = new ArrayList<String>();

	public static ArrayList<String> run(String filePath)
	{ 	
		try
		{
			File file=new File(filePath);    //creates a new file instance  
			FileReader fr=new FileReader(file);   //reads the file  
			
			BufferedReader br=new BufferedReader(fr);  //creates a buffering character input stream 
			
			String line; 
			
			while((line=br.readLine())!=null)  
			{  
				ar.add(line);      //appends line to string buffer
			} 
			
			fr.close();    //closes the stream and release the resources
		}
		catch(IOException e) 
		{  
			e.printStackTrace();  
		}
		return ar;  
		
	}
	
	
	//Dealing with just code arrayList now. The question doesn't matter anymore
	
	private static int commentLineIndex = 0; 
	
	public static int getCommentLineIndex()
	{
		return commentLineIndex;
	}
	
	//returns String line in which comment occurs
	public static String commentLine()
	{
		String x = "";
		for (int i = 0; i < DisplayFile.codeContent.size(); i++)
		{
			if(DisplayFile.codeContent.get(i).contains("/*"))
			{
				x = DisplayFile.codeContent.get(i);
				commentLineIndex = i;
			}
		}
		return x;
	}
	
	//Used by InsertFile only
	public static int commentInt(ArrayList<String> s) 
	{
		int x = 0;
		for (int i = 0; i < s.size(); i++)
		{
			if(s.get(i).contains("/*"))
			{
				x = i;
			}
		}
		
		return x;
	}
	
	//returns size of the ArrayList
	/*
	public static int arrayListSize()
	{
		int size = ar.size();
		return size;
	}
	*/
}

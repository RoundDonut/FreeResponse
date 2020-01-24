package tools;

import java.util.ArrayList;

public class DisplayFile {
	
	public static ArrayList<String> questionContent = new ArrayList<String>();
	public static ArrayList<String> codeContent = new ArrayList<String>();
	
	public static void question()
	{
		questionContent = ReadFile.run("/Users/1901209/Desktop/FreeResponse/TestQuestion/src/tools/q1question.txt");
		//Displaying file content from ReadFile ArrayList
		for(int i = 0; i < questionContent.size(); i++)
		{
			System.out.println(questionContent.get(i));
		}
		ReadFile.ar.clear(); //clearing ArrayList in ReadFile for reading another file 
	}
	public static void code()
	{	
		codeContent = ReadFile.run("/Users/1901209/Desktop/FreeResponse/TestQuestion/src/tools/q1code.txt");
		//Displaying file content from ReadFile ArrayList
		for(int i = 0; i < codeContent.size(); i++)
		{
			System.out.println(codeContent.get(i));
		}
	}
}

package tools;

import java.util.ArrayList;
import java.util.StringTokenizer;

/* This class adds the userInput to the ArrayList codeContent (of DisplayFile class)
 * which is then used by InsertCompile to write it to compile file.
 */
public class InsertFile {
	
	public static String outputString = "";
	
	public static void insert(String input)
	{
		//Token commented line
		String commentString = ReadFile.commentLine();
		StringTokenizer st1 = new StringTokenizer(commentString, "(" + ")", true);
		
		//ArrayList
		ArrayList<String> outputArray = new ArrayList<String>();
		
		//Assigning token to ArrayList
		while(st1.hasMoreTokens())
		{
			outputArray.add(st1.nextToken());
		}
		
		//Checking ArrayList index that contains target string
		int commentArrayIndex = 0;
		
		for(int i = 0; i < outputArray.size(); i++)
		{
			if(outputArray.get(i).contains("/*"))
			{
				commentArrayIndex = i; 
			}
		}
		
		//Replacing target string with userInput
		outputArray.set(commentArrayIndex, input);
		
		//Turning ArrayList into a string
		StringBuffer sb = new StringBuffer();
		for(String s: outputArray)
		{
			sb.append(s);
		}
		
		outputString = sb.toString();
		System.out.println("String:" + outputString);
		
		/*
		 * Replacing commented Line with outputString in original file ArrayList(codeContent) 
		 * 	DisplayFile.codeContent.set(ReadFile.getCommentLineIndex(), outputString);
		 */
		
		//Writing new ArrayList to NEW file 
		/*
		FileWriter writer = new FileWriter("C:/Users/Shan/Desktop/TestQuestion/src/tools/q1compile.txt");
		for(String str: DisplayFile.codeContent)
		{
			writer.write(str + System.lineSeparator());
		}
		writer.close();
		*/
	}
}

package general;

import java.io.File;
import java.io.IOException;
import java.net.URL;

import tools.*;
import compile.*;

public class Main 
{
	public static String q1codeURL = "";
	public static String q1questionURL = "";
	public static String q1tempURL = "";
	
	private static String getURL(String x)
	{
		URL url = Main.class.getResource(x);
		return url.toString();
	}
	
	public static void main(String[] args) 
	{
		//File path of q1code and q1question
		q1codeURL = Main.getURL("q1code.txt"); //URL has file: in String
		q1questionURL = Main.getURL("q1question.txt");
		q1tempURL = Main.getURL("q1Compile.java.temp");
	
		
		DisplayFile.question();
		System.out.println(); //for better formatting
		DisplayFile.code();
		
		System.out.println();
		System.out.println();
		System.out.println("Reponse (empty line below):---------------------------");
		
		String userInput = ConsoleIO.inputString();
		System.out.println(userInput);
		System.out.println("test");
		
		System.out.println("------------------------------------------------------");
		
		InsertFile.insert(userInput); //passing userInput to InsertFile
		try {
			InsertCompile.run(q1tempURL);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		CompileRun.run();
		
		
		/*
		File f = new File("/Users/1901209/Desktop/FreeResponse/TestQuestion/src/compile/q1Compile.java");
		f.delete();
		*/
				
	}
}


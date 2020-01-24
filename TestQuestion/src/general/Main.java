package general;

import java.io.File;
import java.io.IOException;

import tools.*;
import compile.*;

public class Main 
{
	public static void main(String[] args) throws IOException
	{
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
		InsertCompile.run("/Users/1901209/Desktop/FreeResponse/TestQuestion/src/compile/q1Compile.java.temp");
		
		CompileRun.run();
		
		/*
		File f = new File("/Users/1901209/Desktop/FreeResponse/TestQuestion/src/compile/q1Compile.java");
		f.delete();
		*/
				
	}
}


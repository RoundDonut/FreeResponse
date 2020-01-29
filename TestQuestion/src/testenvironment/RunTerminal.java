package testenvironment;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RunTerminal {
	public static void main(String[] args) {

		String command = "ping -c 3 www.google.com";

		try
		{
        Process proc = Runtime.getRuntime().exec(command);

        // Read the output

        BufferedReader reader =  
              new BufferedReader(new InputStreamReader(proc.getInputStream()));

        String line = "";
        while((line = reader.readLine()) != null) {
            System.out.print(line + "\n");
        }

        proc.waitFor();   
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

    }
}

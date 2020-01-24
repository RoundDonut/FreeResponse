package compile;

public class CompileRun {
	public static void run()
	{
		try 
		{
			//ERROR HERE
			int correctAnswer = q1Compile.numDivisors(10);
			System.out.println("Running try");
			//System.out.println("Correct Answer:" + correctAnswer);
			
			if(correctAnswer == 4)
			{
				System.out.println("CORRECT ANSWER");
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
			System.out.println("INCORRECT ANSWER");
		}
	}
}

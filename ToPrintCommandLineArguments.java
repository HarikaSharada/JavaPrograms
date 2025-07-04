package Java_Practice;

public class ToPrintCommandLineArguments {

	public static void main(String[] args) {
		
		if(args.length > 0)
		{
			for(Object a:args)
			{
				System.out.println(a);
			}
		}
		
		else
		  {
			System.out.println("No arguments are available");
		  }
		}

	}



public class Hello
{
	public static main( String argv[] )
	{
		// Hello! I am making a new comment
		String name = "World";
		if (argv.length !=0)
		{
			name = argv[0];
		}
		
		System.out.println( "Hello, " + argv[0] + "!");
	}
}
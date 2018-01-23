
public class ThrowsException {

	public static void main(String[] args) throws Exception  {
		// TODO Auto-generated method stub
doStuff();
	}

	public static void doStuff() throws Exception 
	{
		doMoreStuff();
	}
	public static void doMoreStuff() throws Exception 
	{
		throw new Exception();
	}
}

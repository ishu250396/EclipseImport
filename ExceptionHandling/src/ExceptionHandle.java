
public class ExceptionHandle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String value=null;
		try
		{
			try
			{
				System.out.println(5/0);
			}catch(ArithmeticException e)
			{
				System.out.println("IndexOutOfBoundsException");
			}
		}catch(IndexOutOfBoundsException e)
		{
			System.out.println("ArithmeticException");
			e.printStackTrace();
			e.getMessage();
			
		}
	}

}

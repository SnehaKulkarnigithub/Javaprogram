package FinallyBlock;

public class Sample5 {

	public static void main(String[] args) {
		try
		{
			System.out.println("Inside try block");
			System.out.println(10/0);
		}
		finally
		{
			System.out.println("Inside finally Block");
		}

	}

}

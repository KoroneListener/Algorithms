package Fibonacci;
import java.io.*;

public class TestFibo {
	public static int fibonacci(int n) throws ErrorFibo {
		if (n<0) throw new ErrorFibo();
		
		if((n == 0 ) || (n==1))
			return n;
		else
			return fibonacci (n-1) + fibonacci(n-2);
	}
	
	public static void main(String arg[]) {
		try {
			BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
			int number = 1;
			
			System.out.println();
			System.out.println("----- FIBONACCI -----");
			System.out.println("----- recursive version -----");
			System.out.println();
			
			System.out.println("Enter a positif or null number: ");
			number = Integer.valueOf(in.readLine()).intValue();
			
			System.out.println("The fibonacci number is : " + fibonacci(number));
		}
		
		catch (ErrorFibo e) {
			System.out.println(e.getMessage());
		}
		catch (Exception e) {
			System.out.println(e.toString());
		}
	}

}

package pack;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCATCH {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		try {
			System.out.println(s.nextInt()/s.nextInt());
		}
		catch(InputMismatchException e){
			System.out.println(e.getClass().toString().substring(6));
		}
		catch(Exception e)
		{
			System.out.println(e.getClass().toString().substring(6));
		}
	}
	
	

}

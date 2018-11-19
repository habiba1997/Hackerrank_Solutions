package pack;
import java.util.*;

interface AdvancedArithmetic{
		  int divisor_sum(int n);
		}
class MyCalculator implements AdvancedArithmetic 
{
	public int divisor_sum(int n)
	{
		int sum;
		if ( n==1) sum = 1;
		else 
		{
			sum =1 + n;
			for(int i =2 ; i < n-1; i++)
			{
				if (n % i ==0 ) sum+=i;
			}
		}
		return sum;
	}
}
public class interfaces1 {
		    public static void main(String []args){
			        MyCalculator my_calculator = new MyCalculator();
			        System.out.print("I implemented: ");
			        Scanner sc = new Scanner(System.in);
			        int n = sc.nextInt();
			        System.out.print(my_calculator.divisor_sum(n) + "\n");
			      	sc.close();
		    }
}

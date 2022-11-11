import java.lang.*;

public class ArrayDemo
{
	public static void main(String args[])
	{
		int []A = new int [5];
		
		A[0] = 10;
		A[1] = 20;
		A[3] = 60;
		
		for(int i=0; i<A.length; i++)
		{
			System.out.println("A["+i+"] : "+A[i]);		
		}
		for(int value : A)
		{
			System.out.println(value);
		}
		
		int B[];
		int x = A[3] / A[0];
		B = new int [x];
		
		for(int value : B)
		{
			System.out.println(value);
		}
		
		int C[] = new int []{1,2,3};
		
		for(int i=0; i<C.length; i++)
		{
			System.out.println("C["+i+"] : "+C[i]);
			
		}
		
		int D[] = {1,2,3,4};
		
		int index = 0;
		
		while(index<D.length)
		{
			System.out.println(D[index]);
			index++;
		}
		
	}
}
package day6;

import java.util.Arrays;

// sorting 
// wap to sort an array using bubble sort 
public class SortingExample {

	public static void main(String[] args) 
	{
		 
		int k[]= {123,3563,523,45,56,6,3,65,23};
		
		
		int temp;
		
		//from line 18 to 30 two loops are used to sort array elements 
		for(int j=0;j<k.length-1;j++)
		{
		for(int i=0;i<k.length-1-j;i++)
		{
			if(k [i] >k[i+1])
			{
				temp= k[i];
				k[i]=k[i+1];
				k[i+1]=temp;
			}
		
		}
		}

		 
		//loop at line 34 is for printing sorted data 
		for(int b:k) System.out.print( "   " + b);
	}

}

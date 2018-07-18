package binarySearch;

import java.util.Scanner;

public class BinarySearch 
{
	public static void main(String[] args) 
	{
		int a[]= {2,6,13,21,36,47,63,81,97};
		int start=0;
		int end=a.length-1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value you want to find");
		int x=sc.nextInt();
		int i=isBinarySearch(a,x,start,end);
		if(i==-1)
			System.out.println("The number is not present");
		else
			System.out.println("The number is present");
	}

	private static int isBinarySearch(int[] a, int x, int start, int end) 
	{
		while(start<=end)
		{
		int mid=(start+end)/2;
		if(a[mid]==x) 
		{
			return mid;
		}
		else if(x<a[mid])
			return isBinarySearch(a, x, start, mid-1);
		else
		return isBinarySearch(a, x,  mid+1, end) ;
		}
		return -1;
		
	}

}

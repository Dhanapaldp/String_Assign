package assignment4;

import java.util.Scanner;

public class MaxOccur {

	static char findMaxOccur(String s1)
	{
		int[] character=new int[256];
		int max=-1;
		char res =' ';
		for(int i=0;i<s1.length();i++)
		{
			character[s1.charAt(i)]++;
		}
		for(int i=0;i<s1.length();i++)
		{
			if(max<character[s1.charAt(i)])
			{
				max=character[s1.charAt(i)];
				res=s1.charAt(i);
			}
		}
		return res;
	}

	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the String....");
		String inp=s.nextLine();
		System.out.println("Maximum Occuring character is  "+findMaxOccur(inp));

	}
}



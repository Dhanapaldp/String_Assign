package assignment4;

import java.util.Scanner;

public class UniqueChar {
	static boolean findUnique(String s1)
	{
		for(int i=0;i<s1.length()-1;i++)
		{
			for(int j=i+1;j<s1.length();j++)
			{
				if(s1.charAt(i)==s1.charAt(j))
				{
					return false;
				}
			}
		}
		return true;
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the String....");
		String input=s.nextLine();
		if(findUnique(input))
		{
			System.out.println("The string has unique characters");
		}
		else
		{
			System.out.println("The string has duplicate characters");
		}
		
	}

}

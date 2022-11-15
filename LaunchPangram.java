package assignment4;

import java.util.Scanner;

public class LaunchPangram {
	public static void main (String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the String....");
		String s1=s.nextLine();
		String s2="";
		s1=s1.replace(" ","");
		for(int i=0;i<s1.length();i++)
		{
			if(s1.charAt(i)>=65 && s1.charAt(i)<=90)
			{
				s2=s2+(char)(s1.charAt(i)+32);
			}
			else if(s1.charAt(i)>=97 && s1.charAt(i)<=122)
			s2+=s1.charAt(i);
	    }
		int alpha[]=new int [26];
		int index,count=0;
		char[] ch=s2.toCharArray();
		for(int i=0;i< ch.length;i++)
		{
			index=(ch[i]-97);
			alpha[index]++;
		}
		for(int i=0;i<alpha.length;i++)
		{
			if(alpha[i]>0)
			{
				count++;
			}
		}
		if(count==alpha.length)
			System.out.println("Given string is pangram");
		else
			System.out.println("Given string is not pangram");
	}
}

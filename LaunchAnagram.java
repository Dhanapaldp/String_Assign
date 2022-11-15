package assignment4;

import java.util.Scanner;

public class LaunchAnagram {
	static void checkAnagram(char[] c1,char[] c2)
	{
		for(int i=0;i<c1.length-1;i++)
		{
			for(int j=i+1;j<c1.length;j++)
			{
				if(c1[i]>c1[j])
				{
					char temp=c1[i];
					c1[i]=c1[j];
					c1[j]=temp;
				}
			}
		}
		for(int i=0;i<c2.length-1;i++)
		{
			for(int j=i+1;j<c2.length;j++)
			{
				if(c2[i]>c2[j])
				{
					char temp=c2[i];
					c2[i]=c2[j];
					c2[j]=temp;
				}
			}
		}
		boolean check=false;
		for(int i=0;i<c1.length;i++)
		 {
			if(c1[i]!=c2[i])
			{
				check=true;
				System.out.println("Given string is not Anagram");
				break;
			}
		 }
		if(!check)
			System.out.println("Given string is Anagram");
	}

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the String1....");
		String s1=s.nextLine();
		System.out.println("Enter the String2....");
		String s2=s.nextLine();
		String s3="";
		String s4="";
		//If it has Space
		    s1=s1.replace(" ", "");
		    s2=s2.replace(" ", "");
		//In case in uppercase
		for(int i=0;i<s1.length();i++)
		{
			if(s1.charAt(i)>=65 && s1.charAt(i)<=90)
			{
				s3=s3+(char)(s1.charAt(i)+32);
			}
			else if(s1.charAt(i)>=97 && s1.charAt(i)<=122)
			s3+=s1.charAt(i);
		}
		for(int i=0;i<s2.length();i++)
		{
			if(s2.charAt(i)>=65 && s2.charAt(i)<=90)
			{
				s4=s4+(char)(s2.charAt(i)+32);
			}
			else if(s2.charAt(i)>=97 && s2.charAt(i)<=122)
			s4+=s2.charAt(i);
		}
		
		char ch1[]=s3.toCharArray();
		char ch2[]=s4.toCharArray();
		checkAnagram(ch1,ch2);
		
		

	}

}

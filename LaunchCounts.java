package assignment4;

import java.util.Scanner;

public class LaunchCounts {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the String....");
		String str=s.nextLine();
		int vowels=0,consonants=0;
		int specialCharacters=0;
		for(int i=0;i<str.length();i++)
		{
			char ch1=str.charAt(i);
			if((ch1>='a' && ch1<='z') || (ch1>='A' && ch1<='Z'))
			{
				if(ch1<='A' && ch1<='Z')
				{
					ch1=(char)(ch1-32);
				}
				if(ch1=='a' || ch1=='e' ||ch1=='i'|| ch1=='o'|| ch1=='u')
				{
					vowels++;
				}
				else
					consonants++;
			}
			else if(!(ch1>='0' && ch1<='9'))
				  specialCharacters++;
				
		}
		System.out.println("Vowels  "+vowels);
		System.out.println("Consonants  "+consonants);
		System.out.println("Special characters  "+specialCharacters);
		
         
	}

}

package com.alacriti;

import java.util.*;


public class App 
{   String first="rachana" ;
		String second="singh";
	 void substring() {
		System.out.println("the substring of first string from 3rd position is :"+first.substring(3));
	}
	 void stringupper() {
	
		System.out.println("The uppercase of " +first+" is: "+first.toUpperCase());
		
	}
	 void stringconcat() {
	
		System.out.println("The concatenation of first and second string is :"+first.concat(" "+second));
		
	}
	 void stringlength() {
		
		 System.out.println("The length of the first string is :"+first.length());
	     System.out.println("The length of the second string is :"+second.length());
	}
void stringlower() {
		
		  System.out.println("The lowercase of " +first+" is: "+first.toLowerCase());
	}

	
	
   public static void main(String[] args)
   {
	   System.out.println("main method");
     }
}
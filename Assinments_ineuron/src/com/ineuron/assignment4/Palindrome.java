package com.ineuron.assignment4;

import java.util.Scanner;

class Palindrome {

	public static void main(String args[]) {

		int r,sum=0,temp;  
		  
		//It is the number variable to be checked for palindrome 
		int n=2552; 
		  
		  temp=n;
		  while(n>0){    
		   r=n%10;  //getting remainder 
		   sum=(sum*10)+r; 
		   n=n/10;    
		  }    
		  if(temp==sum)    
		   System.out.println("palindrome number ");    
		  else    
		   System.out.println("not palindrome");    
	}
}
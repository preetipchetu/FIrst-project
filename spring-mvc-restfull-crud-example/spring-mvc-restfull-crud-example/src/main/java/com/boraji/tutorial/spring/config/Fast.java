package com.boraji.tutorial.spring.config;

import java.util.TreeMap;

public final class Fast{
	// Java program to reverse a string using recursion
	 
	    void reverse(String str)
	    {
	        if ((str==null)||(str.length() <= 1))
	           System.out.println(str);
	        else
	        {
	            System.out.print(str.charAt(str.length()-1));
	            reverse(str.substring(0,str.length()-1));
	        }
	    }
	     
	    /* Driver program to test above function */
	    public static void main(String[] args) 
	    {
	        String str = "Geeks for Geeks";
	        Fast obj = new Fast();
	        obj.reverse(str);
	    }    
	
}




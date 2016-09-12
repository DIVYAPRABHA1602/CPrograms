 

import java.util.*;
import java.lang.*;

import java.io.*;



class program
{
    
    public static String upperCaseAllFirst(String value)
 
   {
	char[] array = value.toCharArray();
	
	array[0] = Character.toUpperCase(array[0]);


	for (int i = 1; i < array.length; i++)

	{
	    if (Character.isWhitespace(array[i - 1])) 

	    {
		array[i] = Character.toUpperCase(array[i]);
	    }
	}

	
return new String(array);
    }

   
	public static void main (String[] args) throws java.lang.Exception
   
	{

	String value = "cat 123 456";
	String value2 = "one two three";

	
	String result = upperCaseAllFirst(value);

System.out.println(value);
	
System.out.println(result);

	
result = upperCaseAllFirst(value2);
	
System.out.println(value2);
	
System.out.println(result);
    }
}
		
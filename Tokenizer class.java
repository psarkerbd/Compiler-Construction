/*
 *@Author: Pranta Sarker
 **/
 
 import java.util.*;
 import java.io.*;
 
 class code
 {
 	public static void main (String[] args)
 	{
 		String str = "Hello world ! this world is beautiful.";
 		
 		StringTokenizer st = new StringTokenizer(str , " ");
 		
 		while(st.hasMoreTokens())
 		{
 			System.out.print("<" + st.nextToken() + ">");
 		}
 		
 		System.out.printf("\n");
 		
 		//st = new StringTokenizer(str , " " , false);
 		st = new StringTokenizer(str , "." , true);
 		
 		while(st.hasMoreTokens())
 		{
 			System.out.print("<" + st.nextToken()+ ">" );
 		}
 	}
 }

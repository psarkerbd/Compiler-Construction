/*
 *@Author: Pranta Sarker
 **/
 
 import java.util.*;
 import java.io.*;
 
 class ensureCapacity
 {
 	public static void main (String[] args)
 	{
 		StringBuilder sb = new StringBuilder();
 		
 		System.out.println("Defualt Capacity: " + sb.capacity());
 		
 		String str = "hello";
 		
 		//sb.append(str);
 		
 		sb.ensureCapacity(str.length());
 		
 		System.out.println("After adding " + " \" " + str + " \" " + " capacity: " + sb.capacity());
 		
 		String str2 = "world !";
 		
 		sb.ensureCapacity(str2.length());
 		System.out.println("After adding " + " \" " + str2 + "\"" + " capacity: " + sb.capacity());
 		
 		String str3 = "this world is so beautiful.";
 		
 		sb.ensureCapacity(str3.length());
 		System.out.println("After adding " + " \" " + str3 + "\"" + " capacity: " + sb.capacity());
 	}
 }

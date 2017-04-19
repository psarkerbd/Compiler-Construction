/*
 *@Author: Pranta Sarker
 **/
 
 import java.util.*;
 import java.io.*;
 
 class code
 {
 	public static void main (String[] args)
 	{
 		String str = "Hello world ! this world is beautiful";
 		
 		//System.out.println("Length: " + str.length());
 		
 		StringBuilder Msb = new StringBuilder(str);
 		StringBuilder Tsb = new StringBuilder(str);
 		
 		System.out.println("Defult Capacity: " + Msb.capacity());
 		
 		Msb.append(str);
 		
 		String apnd = " ! And this world so high.";
 		Tsb.append(apnd);
 		//System.out.println("Length(apnd): " + apnd.length());
 		System.out.println(Tsb);
 		
 		Tsb.delete(0, 14);
 		//System.out.println("Legnth(Tsb): " + Tsb.length());
 		System.out.println(Tsb);
 		
 		Tsb.replace(0, 4 , "This");
 		System.out.println(Tsb);
 		
 		Tsb.delete(23, 25);
 		Tsb.delete(27 , 38);
 		System.out.println(Tsb);
 		
 		Tsb.replace(24, 27, "and");
 		System.out.println(Tsb);
 		
 		Tsb.delete(4 , 10);
 		Tsb.insert(8 , "the ");
 		Tsb.insert(12 , "most ");
 		Tsb.replace(27 , 39, "world.");
 		System.out.println(Tsb);
 		
 		Tsb.reverse();
 		System.out.println(Tsb);
 		
 		System.out.println("Previous Capacity = " + Msb.capacity()); // capacity = 53
 		Msb.append(Tsb);
 		//System.out.println(Msb);
 		System.out.println("Current Capacity = " + Msb.capacity()); // capacity = (53 * 2) + 2 = 108
 	}
 }
